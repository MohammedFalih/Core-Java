public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        System.out.println("default capacity: " + name.capacity());

        name.append("falih");
        System.out.println("appending less than capacity: " + name.capacity());

        name.append("getme@mohammedfalih");   
        System.out.println("appending greater than capacity: " + name.capacity());
        System.out.println("length: " + name.length());

        StringBuffer car = new StringBuffer("Skyline");
        car.insert(0, "Nissan ");
        System.out.println(car.toString());
    }
}
