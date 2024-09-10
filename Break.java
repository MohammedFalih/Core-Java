import java.util.Scanner;

class Break{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("enter number: ");
        while(true){
            n = sc.nextInt();
            if(n<=0){
                break;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();
    }
}