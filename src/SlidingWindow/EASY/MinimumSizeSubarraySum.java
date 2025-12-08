package SlidingWindow.EASY;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int r = 0;
        int l = 0;
        int len = arr.length;
        int sum = 0;
        int res = len;
        while (r < len && l < len) {
            sum += arr[r];
            while (sum >= k && l <= r) {
                res = Math.min(res, r - l + 1);
                sum -= arr[l];
                l++;
            }
            r++;
        }
        System.out.println("Res:" + res);
    }
}
