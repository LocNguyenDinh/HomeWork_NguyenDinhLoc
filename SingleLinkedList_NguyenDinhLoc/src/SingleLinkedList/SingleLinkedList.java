package SingleLinkedList;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(Node node) {
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
            size++;
    }

    public void updateAtPosition(String key, int position) {
        Node currentNode = head;
        Node prevNode = null;
        int counter = 0;
        while (currentNode != null) {
            if (counter == position) {
                currentNode.data = key;
                break;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        if (currentNode == null) {
            System.out.println(position + " position element not found");
        }
    }

    public void deleteByKey(String key) {
        Node preNode = null;
        Node currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            if (currentNode.data == key) {
                if (counter == 0) {
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    }
                } else if (counter == size - 1) {
                    preNode.next = null;
                    tail = preNode;
                } else {
                    preNode.next = currentNode.next;
                }
                size--;
                return;
            }
            counter++;
            preNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void ShowData() {
        System.out.println("Linked List: ");
        Node currentNode = head;
        while (currentNode != null) {
            currentNode.printData();
            currentNode = currentNode.next;
        }
        System.out.println();

    }
}
