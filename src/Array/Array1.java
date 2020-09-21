package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = reader.nextInt();
        a[1] = reader.nextInt();
        a[2] = reader.nextInt();
        a[3] = reader.nextInt();
        a[4] = reader.nextInt();

        System.out.println(lookForMin(a));
        System.out.println(lookForMax(a));
    }

    private static int lookForMax(int[] bigArray) {
        int bignumber = bigArray[0];

        for (int i = 0; i <= 4; i++) {
            if (bigArray[i] > bignumber) bignumber = bigArray[i];
        }
        return bignumber;
    }

    private static int lookForMin(int[] bigArray) {
        int smalnumber = bigArray[0];

        for (int i = 0; i <= 4; i++) {
            if (bigArray[i] < smalnumber) smalnumber = bigArray[i];
        }
        return smalnumber;
    }
}
