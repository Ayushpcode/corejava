package Smart_Home_System;

public class Light {
    private boolean is_on;

    public Light() {
        this.is_on = is_on;
    }
    public void lightOn(){
        is_on = true;
        System.out.println("Lights are on!");
    }
    public void lightOff(){
        is_on = false;
        System.out.println("Lights are off!");
    }

    @Override
    public String toString() {
        return "Light{" +
                "is_on=" + is_on +
                '}';
    }
}
