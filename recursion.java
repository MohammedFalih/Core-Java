class Recurion {
    public static void main(String[] args) {
        int result = sum(20);
        int result2 = sum(10,20);
        System.out.println("Total: " + result);
        System.out.println("with two parameters: " + result2);
    }

    /**
     * METHOD OVERLOADING - multiple methods can have the same method name
     * but different parameters
     *      * 
     * in the below methods, implemented method overloading
     */

    static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }

    static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end-1);
        }else{
            return 0;
        }
    }
}