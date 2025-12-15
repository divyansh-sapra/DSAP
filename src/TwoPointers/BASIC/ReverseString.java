package TwoPointers.BASIC;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Res: " + Arrays.toString(arr));
    }
}
