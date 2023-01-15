package by.teachmeskills.figuretask;

public class Figure {
    double side1;
    double side2;
    double side3;
    double r;
    public double getRectangleArea(){
        return side1 * side2;
    }
    public double getTriangleArea(){
        return side1 * side2;
    }
    public double getCircleArea(){
        return (314 / 100) * Math.pow(r, 2);
    }

    public double getRectanglePerimeter(){
        return side1 + side2;
    }
    public double getTrianglePerimeter(){
        return side1 + side2 + side3;
    }
    public double getCirclePerimeter(){
        return (314 / 100) * Math.pow(r, 4) / 4;
    }
}
