class MathClass{
    public static void main(String[] args) {
        int x = (int) (Math.random()*101);
        int y = 100 + (int) (Math.random() * 100);
        System.out.println(x);
        System.out.println(y);
        System.out.println("Max number: "+ Math.max(x,y));
        System.out.println("Min number: " + Math.min(x,y));
        System.out.println(Math.abs(-23.33));
    }
}