package Shapes_abs;

class Rectangle extends Shapes {
    private double Lengths;
    private double width;

    public Rectangle(double lengths, double width) {
        Lengths = lengths;
        this.width = width;
    }

    public double getLengths() {
        return Lengths;
    }

    public void setLengths(double lengths) {
        Lengths = lengths;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return Lengths*width;
    }
    public double calculatePerimeter(){
        return 2*(Lengths+width);
    }

}
