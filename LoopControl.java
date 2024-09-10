class LoopControl{
    public static void main(String[] args) {
        System.out.println("\nProblem 1:");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("\nProblem 2:");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print('x');
            }
            System.out.println();
        }
    }
}