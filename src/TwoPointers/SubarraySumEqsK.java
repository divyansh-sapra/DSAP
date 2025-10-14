package TwoPointers;

import java.util.HashMap;

public class SubarraySumEqsK {
    public static void main(String[] args) {
//        int[] arr = {9, 4, 20, 3, 10};
//        int k = 33;
//        int[] arr = {10, 2, -2, -20, 10};
//        int k = -10;
//        int len = arr.length;
//        int i = 0;
//        int resCount = 0;
//        while (i < len) {
//            boolean found = false;
//            int sum = arr[i];
//            int j = i + 1;
//            if (sum == k) {
//                found = true;
//            } else {
//                while (j < len) {
//                    sum += arr[j];
//                    if (sum == k) {
//                        found = true;
//                        break;
//                    } else if (sum - (arr[i]) == k) {
//                        found = true;
//                        i++;
//                    }
//                    j++;
//                }
//            }
//            if (found)
//                resCount += 1;
//            i++;
//        }
//        System.out.println(resCount);

        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;

        // HashMap to store the frequency of cumulative sums
        HashMap<Integer, Integer> cumulativeSumMap = new HashMap<>();

        // Initialize with cumulative sum of 0 having one occurrence (for the case when the subarray starts from index 0)
        cumulativeSumMap.put(0, 1);

        int cumulativeSum = 0;
        int resCount = 0;

        // Iterate through the array
        for (int num : arr) {
            // Update the cumulative sum
            cumulativeSum += num;

            // Check if there's a subarray that sums to k
            System.out.println(cumulativeSum);
            System.out.println(cumulativeSum - k);
            if (cumulativeSumMap.containsKey(cumulativeSum - k)) {
                System.out.println("hi");
                resCount += cumulativeSumMap.get(cumulativeSum - k);
            }

            // Update the frequency of the cumulative sum in the map
            cumulativeSumMap.put(cumulativeSum, cumulativeSumMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        System.out.println(resCount);
    }
}
