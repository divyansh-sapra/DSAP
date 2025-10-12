package TwoPointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int len = arr.length;
        int i = 0;
        int j = 0;
        while (i < len && j < len) {
            //find 0 position for i
            while (arr[i] != 0) {
                i++;
            }
            j=i+1;
            //find non-zero position for j
            while (j < len && arr[j] == 0) {
                j++;
            }

            //once you find 0 and non-zero and i < j swap them
            if(j < len && i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
