package by.teachmeskills.figuretask;

public class Rectangle {
    public static void main(String[] args) {
        Figure rectangle1 = new Figure();

        rectangle1.side1 = 5;
        rectangle1.side2 = 10;

        System.out.println(rectangle1.getRectangleArea());
        System.out.println(rectangle1.getRectanglePerimeter());

    }
}
