package _4_Methods;

import java.util.Scanner;

public class _3_InstantCreditCheck {
    /**
     * Returning Data From Methods.
     * Write an "instant credit check" program tha approves anyone who
     * makes more than $25,000 and has a credit score of 7000 or better.
     * Reject all others.
     */

    public static void main(String[] args){
        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        // check if the user is qualified
        boolean qualified = isUserQualified(actualCreditScore,actualSalary);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requireCreditScore = 700;

        if(creditScore >= requireCreditScore && salary >= requiredSalary ){
            return true;
        }else{
            return false;
        }

    }

    public static void notifyUser(boolean isQualified)
    {
        if(isQualified)
            System.out.println("Congrats! You've been approved.");
        else {
            System.out.println("Sorry, you've been declined");
        }
    }
}
