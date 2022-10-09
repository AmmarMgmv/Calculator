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
        if(!(Character.isDigit(input.charAt(0)))){
            return false;
        }

        boolean lastOperator = true;

        for (int i = 0; i < input.length(); i++){
            while(Character.isDigit(input.charAt(i))){
                i++;
                lastOperator = true;
            }
            if((input.charAt(i) == '*' || input.charAt(i) == '+' || input.charAt(i) == '-' ) && lastOperator){
                lastOperator = false;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static String convertToPostfix(String input){
        Stack <Character> operators = new Stack <Character> ();
        StringBuilder postfixExpression = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                postfixExpression.append(input.charAt(i));
            }
            else if(input.charAt(i) == '*' || input.charAt(i) == '+' || input.charAt(i) == '-' ) {
                postfixExpression.append(' ');
                while(!operators.isEmpty() && hasPrecedence(input.charAt(i), operators.peek())){
                    char popped = operators.pop();

                    //potential error
                    postfixExpression.append(popped + ' ');
                }
                operators.push(input.charAt(i));
            }
        }
        postfixExpression.append(' ');
        while (!operators.isEmpty()) {
            postfixExpression.append(operators.pop());
            postfixExpression.append(' ');
        }
        return postfixExpression.toString();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int evaluateExpression(String input){
        return 0;
    }
}
