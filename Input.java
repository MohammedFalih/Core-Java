import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String email;
        String city;
        char gender;
        int age;
        boolean indian;

        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        System.out.println("Gender: ");
        gender = scanner.next().charAt(0);

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Where are you from? ");
        city = scanner.nextLine();

        System.out.println("Are you a Indian Citizen? ");
        indian = scanner.nextBoolean();

        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Indian: " + indian);

        scanner.close();
    }
}