package DataStack;
public class App {
    public static void main(String[] args) throws Exception {
        Stack s1 = new Stack();
        s1.push(15);
        s1.push(3);
        s1.push(6);
        s1.push(23);

        System.out.println(s1.pop());
    }
}
    