package TwoPointers.BASIC;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] mergedArray = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            mergedArray[k] = arr1[i];
            k++;
            i++;
        }
        while (j < len2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("Res: " + Arrays.toString(mergedArray));
    }
}
