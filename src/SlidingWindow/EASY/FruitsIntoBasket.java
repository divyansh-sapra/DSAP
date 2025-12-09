package SlidingWindow.EASY;

import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2};
        int res = 0;
        int len = arr.length;
        int l = 0;
        int k = 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < len; right++) {
            hashMap.put(arr[right], hashMap.containsKey(arr[right]) ? hashMap.get(arr[right]) + 1 : 1);
            while (hashMap.size() > k && l < right) {
                if (hashMap.containsKey(arr[l])) {
                    hashMap.put(arr[l], hashMap.get(arr[l]) - 1);
                    if (hashMap.get(arr[l]) == 0) {
                        hashMap.remove(arr[l]);
                    }
                }
                l++;
            }
            res = Math.max(res, right - l + 1);
        }
        System.out.println(res);
    }
}
