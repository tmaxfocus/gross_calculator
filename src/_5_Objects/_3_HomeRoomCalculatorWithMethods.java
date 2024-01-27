package _5_Objects;

import java.util.Scanner;

public class _3_HomeRoomCalculatorWithMethods {

    public static void main(String[] args)
    {
        _1_Rectangle kitchen = new _1_Rectangle(200 , 400);
        _1_Rectangle bathroom = new _1_Rectangle(300, 700);

        double area = calculateTotalArea(kitchen,bathroom);
        System.out.println("he total area is: " + area);
    }

    public static _1_Rectangle GetWidthAndLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the room length");
        double length = scanner.nextDouble();
        System.out.println();
        System.out.println("enter the room width");
        double width = scanner.nextDouble();

        return new _1_Rectangle(length,width);
    }

    public static double calculateTotalArea(_1_Rectangle rectangle1, _1_Rectangle rectangle2){
        return  rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
