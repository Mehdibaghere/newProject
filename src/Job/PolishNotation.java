package Job;

import java.util.Scanner;
import java.util.Stack;

public class PolishNotation {

    public static String ReversePolishNotation(String str) {

        final String[] strings = str.split(" ");
        final Stack<Integer> integerStack = new Stack<>();
        Integer topInt;
        Integer bottomInt;

        for (String figure : strings) {
            switch (figure) {
                case "+":
                    topInt = integerStack.pop();
                    bottomInt = integerStack.pop();
                    integerStack.push(bottomInt + topInt);
                    break;
                case "-":
                    topInt = integerStack.pop();
                    bottomInt = integerStack.pop();
                    integerStack.push(bottomInt - topInt);
                    break;
                case "*":
                    topInt = integerStack.pop();
                    bottomInt = integerStack.pop();
                    integerStack.push(bottomInt * topInt);
                    break;
                case "/":
                    topInt = integerStack.pop();
                    bottomInt = integerStack.pop();
                    integerStack.push(bottomInt / topInt);
                    break;
                default:
                    integerStack.push(Integer.parseInt(figure));
            }
        }

        return integerStack.pop().toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ReversePolishNotation(s.nextLine()));
    }

}
