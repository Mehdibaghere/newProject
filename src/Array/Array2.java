package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String email = reader.nextLine();
        Boolean atSign = checkAtSign(email);
        if (atSign) System.out.println("This is valid Email");
        else System.out.println("This is not valid Email");
    }

    private static Boolean checkAtSign(String email) {
        int endPosition = email.length() - 1;
        for (int i = 1; i < endPosition; i++) {
            if (email.charAt(i) == '@') return true;
        }
        return false;
    }
}
