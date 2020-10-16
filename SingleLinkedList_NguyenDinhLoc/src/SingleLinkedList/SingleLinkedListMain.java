package SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
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
                    singleLinkedList.insert(node);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("2. Update: ");
                    System.out.println("Input subject: ");
                    String key = scanner.nextLine();
                    System.out.println("Input position: ");
                    int position = scanner.nextInt();
                    singleLinkedList.updateAtPosition(key, position);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("3.Delete: ");
                    System.out.println("Input subject: ");
                    String delete = scanner.nextLine();
                    singleLinkedList.deleteByKey(delete);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("4. Show all subject: ");
                    singleLinkedList.ShowData();
                    break;
                case 5:
                    System.out.println("Exit");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
