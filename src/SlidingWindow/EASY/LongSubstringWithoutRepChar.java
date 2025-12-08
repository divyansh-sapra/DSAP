package SlidingWindow.EASY;

import java.util.ArrayList;
import java.util.List;

public class LongSubstringWithoutRepChar {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int len = str.length();
        int res = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            while (list.contains(str.charAt(i))) {
                list.removeFirst();
            }
            list.add(str.charAt(i));
            res = Math.max(res, list.size());
        }
        System.out.println("Result: " + res);
    }
}
