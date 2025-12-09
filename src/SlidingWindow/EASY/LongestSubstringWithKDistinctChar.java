package SlidingWindow.EASY;

import java.util.HashMap;

public class LongestSubstringWithKDistinctChar {
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        int res = 0;
        int l = 0;
        int len = str.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < len; right++) {
            //add char count to hm to expand
            hashMap.put(str.charAt(right), hashMap.containsKey(str.charAt(right)) ? hashMap.get(str.charAt(right)) + 1 : 1);

            //shrink condition
            while (hashMap.size() > k && l <= right) {
                //shrink
                if (hashMap.containsKey(str.charAt(l))) {
                    hashMap.put(str.charAt(l), hashMap.get(str.charAt(l)) - 1);

                    //remove so that size is correct
                    if (hashMap.get(str.charAt(l)) == 0) {
                        hashMap.remove(str.charAt(l));
                    }
                }
                l++;
            }

            res = Math.max(res, right - l + 1);

        }

        System.out.println("Res: " + res);
    }
}
