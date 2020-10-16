package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(Node node) {
        node.next = head;
        node.pre = null;
        if (head != null)
            head.pre = node;
        head = node;
        if (tail == null)
            tail = node;
        size++;
    }

    public void update(String key, int position) {
        Node currentNode = head;
        Node preNode = null;
        int counter = 0;
        while (currentNode != null) {
            if (counter == position) {
                currentNode.data = key;
                break;
            } else {
                preNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
        if (currentNode == null) {
            System.out.println("Position element not found");
        }
    }

    public void delete(String key) {
        Node preNode = null;
        Node currentNode = this.head;
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
                this.size--;
                return;
            }
            counter++;
            preNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void showData() {
        System.out.println("Doubly Linked List: ");
        Node current = head;
        while (current != null) {
            current.printData();
            current = current.next;
        }
        System.out.println();
    }

}
