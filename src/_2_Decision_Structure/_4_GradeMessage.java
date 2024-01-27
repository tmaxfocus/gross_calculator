package _2_Decision_Structure;

import java.util.Scanner;


// switch statement
public class _4_GradeMessage {

    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch(grade){
            case  "A":
                message = "Excellent job!";
                break;
            case  "B":
                message = "Grate job!";
                break;
            case  "C":
                message = "Good job!";
                break;
            case  "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Un oh!";
            default:
                message = "Error. Invalid grade";
                break;
        }
    }
}
