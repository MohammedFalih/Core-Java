class EnhancedLoop{
    public static void main(String[] args) {
        int[] marks = { 90, 88, 47, 89, 97};
        int highestScore = maximum(marks);
        System.out.println("The highest score is: " + highestScore);
    }

    public static int maximum(int[] numbers){
        int maxMark = numbers[0];
        for(int mark:numbers){
            if(mark > maxMark){
                maxMark = mark;
            }
        }
        return maxMark;
    }
}