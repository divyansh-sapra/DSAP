package TwoPointers.EASY;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        char[] arr = {'1', '1', '2', '2', '3', '4', '4'};
        int len = arr.length;
        int i = 0;
        int j = i+1;
        int res = 1;
        if (len == 1) {
            System.out.println(1);
            return;
        }
        while (j < len) {
            if(arr[i] == arr[j]) {
                arr[j] = '_';
            } else if (arr[i] != arr[j]) {
                res++;
                i=j;
            }
            j++;
        }
        i=0;
        j=0;
        while (j < len) {
            if (arr[i] == '_' && arr[j] != '_') {
                arr[i] = arr[j];
                arr[j] = '_';
                i++;
            } else if (arr[i] != '_' && arr[j] != '_') {
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
}
