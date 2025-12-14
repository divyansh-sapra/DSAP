package SlidingWindow.EASY;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String t = "ABC";
        int strLen = str.length();
        int tLen = t.length();
        int l = 0;
        int rRes = 0;
        int lRes = 0;
        int res = strLen;
        HashMap<Character, Integer> hmt = new HashMap<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        if (strLen < tLen) {
            System.out.println("");
            return;
        }
        for (int i = 0; i < tLen; i++) {
            hmt.put(t.charAt(i), hmt.containsKey(t.charAt(i)) ? hmt.get(t.charAt(i)) + 1 : 1);
        }
        int required = hmt.size();
        int formed = 0;
        for (int right = 0; right < strLen; right++) {
            //add to hm only if that char is in t because that will only contribute to answer
            if (hmt.containsKey(str.charAt(right))) {
                hm.put(str.charAt(right), (hm.getOrDefault(str.charAt(right), 0) + 1));
            }

            //add to formed
            if (hm.containsKey(str.charAt(right)) && hm.get(str.charAt(right)) == hmt.get(str.charAt(right))) {
                formed++;
            }
            while (l <= right && formed == required) {
                if (right - l + 1 < res) {
                    res = right - l + 1;
                    rRes = right;
                    lRes = l;
                }
                //we will get out answer here
                //shrink
                Character c = str.charAt(l);
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) - 1);
                }
                System.out.println(hm);
                if (hmt.containsKey(c) && hm.get(c) < hmt.get(c)) {
                    formed--;
                }
                l++;
            }
        }
        System.out.println("Res: " + str.substring(lRes, rRes + 1));
    }
}
