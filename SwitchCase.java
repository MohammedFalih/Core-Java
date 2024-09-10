import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();
        System.out.println("Choose an operator [ +, -, *, /, % ]: ");
        char operator = scanner.next().charAt(0);

        switch(operator){
            case '+': 
            System.out.println(a + "+" + b + "=" + (a+b));
            break;
            case '-': 
            System.out.println(a + "-" + b + "=" + (a-b));
            break;
            case '*':
            System.out.println(a + "*" + b + "=" + (a*b));
            break;
            case '/':
            System.out.println(a + "/" + b + "=" + (a/b));
            break;
            case '%':
            System.out.println(a + "%" + b + "=" + (a%b));
            break;
        }
        scanner.close();
    }
}