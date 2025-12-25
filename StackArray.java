import java.util.Scanner;

public class StackArray {

    int[] stack;
    int top;
    int size;

    // Constructor
    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // PUSH operation (split form)
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;                 // move top
            stack[top] = value;    // insert element
            System.out.println(value + " pushed into stack");
        }
    }

    // POP operation (split form)
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int removed = stack[top];  // read top element
            top--;                     // move top down
            System.out.println(removed + " popped from stack");
        }
    }

    // TRAVERSE operation
    void traverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("---- Stack ----");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        StackArray st = new StackArray(size);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.traverse();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
