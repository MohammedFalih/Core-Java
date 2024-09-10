import java.util.Arrays;

class ForLoop{
    public static void main(String[] args) {
        int[] numbers = { 12, 23, 34, 45, 56, 67, 78, 89 };
        String[] names = { "Falih", "Tyson", "Ronaldo", "Kohli" };

        Arrays.stream(names).forEach(System.out::println);
        System.out.println();
        
        for(int i=0; i<numbers.length; i++){
            if (i==0) {
                System.out.println("For loop: ");
            }
            System.out.println(numbers[i]);
        }

        System.out.println("\nEnhanced Loop: ");
        for (String name: names) {
            System.out.println(name);
        }
    }
}