package assignment;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to be evaluated: ");
        String expression = input.nextLine();
        calculate(expression);
    }

    public static int calculate(String input){
        System.out.println("Expression received!");
        return 1+1;
    }

}
