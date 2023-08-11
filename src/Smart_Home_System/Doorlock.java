package Smart_Home_System;

public class Doorlock {
    private boolean isLock;

    public Doorlock() {
        this.isLock = isLock;
    }
    public void lock(){
        isLock = true;
        System.out.println("Lock the door !");
    }
    public void unlock(){
        isLock = false;
        System.out.println("unLock the door !");
    }
}
