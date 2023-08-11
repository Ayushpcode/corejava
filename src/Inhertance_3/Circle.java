package Inhertance_3;

public class Circle {
    private double radius;
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){

        return (this.radius < 0)? 0 : this.radius;
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "Area=" + getArea() +
                '}';
    }
}
