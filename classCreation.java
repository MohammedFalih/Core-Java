class ClassCreation{
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Apple", "15 pro max", "Space Black", 256);
        System.out.println(mobile1.message());
    }

    static class Mobile{
        String brand;
        String model;
        String color;
        int variant;

        Mobile(String brand, String model, String color, int variant){
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.variant = variant;
        }

        public String message(){
            String message = "Thanks for buying " + this.brand + this.model + "(" + this.color + this.variant + ")";
            return message;
        }
    }
}