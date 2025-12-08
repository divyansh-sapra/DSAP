package SlidingWindow.EASY;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int len = arr.length;
        int l = 0;
        int sum = 0;
        int res = 0;
        for (int right = 0; right < len; right++) {
            sum += arr[right];
            if (right - l + 1 == k) {
                res = Math.max(res, sum);
                sum -= arr[l];
                l++;
            }
        }
        System.out.println("Result: " + res);
    }
}
