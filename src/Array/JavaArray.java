package Array;

import java.util.Scanner;

class ArrayJava {


    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 5;
//        a[1] = 8;
//        a[2] = 3;
//        a[3] = 12;
//        a[4] = 9;
//        System.out.println(a[3]);
///////////////////////////////////////////////////////////
//        int[] b = {5, 8, 3, 12, 9};
//        for (int mehdi : b) {
//            System.out.println(mehdi);
//        }
///////////////////////////////////////////////////////////
//        int bigArray[] = {5, 8, 3, 12, 9};
//
//        int smalnumber = bigArray[0];
//        int bignumber = bigArray[0];
//
//        for(int i=0; i<=4; i++) {
//            if (bigArray[i] < smalnumber) smalnumber = bigArray[i];
//            if (bigArray[i] > bignumber) bignumber = bigArray[i];
//        }
//            System.out.println("the smolnumber value is:" + smalnumber);
//            System.out.println("the  bignumber value is:" + bignumber);

/////////////////////////////////////////////////////////////////
//        Scanner reader = new Scanner(System.in);
//        int[] a = new int[5];
//        a[0] = reader.nextInt();
//        a[1] = reader.nextInt();
//        a[2] = reader.nextInt();
//        a[3] = reader.nextInt();
//        a[4] = reader.nextInt();
//
//        System.out.println(lookForMin(a));
//        System.out.println(lookForMax(a));
//    }
//    private static int lookForMax(int[] bigArray) {
//        int bignumber = bigArray[0];
//
//        for (int i = 0; i <= 4; i++) {
//            if (bigArray[i] > bignumber) bignumber = bigArray[i];
//        }
//        return bignumber;
//    }
//
//    private static int lookForMin(int[] bigArray) {
//        int smalnumber = bigArray[0];
//
//        for (int i = 0; i <= 4; i++) {
//            if (bigArray[i] < smalnumber) smalnumber = bigArray[i];
//        }
//        return smalnumber;
//    }
///////////////////////////////////////////////////////////////////////
//        Scanner reader = new Scanner(System.in);
//        String email = reader.nextLine();
//        Boolean atSign = checkAtSign(email);
//        if (atSign) System.out.println("This is valid Email");
//        else System.out.println("This is not valid Email");
//    }
//
//    private static Boolean checkAtSign(String email) {
//        int endPosition = email.length() - 1;
//        for (int i = 1; i < endPosition; i++) {
//            if (email.charAt(i) == '@') return true;
//        }
//        return false;
//
////////////////////////////////////////////////////////////
//        Scanner reader = new Scanner(System.in);
//        int[] a = new int[5];
//        a[0] = reader.nextInt();
//        a[1] = reader.nextInt();
//        a[2] = reader.nextInt();
//        a[3] = reader.nextInt();
//        a[4] = reader.nextInt();
//
//        System.out.println(lookForMin(a));
//        System.out.println(lookForMax(a));
//        System.out.println(Arrays.toString(shrinkArrayV2(a)));
//
//    }
//    private static int[] shrinkArray(int[] bigArray) {
//        final int[] result = new int[3];
//        final int max = lookForMax(bigArray);
//        final int min = lookForMin(bigArray);
//
//        int resultIndex = 0;
//        for (int bigArrayIndex = 0; bigArrayIndex < bigArray.length; bigArrayIndex++) {
//            final int bigArrayValue = bigArray[bigArrayIndex];
//            if (bigArrayValue != min && bigArrayValue != max) {
//                result[resultIndex++] = bigArrayValue;
//            }
//        }
//
//        return result;
//    }
//
//    private static Integer[] shrinkArrayV2(int[] bigArray) {
//        final int max = lookForMax(bigArray);
//        final int min = lookForMin(bigArray);
//        final List<Integer> resultList = new ArrayList<>();
//
//        for (int bigArrayIndex = 0; bigArrayIndex < bigArray.length; bigArrayIndex++) {
//            final int bigArrayValue = bigArray[bigArrayIndex];
//            if (bigArrayValue != min && bigArrayValue != max) {
//
//                resultList.add(bigArrayValue);
//
//            }
//        }
//
//        return resultList.toArray(new Integer[3]);
//    }
//
//    private static int lookForMax(int[] bigArray) {
//        int bignumber = bigArray[0];
//
//        for (int i = 0; i <= 4; i++) {
//            if (bigArray[i] > bignumber) bignumber = bigArray[i];
//        }
//        return bignumber;
//    }
//
//    private static int lookForMin(int[] bigArray) {
//        int smalnumber = bigArray[0];
//
//        for (int i = 0; i <= 4; i++) {
//            if (bigArray[i] < smalnumber) smalnumber = bigArray[i];
//        }
//        return smalnumber;
////////////////////////////////////////////////////////////////////////////
//
//        int[] array = {5, 8, 3, 12, 9};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
////////////////////////////////////////////////////////
        Scanner Array = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length - 1; i--) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
