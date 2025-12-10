package SlidingWindow.EASY;
import java.util.HashSet;

public class MaximumNumberVowelsSubstringSizeK {
    public static void main(String[] args) {
        String str = "abciiidef";
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int k = 3;
        int res = 0;
        int vowelCount = 0;
        int l = 0;
        int len = str.length();
        for (int right = 0; right < len; right++) {
            if (vowels.contains(str.charAt(right))) {
                vowelCount++;
            }
            if (right - l == k) {
                if (vowels.contains(str.charAt(l))) {
                    vowelCount--;
                }
                l++;
            }
            res = Math.max(res, vowelCount);
        }
        System.out.println(res);
    }
}
