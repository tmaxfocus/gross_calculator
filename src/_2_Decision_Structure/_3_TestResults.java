package _2_Decision_Structure;

import java.util.Scanner;

/**
 * IF-ELSE_IF
 * Display the letter grade for a student based on their test score.
 */
public class _3_TestResults {

    public static void main(String[] args){
        // Get the test score
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'C';
        }else if(score < 90){
            grade = 'B';
        }else{
            grade = 'A';
        }

        System.out.println("You have grade " + grade);
    }
}
