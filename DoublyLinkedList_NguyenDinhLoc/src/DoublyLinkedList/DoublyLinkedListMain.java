package DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList= new DoublyLinkedList();
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
                    System.out.println("Input subject: ");
                    String data = scanner.nextLine();
                    Node node = new Node(data);
                    doublyLinkedList.insert(node);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("2. Update: ");
                    System.out.println("Input subject: ");
                    String key = scanner.nextLine();
                    System.out.println("Input position: ");
                    int position = Integer.parseInt(scanner.nextLine());
                    doublyLinkedList.update(key,position);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("3.Delete: ");
                    System.out.println("Input subject: ");
                    String delete = scanner.nextLine();
                    doublyLinkedList.delete(delete);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("4. Show all subject: ");
                    doublyLinkedList.showData();
                    break;
                case 5:
                    System.out.println("Exit");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
