import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStudent {
    public static void main(String[] args) {
        PriorityQueue<Student> queue=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1,Student s2){
                return Integer.compare(s1.rank, s2.rank);
            }
        }.reversed());
        queue.add(new Student(534, "Jayesh"));
        queue.add(new Student(94, "ramesh"));
        queue.add(new Student(5324, "karan"));
        queue.add(new Student(574, "jsdkfjash"));
        queue.add(new Student(54, "sjdn"));
        queue.add(new Student(554, "rashksjd"));
        while(!queue.isEmpty()){
            System.out.println(queue.peek()+" ");
            queue.remove();
        }
    }
    public static class Student {
        int rank;
        String name;
        Student(int rank,String name){
            this.rank=rank;
            this.name=name;
        }
        // @Override
        // public int compareTo(Student s){
        //     return this.rank-s.rank;
        // }
        @Override
        public String toString() {
            return "Student [rank=" + rank + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()="
                    + hashCode() + ", toString()=" + super.toString() + "]";
        }
        
    }
}
