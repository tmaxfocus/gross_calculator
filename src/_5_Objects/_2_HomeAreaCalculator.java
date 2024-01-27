package _5_Objects;

public class _2_HomeAreaCalculator {
    /**
     * Create object
     * @param args
     */
    public static void main(String[] args){
        _1_Rectangle room1 = new _1_Rectangle();
        room1.setWidth(25);
        room1.setWidth(50);

        double areaOfRoom1 = room1.calculateArea();

        _1_Rectangle room2 = new _1_Rectangle(30,75);

        double areaOfRoom2 = room2.calculateArea();
    }
}
