package Stack;

public class Stack {
    public static final int MAXIMUM = 100;
    int top = 0;
    String a[] = new String[MAXIMUM];

    Stack() {
        top = -1;
    }

    public void push(String subject) {
        if (top >= (MAXIMUM - 1)) {
            System.out.println("Stack Overflow");

        } else {
            a[++top] = subject;
            System.out.println(subject + " pushed into List");

        }
    }

    public String pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String subject = a[top--];
            return subject;
        }
    }

    public String peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String subject = a[top];
            return subject;
        }
    }

    public void update(String subject, int position) {
        a[position] = subject;
    }

    public void remove(int position) {
        if (top == 0) {
            System.out.println("List subject is empty!");
        } else {
            for (int i = position; i <= top; i++) {
                a[i] = a[i + 1];
                top--;
            }
        }
    }

    public void showData() {
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }
    }

}

