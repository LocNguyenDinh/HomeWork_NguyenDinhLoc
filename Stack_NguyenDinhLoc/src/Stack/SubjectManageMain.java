package Stack;

import java.util.Scanner;

public class SubjectManageMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("SUBJECT MANAGE");
            System.out.println("1. Insert ");
            System.out.println("2. Update ");
            System.out.println("3. Delete ");
            System.out.println("4. Show All Subject ");
            System.out.println("5. Exit");
            System.out.println("Input your choose: ");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    scanner.nextLine();
                    System.out.println("1. Insert: ");
                    System.out.println("Subject: ");
                    String subject = scanner.nextLine();
                    stack.push(subject);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("2. Update: ");
                    System.out.println("Input subject position:");
                    int position = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input subject: ");
                    String subject1 = scanner.nextLine();
                    stack.update(subject1, position);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("3.Delete: ");
                    System.out.println("Input position remove: ");
                    int delete = scanner.nextInt();
                    stack.remove(delete);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("4. Show all subject: ");
                    stack.showData();
                    break;
                case 5:
                    System.out.println("Exit");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
