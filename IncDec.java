class IncDec {
    public static void main(String[] args) {
        int a = 12, b = 20, c = 16, d, e, z = 0, x = 0;
        d = ++a + ++b + c++;
        e = a++ + b++ + ++c;
        int f = --z * ++x * ++d;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}