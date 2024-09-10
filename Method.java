class Bike{
    String brand;
    String model;
    int cc;
    boolean dualAbs;

    Bike(String brand, String model, int cc, boolean dualAbs){
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.dualAbs = dualAbs;
    }

    String introduceBike(){
        String absStatus = dualAbs ? "dual-channel abs" : "single channel abs";
        return "Introducing brand new " + brand + " " + model + " powered with " + cc + " cc engine which comes in " + absStatus; 
    }
}

class BikeObj{
    public static void main(String[] args) {
        Bike bike1 = new Bike("KTM", "RC 390", 373, true);
        System.out.println(bike1.introduceBike());
    }
}