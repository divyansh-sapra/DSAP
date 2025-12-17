package TwoPointers.EASY;

public class RemoveDuplicates {
    public static void main(String[] args) {
        char[] arr = {'1', '1', '2', '2', '3', '4', '4'};
        int len = arr.length;
        int i = 0;
        int j = i + 1;
        //slow and fast pointer
        while (j < len) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        System.out.println(i + 1);
    }
}
