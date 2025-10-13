package TwoPointers;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 6;
//        return true/false
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == sum) {
                System.out.println("True");
                return;
            } else if (arr[i] + arr[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("False");
    }
}
