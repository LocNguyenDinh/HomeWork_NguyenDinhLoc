package DoublyLinkedList;

public class Node {
    String data;
    Node next;
    Node pre;

    public Node(String data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
    public void printData(){
        System.out.println(this.data);
    }
}
