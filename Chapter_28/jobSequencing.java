import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {
    public static void main(String[] args) {
        List<Job> list = new ArrayList<>();
        list.add(new Job(4, 20, "A"));
        list.add(new Job(1, 10, "B"));
        list.add(new Job(1, 40, "C"));
        list.add(new Job(1, 30, "D"));
        System.out.println(findProfit(list));
        System.out.println(findProfit2(list));

    }

    public static int findProfit(List<Job> list) {
        Collections.sort(list, (a, b) -> Integer.compare(b.profit, a.profit));
        ArrayList<String> seq = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;
        for (int i = 0; i < list.size(); i++) {
            if (time < list.get(i).deadLineTime) {
                time++;
                maxProfit += list.get(i).profit;
                seq.add(list.get(i).name);
            }
        }
        System.out.print("Job Sequence is : ");
        for (String s : seq) {
            System.out.print(s + " ");
        }
        System.out.print("\nMax Profit is ");
        return maxProfit;

    }

    public static int findProfit2(List<Job> list) {
        Collections.sort(list, (a, b) -> Integer.compare(b.profit, a.profit));
        int maxDeadLine = 0;
        for (Job job : list) {
            maxDeadLine = Math.max(maxDeadLine, job.deadLineTime);
        }

        boolean slot[] = new boolean[maxDeadLine + 1];
        String seq[] = new String[maxDeadLine + 1];
        int maxProfit = 0;
        for (Job job : list) {
            for (int j = Math.min(maxDeadLine, job.deadLineTime); j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    maxProfit += job.profit;
                    seq[j] = job.name;
                    break;
                }
            }
        }

        System.out.print("Job Sequence is : ");
        for (String s : seq) {
            System.out.print((s != null) ? s + " " : "");
        }
        System.out.print("\nMax Profit is ");
        return maxProfit;

    }
}

class Job {
    int deadLineTime;
    int profit;
    String name;

    public Job(int deadLineTime, int profit, String name) {
        this.deadLineTime = deadLineTime;
        this.profit = profit;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Job [deadLineTime=" + deadLineTime + ", profit=" + profit + ", name=" + name + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
