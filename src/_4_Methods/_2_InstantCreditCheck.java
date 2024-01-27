package _4_Methods;

import java.util.Scanner;

/**
 * Passing data/arguments tso methods.
 * Write an "instant credit check" program tha approves anyone who
 * makes more than $25,000 and has a credit score of 7000 or better.
 * Reject all others.
 */
public class _2_InstantCreditCheck {

    public static void main(String[] args){
        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        // check if the user is qualified
        isUserQualified(actualCreditScore,actualSalary);
    }

    public static void isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requireCreditScore = 700;

        if(creditScore >= requireCreditScore && salary >= requiredSalary ){
            System.out.println("Congrats! You've been approved!");
        }else{
            System.out.println("Sorry, you've been declined.");
        }
    }
}
