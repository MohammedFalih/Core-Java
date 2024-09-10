package DataStack;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack reached its limit.");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if(tos>=0){
            return stack[tos--];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
}
