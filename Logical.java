public class Logical {
    public static void main(String[] args) {
        String name = "Falih";
        int age = 21;
        int a = 10, b=20;        
        System.out.println("Logical Operators in Java...");
        System.out.println((a > b) || (100 > 10));
        System.out.println(age > 18 && name.contains("F"));
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(name.contains("al")
            && age > 18 && a < b
        );
    }
}