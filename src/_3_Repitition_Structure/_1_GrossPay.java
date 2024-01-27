package _3_Repitition_Structure;

import java.util.Scanner;

public class _1_GrossPay {
    /**
     * --> While loop
     * Each store employee make $15 an hour. Write a program that allows a manager to enter
     * the number of weekly hours worked
     * for each employee and calculate their pay. Do not allow overtime.
     * @param args
     */
    public static void main(String[] args){
        //While loop
        int payRate = 15;
        int maxHours = 40;
        System.out.println("How many hours did the employee work for this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextInt();


        while(hoursWorked > maxHours)
        {
            System.out.println("Invalid entry. your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextInt();
        }


         double grossPay = payRate * hoursWorked;


        scanner.close();

        //4. Display result
        System.out.println("Gross pay: $" + grossPay);
    }
}
