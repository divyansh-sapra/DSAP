package TwoPointers;

public class MostWaterContainer {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        int res = 0;
        while (i < j) {
            int case1 = getQuantity(arr, i, j);
            res = Math.max(res, case1);
            if (arr[i] < arr[j])
                i++;
            else
                j--;
        }
        System.out.println(res);
    }

    private static int getQuantity(int[] arr, int i, int j) {
        return Math.min(arr[i], arr[j]) * (j - i);
    }
}
