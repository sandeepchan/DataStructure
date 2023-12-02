public class Node {
    Node prev;
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
