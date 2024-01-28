public class MiddleLinkedlist {
    public static void main(String[] args) {
        LinkedList first = new LinkedList(10);
        LinkedList curr = first;
        int [] arr = {15, 16, 17, 21, 22};
        for(var i = 0; i < arr.length; i++)
        {

               var tmp = new LinkedList(arr[i]);
                curr.node = tmp;
                curr = tmp;

        }
        curr = first;
        int count = 0;
        while (curr != null)
        {
            count = count+1;
            curr = curr.node;
        }
        curr = first;
        for(int i =0; i <= count/2; i++)
        {
            curr = curr.node;
        }

        System.out.println(efficientWay(first).data);

    }


    public static LinkedList efficientWay(LinkedList head)
    {
        if(head  == null)
        {
            return  null;
        }
        LinkedList slow = head;
        LinkedList fast = head;
        while (fast != null && fast.node != null)
        {
            slow = slow.node;
            fast = fast.node.node;
        }
        return  slow;
    }
}
