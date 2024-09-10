class Method{
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'B', 'A', 'A', 'D' };
        int lettersCount = checkLetters(letters, 'A');
        System.out.println(lettersCount);
    }

    public static int checkLetters(char[] letters, char searchLetter){
        int count = 0;
        for(char letter:letters){
            if(letter == searchLetter){
                count++;
            }
        }
        return count;
    }
}