package _2_Decision_Structure;

import java.util.Scanner;

public class _2_QuotaCalculator {

        public static void main(String[] args){
            // Initialize known values
            int quota = 10;


            //get values for the unknown
            System.out.println("How many sales did you make this week");

            Scanner scanner = new Scanner(System.in);
            int sales = scanner.nextInt();
            scanner.close();

            //Quick detour for the bonus earners
            if(sales >= quota){

                System.out.println("Congrats! You;ve met your quota.");
            }else{
                int salesShort = quota - sales;
                System.out.println("You did not make your quota. You were " + salesShort + "sales short");
            }


        }


}
