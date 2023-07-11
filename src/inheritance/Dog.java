package inheritance;

public class Dog extends Animal {
    String earShape;
    String tailShape;
    public Dog(){}

    public Dog(String type, double size, double waight, String earShape, String tailShape) {
        super(type, size, waight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public String getEarShape(String prick) {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }
    public void bark(){
        System.out.println(this.getType()+" is barking");
    }
    public void run(){
        System.out.println(this.getType()+" is running");
    }
    public void walk(){
        System.out.println(this.getType()+" is walking");
    }
    public void wagTail(){
        System.out.println(this .getType()+" has wag tail");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}';
    }
}



