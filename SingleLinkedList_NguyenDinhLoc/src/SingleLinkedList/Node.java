package SingleLinkedList;

public class Node {
    public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
    public  void printData(){
        System.out.println(this.data);
    }

}
