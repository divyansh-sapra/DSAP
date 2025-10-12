package TwoPointers;

public class ValidPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        input = input.toLowerCase();

        int len = input.length();
        int i = 0;
        int j = len - 1;
        int iasc = 0;
        int jasc = 0;

        Boolean isValid = true;

        while (i < j) {
            iasc = input.charAt(i);
            jasc = input.charAt(j);
            if(input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
            }
            else if((iasc >= 97 && iasc <= 122) && (jasc >= 97 && jasc <= 122)) {
                isValid = false;
                break;
            } else {
                while (!(iasc >= 97 && iasc <= 122) && i <= len-1) {
                    i++;
                    iasc = input.charAt(i);
                }
                while (!(jasc >= 97 && jasc <= 122) && j >= 0) {
                    j--;
                    jasc = input.charAt(j);
                }
            }
        }

        System.out.println("Is Palindrome valid: " + isValid);

        while (i < j) {
            if(!Character.isLetterOrDigit(input.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(input.charAt(j))) {
                j--;
            } else {
                if (input.charAt(i) != input.charAt(j)) {
                    System.out.println("Not a Valid Palindrome");
                    return;
                }
                i++;
                j--;
            }
        }
        System.out.println("Valid Palindrome");
    }
}
