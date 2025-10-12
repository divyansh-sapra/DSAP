package TwoPointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int len = arr.length;

        Arrays.sort(arr);
        Set<List<Integer>> listSet = new HashSet<>();

        for (int i = 0; i < len - 3; i++) {
            int sum = arr[i];
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (arr[j] + arr[k] == -1 * sum) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    listSet.add(list);
                    j++;
                    k--;
                } else if ((arr[j] + arr[k]) < -1 * sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(listSet);
    }
}
