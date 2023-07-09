public class Fish extends Animal{
    int fins;
    int gill;
    public void Fish(){}

    public Fish(int fins, int gill) {
        this.fins = fins;
        this.gill = gill;
    }

    public Fish(String type, String size, Double waight, int fins, int gill) {
        super(type, size, waight);
        this.fins = fins;
        this.gill = gill;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getGill() {
        return gill;
    }

    public void setGill(int gill) {
        this.gill = gill;
    }

    public void moveMusles() {
        System.out.println(this.getType()+" moveing musles");
    }
    public void movingBackFins(){
        System.out.println(this.getType()+" moving back fins. ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gill=" + gill +
                '}';
    }
}
