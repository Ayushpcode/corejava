public class Car {
    public Car() {
        System.out.println("first constructor called");
    }

    public Car(String brand, String model, String fuel_type, String colour, boolean isCarConvertible) {
        System.out.println("Second constructor called");
        this.brand = brand;
        this.model = model;
        this.fuel_type = fuel_type;
        this.colour = colour;
        this.isCarConvertible = isCarConvertible;
    }

    private String brand;
    private String model;
    private String fuel_type;
    private String colour;
    private boolean isCarConvertible;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCarConvertible() {
        return isCarConvertible;
    }

    public void setCarConvertible(boolean carConvertible) {
        isCarConvertible = carConvertible;
    }

    public void pickUp(){

    }
    public void exhaust(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", colour='" + colour + '\'' +
                ", isCarConvertible=" + isCarConvertible +
                '}';
    }
}

