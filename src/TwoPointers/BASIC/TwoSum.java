package TwoPointers.BASIC;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 6;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                System.out.println(true);
                return;
            }
            if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(false);
    }
}
