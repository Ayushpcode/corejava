package Shapes_abs;

public class Executor {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
        System.out.println("area of a circle " + c1.calculateArea());
        System.out.println("perimeter of a circle " + c1.calculatePerimeter());
        Rectangle r1 = new Rectangle(5.2,6.8);

        System.out.println("area of a rectangle " + r1.calculateArea());
        System.out.println("perimeter of a rectangle " + r1.calculatePerimeter());

    }
}
