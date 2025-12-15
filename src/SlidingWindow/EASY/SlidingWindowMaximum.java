package SlidingWindow.EASY;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int len = arr.length;
        int k = 3;
        int l = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int right = 0; right < len; right++) {
            while (!deque.isEmpty() && arr[deque.getLast()] < arr[right]) {
                //remove because of no use
                deque.removeLast();
            }

            //new element where to add!
            deque.addLast(right);

            //when to calculate answer
            if (right-l+1 == k) {
                arrayList.add(arr[deque.getFirst()]);
                if (deque.getFirst() < l)
                    deque.remove(l);
                l++;
            }
        }
        System.out.println(arrayList);
    }
}
