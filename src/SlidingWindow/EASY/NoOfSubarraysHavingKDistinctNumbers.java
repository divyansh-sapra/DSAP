package SlidingWindow.EASY;

import java.util.HashMap;

public class NoOfSubarraysHavingKDistinctNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        int l = 0;
        int res = 0;
        int res1 = 0;
        int len = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < len; right++) {
            //expand
            hashMap.put(arr[right], hashMap.getOrDefault(arr[right], 0) + 1);
            //shrink
            while (hashMap.size() > k) {
                if (hashMap.containsKey(arr[l])) {
                    hashMap.put(arr[l], hashMap.get(arr[l]) - 1);
                    if (hashMap.get(arr[l]) == 0) {
                        hashMap.remove(arr[l]);
                    }
                }
                l++;
            }
            res += right - l + 1;
        }
        l = 0;
        k--;
        hashMap.clear();
        for (int right = 0; right < len; right++) {
            //expand
            hashMap.put(arr[right], hashMap.getOrDefault(arr[right], 0) + 1);
            //shrink
            while (hashMap.size() > k) {
                if (hashMap.containsKey(arr[l])) {
                    hashMap.put(arr[l], hashMap.get(arr[l]) - 1);
                    if (hashMap.get(arr[l]) == 0) {
                        hashMap.remove(arr[l]);
                    }
                }
                l++;
            }
            res1 += right - l + 1;
        }
        System.out.println(res - res1);
    }
}
