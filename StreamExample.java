import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,64,21,88,43,87);
        
        System.out.println("Stream with forEach: ");
        Stream <Integer> data = numbers.stream();  // you can only use the Stream once
        data.forEach(n -> {
            System.out.print(n + ", ");
        });

        System.out.println("\nStream with map: ");
        Stream<Integer> data2 = numbers.stream();
        Stream<Integer> mappedStream = data2.map(n -> n*2);
        mappedStream.forEach(n -> {
            System.out.print(n + ", ");
        });

        System.out.println("\n\nMultiple Streams");
        int total = numbers.stream()
            .filter(n -> n%2==1)
            .sorted()
            .map(n->n*3)
            .reduce(0, (a,b) -> a+b);
        System.out.println("Total: " + total);
        System.out.println();

        System.out.println("\nForeach loop: ");
        numbers.forEach(num -> {
            System.out.print(num + ", ");
        });

        System.out.println("\nFor loop");
        for (Integer num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
