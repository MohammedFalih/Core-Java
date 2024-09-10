import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        // @SuppressWarnings("unused")
        int english, language, maths, science, social;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMarkLists below: ");

        System.out.println("Enter your english score: ");
        english = scanner.nextInt();
        System.out.println("Enter your language score: ");
        language = scanner.nextInt();
        System.out.println("Enter your maths score: ");
        maths = scanner.nextInt();
        System.out.println("Enter your science score: ");
        science = scanner.nextInt();
        System.out.println("Enter your social score: ");
        social = scanner.nextInt();

        int totalScore = english + language + science + maths + social;
        System.out.println("Total score: "  + totalScore);
        int average = totalScore / 5;
        System.out.println("Average: " + average);

        System.out.println("\nGet your Grade: ");

        if (average > 90) {
            System.out.println("You have secured First Grade");
        } else if (average > 75) {
            System.out.println("You have secured Second grade");
        } else if (average > 50) {
            System.out.println("You have secured Third Grade");
        } else if (35 > totalScore) {
            System.out.println("You are just pass");
        } else {
            System.out.println("You have failed.");
        }

        scanner.close();
    }
}