package _3_Repitition_Structure;

import java.util.Scanner;

public class _2_SumOfTwoNumbers {

    /** do while loop
     * Write a program that allows a user to enter two numbers and then sums the two numbers
     * The user should be able to repeat this action until they indicate done.
     * @param args
     */
    public static void main(String[] args)
    {
        int runAgain = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter your first number!");
            int a = scan.nextInt();
            System.out.println("Enter your second number!");
            int b = scan.nextInt();
            int c = (a + b);
            System.out.println("Sum of " + a  + " + " + b + " = "  + c );
            System.out.println("Kindly enter 1 if you are done, 0 to try again");
            runAgain = scan.nextInt();

        }while (runAgain == 0);
    }
}
