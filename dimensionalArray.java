import java.util.Arrays;

class DimensionArray{
    public static void main(String[] args) {
        int[][] twoD = new int[2][2];
        twoD[0][0] = 12;
        twoD[0][1] = 15;
        twoD[1][0] = 20;
        twoD[1][1] = 43;

        System.out.println(Arrays.deepToString(twoD));
    }
}