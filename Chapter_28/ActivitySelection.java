public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        System.out.println(maxSelection(start, end));
    }

    public static int maxSelection(int start[], int end[]) {
        int n = start.length;
        
        // Initial count of activities and the end time of the last selected activity
        int count = 1;
        int lastEndTime = end[0];

        // Select activities starting from the second one
        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEndTime) {
                count++;
                lastEndTime = end[i];
            }
        }

        return count;
    }
}
