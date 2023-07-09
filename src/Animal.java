// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

 public class Animal {
    private String type;
     private String size;
     private Double waight;
   public Animal(){}

     public Animal(String type, String size, Double waight) {
         this.type = type;
         this.size = size;
         this.waight = waight;
     }

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }

     public String getSize() {
         return size;
     }

     public void setSize(String size) {
         this.size = size;
     }

     public Double getWaight() {
         return waight;
     }

     public void setWaight(Double waight) {
         this.waight = waight;
     }
     public void move(String speed){
         System.out.println("this "+this.type+"  move "+speed);
     }
     public void makesNoise(){
         System.out.println("this "+this.type+" makes noise");
     }

     @Override
     public String toString() {
         return "Animal{" +
                 "type='" + type + '\'' +
                 ", size='" + size + '\'' +
                 ", waight=" + waight +
                 '}';
     }
 }

