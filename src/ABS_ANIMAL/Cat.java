package ABS_ANIMAL;

 class Cat extends Animal {
     @Override
     public void makeSound() {
         System.out.println("cat meow");
     }

     @Override
     public void move() {
         System.out.println("cat walk");
     }
 }
