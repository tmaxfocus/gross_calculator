package _5_Objects;

/**
 * Below is the template of a rectangle
 * -> Object As Class
 * -> Constructor
 */
public class _1_Rectangle {

    private  double length;
    private double width;

    public _1_Rectangle(){
        length =0;
        width = 0;
    }

    public _1_Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    };

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    };
}
