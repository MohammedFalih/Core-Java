import java.util.Arrays;

public class StringManipulation {
   
    public static void main(String[] args) {

        String str1 = "Hello ";z
        String str2 = "World";
        String result = str1 + str2;
        
        System.out.println("\nString Manipulation----");
        System.out.println("Concatenation: " + result);

        String word = "Endeavor";
        String subStr = word.substring(0,3);
        System.out.println("SubString: " + subStr + " from " + word);

        String greet = "Hello World";
        String replacing = greet.replace("World", "Java");
        System.out.println("Replace: " + replacing);

        String cars = "skoda,volkswagon,ford,honda";
        String[] splitted = cars.split(",");
        System.out.println("Split: " + Arrays.toString(splitted));

        String firstName = "mohammed";
        String lastName = "falih";
        String name = firstName.toUpperCase() + " " + lastName.toUpperCase();
        System.out.println("Case Conversion: " + name);

        String str3 = "amaze";
        String str4 = "Amaze";
        String str5 = "amaze";
        boolean isEqual = str3.equals(str4);
        boolean isEquals = str3.equals(str5);
        System.out.println("Equals: " + isEqual);
        System.out.println("Equals: " + isEquals);

        int age = 21;
        String formatted = String.format("I am %d years old.", age);
        System.out.println("Format: " + formatted);
    }
}
