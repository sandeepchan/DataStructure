public class CircularDoubly {
    public static void main(String [] args)
    {
        var head = new Node(10);
        var curr = head;
        for(int i = 0; i < 5; i++)
        {
            var tmp = new Node(10 + i);
            tmp.prev = curr;
            curr.next = tmp;
            curr = tmp;
        }
        head.prev = curr;
        curr.next = head;
        curr = head;
        while (curr.next != head)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
