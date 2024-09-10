class Ternary{
    public static void main(String[] args) {
        int a=10, b=80, age = 21;
        int max;
        String message;

        max = (a>b) ? a : b;
        message = (age > 18) ? "Eligible to vote" : "not eligible to vote";

        System.out.println("Max number: " + max);
        System.out.println("Check Eligibility: " + message);
    }
}