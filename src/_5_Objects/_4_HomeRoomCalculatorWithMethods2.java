package _5_Objects;

import java.util.Scanner;

public class _4_HomeRoomCalculatorWithMethods2 {

    public static void main(String[] args)
    {
        _1_Rectangle kitchen = getRoom("Kitchen");
        _1_Rectangle bathroom = getRoom("Bathroom");

        double area = calculateTotalArea(kitchen,bathroom);
        System.out.println("he total area is: " + area);
    }

    public static _1_Rectangle getRoom(String roomName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the room length for " + roomName);
        double length = scanner.nextDouble();
        System.out.println();
        System.out.println("enter the room width for " + roomName);
        double width = scanner.nextDouble();

        return new _1_Rectangle(length,width);
    }

    public static double calculateTotalArea(_1_Rectangle rectangle1, _1_Rectangle rectangle2){
        return  rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
