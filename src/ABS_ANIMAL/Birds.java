package ABS_ANIMAL;

 class Birds extends Animal{

     @Override
     public void makeSound() {
         System.out.println("birds chirps");
     }

     @Override
     public void move() {
         System.out.println("birds flies");
     }
 }
