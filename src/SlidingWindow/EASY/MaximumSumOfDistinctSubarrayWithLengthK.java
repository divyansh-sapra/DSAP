package SlidingWindow.EASY;

import java.util.HashMap;

public class MaximumSumOfDistinctSubarrayWithLengthK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        int len = arr.length;
        int l = 0;
        int res = 0;
        int sum = 0;
        int k = 3;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < len; right++) {
            sum += arr[right];
            hashMap.put(arr[right], hashMap.getOrDefault(arr[right], 0) + 1);
            if (right - l + 1 == k) {
                if (hashMap.size() == k) { //get answer
                    res = Math.max(res, sum);
                } //remove left
                if (hashMap.containsKey(arr[l])) {
                    hashMap.put(arr[l], hashMap.get(arr[l]) - 1);
                    if (hashMap.get(arr[l]) == 0) {
                        hashMap.remove(arr[l]);
                    }
                }
                sum -= arr[l];
                l++;
            }
        }
        System.out.println("Res:" + res);
    }
}
