public class Main {
    public static void main(String[] args) {
        LinkedlistEx head = new LinkedlistEx(5);
        LinkedlistEx second = new LinkedlistEx(6);

        LinkedlistEx third = new LinkedlistEx(1);
        LinkedlistEx fourth = new LinkedlistEx(2);

        head.next = second;
        second.next = third;
        third.next = fourth;

        var revers = LinkedlistEx.reverse(head);
        var reverse = revers;

        while (reverse!= null)
        {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }


    }
}