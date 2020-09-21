package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array0 {
    public static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] a = new int[ARRAY_SIZE];
        a[0] = reader.nextInt();
        a[1] = reader.nextInt();
        a[2] = reader.nextInt();
        a[3] = reader.nextInt();
        a[4] = reader.nextInt();

        System.out.println(lookForMin(a));
        System.out.println(lookForMax(a));
        System.out.println(Arrays.toString(shrinkArrayV2(a)));

    }

    private static int[] shrinkArray(int[] bigArray) {
        final int[] result = new int[3];
        final int max = lookForMax(bigArray);
        final int min = lookForMin(bigArray);

        int resultIndex = 0;
        for (int bigArrayIndex = 0; bigArrayIndex < bigArray.length; bigArrayIndex++) {
            final int bigArrayValue = bigArray[bigArrayIndex];
            if (bigArrayValue != min && bigArrayValue != max) {
                result[resultIndex++] = bigArrayValue;
            }
        }

        return result;
    }

    private static Integer[] shrinkArrayV2(int[] bigArray) {
        final int max = lookForMax(bigArray);
        final int min = lookForMin(bigArray);
        final List<Integer> resultList = new ArrayList<>();

        for (int bigArrayIndex = 0; bigArrayIndex < bigArray.length; bigArrayIndex++) {
            final int bigArrayValue = bigArray[bigArrayIndex];
            if (bigArrayValue != min && bigArrayValue != max) {

                resultList.add(bigArrayValue);

            }
        }

        return resultList.toArray(new Integer[3]);
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