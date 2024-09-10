import java.util.Arrays;

class Arr{
    public static void main(String[] args) {

        // once the array is initialized with a size  you cannot add more.
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        /*
         * Even when you use an initializer list with an array, the array still has a
         * fixed size that is implicitly determined, so you cannot add more
         */
        String[] students = { "Falih", "Ghazali", "Thoufik", "Najeemudhin"} ;
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(students));
    }
}