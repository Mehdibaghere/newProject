package Job;

import java.util.Scanner;

class Palindrome {

    public static String PalindromeCreator(String str) {

        if (isPalindrome(str))
            return "palindrome";

        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            String replacedString = str.replaceFirst(character, "");
            if (isPalindrome(replacedString)) {
                return character;
            } else {
                for (int j = 0; j < replacedString.length(); j++) {
//                    String character11 = String.valueOf(replacedString.charAt(j));
                    String character1 = replacedString.substring(j, j + 1);
                    String replacedString1 = replacedString.replaceFirst(character1, "");
                    if (isPalindrome(replacedString1)) {
                        return character + character1;
                    }
                }
            }
        }
        return "not possible";
    }

    private static boolean isPalindrome(String string) {

        final int length = string.length();
        if (length < 3) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeCreator(s.nextLine()));
    }
}