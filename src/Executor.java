public class Executor {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("audi");
        car1.setCarConvertible(true);
        car1.setColour("black");
        car1.setModel("A8");
        car1.setFuel_type("power");
        System.out.println(car1.toString());
        Car car2 = new Car("BMW","I8","Petrol","Blue",true);
        System.out.println(car2.toString());
    }
}
