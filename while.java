import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        int x = 1, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        int n, result = 0;
        System.out.println("Enter number: ");
        n = scanner.nextInt();
        while(n>0){
            if(n%10==0){
                result = n;
                break;
            }
            n--;
        }
        System.out.println("\nThe result is: " + result + "\n");
        scanner.close();

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n\n");

        while(count <= 10){
            System.out.println("Count is: " + count);
            count += 2;
        }

        while(x<=5){
            sum += x;
            x++;
        }
        System.out.println("The summation is: " + sum);
    }
}