class ContinueStatement{

    /*
     * Continue statement is used within loops to skip the current iteration
     * and proceed directly to the next iteration of the loop...
     */
    public static void main(String[] args) {
        int count = 12;
        while(count >= 0){
            if(count==9 || count==11){
                count--;
                continue;
            }
            System.out.print(count + " ");
            count--;
        }

        System.out.println("\nNot div by 4 and 6: ");
        for(int i=0; i<=70; i++){
            if(i%4==0 || i%6==0){
                continue;
            }
            System.out.println(i);
        }
    }
}