class Label{
    public static void main(String[] args) {
        outerLoop:
        for(int i=1; i<=5; i++){
            innerLoop:
            for(int j=1; j<=5; j++){
                if(i==2 && j==2){
                    break innerLoop;
                }
                if(i==4 && j==4){
                    break outerLoop;
                }
                System.out.print("x");
            }
            System.out.println("");
        }
        System.out.println("\nContinue Statement");
        int count = 23;
        for(int i=1; i<=count; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}