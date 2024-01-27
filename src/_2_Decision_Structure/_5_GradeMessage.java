package _2_Decision_Structure;

import java.util.Scanner;

// switch expression
// Relational operator e.g >, <,>==,<==,!=, ==
//Logical operator .g &&,||,! --> Operators used to combine boolean expressions into value
public class _5_GradeMessage {

    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        message = switch(grade){
            case  "A","B" -> "Excellent job!";
            case  "C" -> "Good job!";
            case  "D" -> "You need to work a bit harder";
            case  "F" ->  "Un oh!";
            default -> "Error. Invalid grade";

        };

        System.out.println("You are on grade : " + grade + " " + message);
    }
}
