import java.util.Scanner;

public class LC0056_MergeIntervals {

    // Merges overlapping intervals
    public int[][] merge(int[][] intervals) {

        // Sort intervals by start time (simple bubble sort)
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    int temp1 = intervals[i][0];
                    int temp2 = intervals[i][1];
                    intervals[i][0] = intervals[j][0];
                    intervals[i][1] = intervals[j][1];
                    intervals[j][0] = temp1;
                    intervals[j][1] = temp2;
                }
            }
        }

        int[][] temp = new int[intervals.length][2];
        int index = 0;

        // Start with first interval
        temp[index][0] = intervals[0][0];
        temp[index][1] = intervals[0][1];

        // Merge intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= temp[index][1]) {
                temp[index][1] = Math.max(temp[index][1], intervals[i][1]);
            } else {
                index++;
                temp[index][0] = intervals[i][0];
                temp[index][1] = intervals[i][1];
            }
        }

        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0056_MergeIntervals sol = new LC0056_MergeIntervals();

        System.out.print("Enter number of intervals: ");
        int n = input.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = input.nextInt();
            intervals[i][1] = input.nextInt();
        }

        int[][] result = sol.merge(intervals);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

        input.close();
    }
}
