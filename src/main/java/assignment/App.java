package assignment;

import java.util.Scanner;
import java.util.Stack;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to be evaluated: ");
        String expression = input.nextLine();
        calculate(expression);
    }

    public static int calculate(String input) {
    int result = 0;

        if (validInput(input)) {
            String postfix = convertToPostfix(input);
            result = evaluateExpression(input);
        } else {
            System.out.println("This is not a valid expression. A valid input contains only integers and operands such as +, - and *");
        }

        return result;
    }

    public static boolean validInput (String input){
        return true;
    }

    public static String convertToPostfix(String input){
        return input;
    }

    public static int evaluateExpression(String input){
        return 0;
    }
}
