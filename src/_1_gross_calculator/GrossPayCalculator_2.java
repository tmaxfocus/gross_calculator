package _1_gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator_2 {

    public static void main(String[] args){
        // Local variables,Primitive data types, Type inference "Var"
        // Definition --> Variable is a memory location that stores data

        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("what is your pay rate?.");

        payRate  = scanner.nextDouble();
        //3. Multiply hours and pay here
        double grossPay = hours * payRate;

        scanner.close();

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
