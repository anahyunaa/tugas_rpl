//Latihan 1
class Stack 
{
    private int[] stck;
    private int index;

    public Stack() {
        stck = new int[10];
        index = -1; 
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stck[index--];
        }
    }
}

public class App {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            stack1.push(i + 1); 
        }

        for (int i = 0; i < 10; i++) {
            stack2.push(i + 10); 
        }

        System.out.println("Isi stack 1 :");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("\nIsi stack 2 :");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack2.pop());
        }
    }
}
