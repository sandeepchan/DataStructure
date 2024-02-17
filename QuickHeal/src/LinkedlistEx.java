public class LinkedlistEx {
    int val;
    LinkedlistEx next;

    public LinkedlistEx(int val) {
        this.val = val;
        this.next = null;
    }
    public static LinkedlistEx reverse(LinkedlistEx head)
    {
        LinkedlistEx prev = null;
        LinkedlistEx curr = head;
        while (curr!=null)
        {
            LinkedlistEx next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
    }

}
