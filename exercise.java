class Exercise {
    public static void main(String[] args) {
        int a = 3, b = 4, c, d=12;
        d += 100;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println(c);
        System.out.println(d);
    }
}