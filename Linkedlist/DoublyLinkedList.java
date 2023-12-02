public class DoublyLinkedList {
   public  static  void main (String [] args)
   {
       var first = new Node(10);
       var second = new Node(20);
       var third = new Node(30);
       first.next = second;
       second.next = third;
       third.prev = second;
       second.prev = first;


       var insertBeg = insertAtBegin(first, 90);
       printList(insertBeg);
       insertAtEnd(insertBeg, 57);
       System.out.println("Start at end");
       printList(insertBeg);
       System.out.println("Reverse Node");
       var reverse = reverse(insertBeg);
       printList(reverse);
       System.out.println("Delete At Last");
       var delLast = deleteLast(reverse);
       printList(delLast);
   }

   public  static  void printList(Node head)
   {
       var curr= head;
       while (curr != null)
       {
           System.out.println(curr.data);
           curr = curr.next;
       }
   }
   public static Node insertAtBegin(Node head, int data)
   {
      var tmp = new Node(data);
      if(head!= null)
      {
          head.prev = tmp;
      }
      tmp.next = head;
      return  tmp;
   }
    public static Node insertAtEnd(Node head, int data)
    {
        var tmp = new Node(data);
        if(head == null)
        {
            return  tmp;
        }
        var curr = head;
        while (curr.next != null)
        {
            curr = curr.next;

        }
        tmp.prev = curr;
        curr.next = tmp;
        return  head;
    }

    public  static Node reverse(Node head)
    {
        if (head == null || head.next == null)
        {
            return  head;
        }
     var tmp = head;
     Node prev = null;
     while (tmp != null){
         prev = tmp.prev;
         tmp.prev = tmp.next;
         tmp.next = prev;
         tmp = tmp.prev;

     }

     return  prev.prev;
    }


    public  static  Node deleteLast(Node head)
    {
        var tmp = head;
        if(head == null || head.next == null)
        {
            return  null;
        }
        while (tmp.next != null)
        {
            tmp = tmp.next;
        }
        tmp.prev.next = null;
        return  head;
    }
}

