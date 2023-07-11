package inheritance;

public class Animal {
        private String type;
        private double size;
        private double waight;
        public Animal(){}

    public Animal(String type, double size, double waight) {
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

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public Double getWaight() {
            return waight;
        }

        public void setWaight(Double waight) {
            this.waight = waight;
        }
        public void move(String speed){
            System.out.println(this.type+" cover "+speed);
        }
        public void makesNoise(String noise){
            System.out.println(this.type+" sounds like " + noise);
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


