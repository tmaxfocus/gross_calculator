package _3_Repitition_Structure;

import java.util.Scanner;

/**
 * --> For loop
 * write a cashier program that will scan a given number of items and accumulate the cost
 */
public class _3_TallyTheCost {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of items you want to scan :");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
        for(int i=0; i < quantity ; i++){
            System.out.println("Enter the cost of the item " + i);
            double price =scanner.nextDouble();
            total = total + price ;
        }
        scanner.close();
        System.out.println("Your total is $ " + total);
    }
}
