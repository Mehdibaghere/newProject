package Array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Mehdi = new Scanner(System.in);
        String name;
        do {
            name = Mehdi.nextLine();
            System.out.println(reverse(name));
        } while(!name.equals("end"));
    }



    public static String reverse(String givenName) {
        String result = givenName.substring(givenName.length() - 1);
        return result;
    }

    public static String reverse1(String givenName) {
        String result = "";
        for (int i = 0; i < givenName.length(); i++) {
            result = givenName.charAt(i) + result;

        }
        return result;
    }
}
