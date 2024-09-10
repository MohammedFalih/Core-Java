public class DataTypes {
    public static void main(String args[])
    {
        /** Difference between primitive and non-primitive datatype
         * 
         * Primitive Types: The actual value is stored in the memory location associated 
         * with the variable.
         * Non-Primitive Types: These types store a reference or pointer to the
         * memory location where the actual object or data is stored. 
         * 
         */

        char a = 'F';
        boolean tf = true;
        byte n = 123;
        int num = 1234511115;
        long number = 12345677678923453L;
        float dec = 123.65432f;
        double decimal = 123.65452322232332111111111111111111111111111f;


        Person mohammed = new Person("Mohammed");
        Person falih = mohammed;

        System.out.println("Primitive DataTypes--------->");
        System.out.println("Char: " + a);
        System.out.println("Boolean: " + tf);
        System.out.println("Byte: " + n);
        System.out.println("Int: " + num);
        System.out.println("Long: " + number);
        System.out.println("Float: " + dec);
        System.out.println("Double: " + decimal);

        System.out.println("");

        System.out.println("Non-primitive DataTypes---------->");

        String firstName = "Mike";
        String secondName = firstName; //here second_name still point to the first_name
        firstName = "Mike Tyson";

        System.out.println("firstname: " + firstName);
        System.out.println("secondname: " + secondName);

        System.out.println("before changing first:");
        System.out.println(mohammed.name);
        System.out.println(falih.name);

        System.out.println("after changing first");
        mohammed.name = "Muhammad";
        System.out.println(mohammed.name);
        System.out.println(falih.name);

        System.out.println("after changing second:");
        falih.name = "Falih";
        System.out.println(mohammed.name);
        System.out.println(falih.name);    
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}