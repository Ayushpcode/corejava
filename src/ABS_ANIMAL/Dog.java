package ABS_ANIMAL;

 class Dog extends Animal {

     @Override
     public void makeSound() {
         System.out.println("dog barks");
     }

     @Override
     public void move() {
         System.out.println("dog run");
     }
 }
