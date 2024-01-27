package _1_gross_calculator;

public class GrossPayCalculator_1 {

    public static void  main(String[] args){
        // Local variables,Primitive data types, Type inference "Var"
        // Definition --> Variable is a memory location that stores data

        //1. Get the number of hours worked
        int hours = 40;

        //2. Get the hourly pay rate
        double payRate = 25.50;

        //3. Multiply hours and pay here
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);


    }
}
