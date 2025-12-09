package SlidingWindow.EASY;

import java.util.HashMap;

public class CountOccurrenceOfAnagram {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String pattern = "abc";
        int res = 0;
        int len = str.length();
        int k = pattern.length();
        int l = 0;
        HashMap<Character, Integer> patternHashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hashMap.put(pattern.charAt(i), hashMap.get(pattern.charAt(i)) != null ? hashMap.get(pattern.charAt(i)) + 1 : 1);
            patternHashMap.put(pattern.charAt(i), 0);
        }
        for (int right = 0; right < len; right++) {
            //added char and count value to hashmap
            if (patternHashMap.containsKey(str.charAt(right))) {
                patternHashMap.put(str.charAt(right), patternHashMap.get(str.charAt(right)) + 1);
            }
            //when r-l+1==k we will get the result
            if (right - l + 1 == k) {
                System.out.println("right:" + right + "left:" + l + "pattern:" + patternHashMap);
                if (hashMap.equals(patternHashMap)) {
                    res += 1;
                }
                //dec l char from hm
                if (patternHashMap.containsKey(str.charAt(l))) {
                    patternHashMap.put(str.charAt(l), patternHashMap.get(str.charAt(l)) - 1);
                }

                //move l
                l++;
            }
        }
        System.out.println("Res:" + res);
    }
}
