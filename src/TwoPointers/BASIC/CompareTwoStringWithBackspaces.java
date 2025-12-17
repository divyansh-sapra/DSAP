package TwoPointers.BASIC;

public class CompareTwoStringWithBackspaces {

    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxo#j##tw";

        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            // find valid char in s
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            // find valid char in t
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            // compare valid characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    System.out.println(false);
                    return;
                }
            } else if (i >= 0 || j >= 0) {
                // one string finished earlier
                System.out.println(false);
                return;
            }

            i--;
            j--;
        }

        System.out.println(true);
    }
}
