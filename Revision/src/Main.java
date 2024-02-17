import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo head = new LinkedListDemo(1);
        LinkedListDemo sec = new LinkedListDemo(2);
        LinkedListDemo th = new LinkedListDemo(3);
        LinkedListDemo fo = new LinkedListDemo(3);
        LinkedListDemo fi = new LinkedListDemo(2);
        LinkedListDemo fai = new LinkedListDemo(1);
        head.next = sec;
        sec.next = th;
        th.next = fo;
        fo.next = fi;
        fi.next = fai;

        System.out.println(mid(head).data);

        LinkedListDemo rev = reverse(head);

        printData(rev);
    }

    public static   LinkedListDemo mid(LinkedListDemo head)
    {
        LinkedListDemo slow = head;
        LinkedListDemo fast = head;

        while (fast!= null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

    public  static  LinkedListDemo reverse(LinkedListDemo head)
    {
        LinkedListDemo curr = head;
        LinkedListDemo prev = null;

        while (curr != null)
        {
            LinkedListDemo next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
    }
    public  static  void  printData(LinkedListDemo head)
    {
        LinkedListDemo curr = head;
        while (curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


    public  static  LinkedListDemo checkPali(LinkedListDemo head)
    {
        Stack<LinkedListDemo> data = new Stack<>();

        LinkedListDemo curr = head;
        while (curr!= null)
        {
            data.push(curr);
            curr = curr.next;
        }
    }
}