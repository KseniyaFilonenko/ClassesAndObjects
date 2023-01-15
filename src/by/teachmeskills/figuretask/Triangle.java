package by.teachmeskills.figuretask;

public class Triangle {
    public static void main(String[] args) {
        Figure triangle1 = new Figure();

        triangle1.side1 = 1;
        triangle1.side2 = 1;
        triangle1.side3 = 2;

        System.out.println(triangle1.getTriangleArea());
        System.out.println(triangle1.getTrianglePerimeter());

    }
}
