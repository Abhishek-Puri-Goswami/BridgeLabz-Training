package com.queues.slidingwindowmaximum;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindow.findMaxInWindows(arr, k);

        System.out.println("Sliding Window Maximums:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
