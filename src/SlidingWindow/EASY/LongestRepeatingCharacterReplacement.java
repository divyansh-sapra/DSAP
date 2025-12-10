package SlidingWindow.EASY;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String str = "abcabcc";
        int k = 2;
        int l = 0;
        int res = 0;
        int len = str.length();
        int maxFreq = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < len; right++) {
//            expand
            hashMap.put(str.charAt(right), hashMap.containsKey(str.charAt(right)) ? hashMap.get(str.charAt(right)) + 1 : 1);
            maxFreq = Math.max(hashMap.get(str.charAt(right)), maxFreq);
//            shrink
            while (right - l + 1 - maxFreq > k) {
                hashMap.put(str.charAt(l), hashMap.get(str.charAt(l)) - 1);
                if (hashMap.get(str.charAt(l)) == 0) {
                    hashMap.remove(str.charAt(l));
                }
                l++;
            }
            res = Math.max(res, right - l + 1);
        }
        System.out.println(res);
    }
}
