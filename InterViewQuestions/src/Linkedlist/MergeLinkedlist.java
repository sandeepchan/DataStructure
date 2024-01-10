package Linkedlist;

import java.util.List;

public class MergeLinkedlist {
    public static void main(String[] args) {
         var l1 = LinkedList1.getLinkedList(List.of(10,20,30));
         var l2  = LinkedList1.getLinkedList(List.of(5, 25));
         MergeLinkedlist tmp = null;
         MyLinkedlist head = null;
        MyLinkedlist tail = null;
        if(l1.data < l2.data)
         {
             head = tail = l1;
             l1 = l1.next;
         }
        else{
            head = tail = l2;
            l2 = l2.next;
        }
         while (l1 != null && l2!=null)
         {
             if(l1.data <= l2.data)
             {
                 tail.next = l1;
                 tail = l1;
                 l1 = l1.next;

             }
             else {
                 tail.next = l2;
                 tail = l2;
                 l2 = l2.next;
             }

         }
         if(l1 !=null)
        {
            tail.next = l1;
        }
        else if(l2 != null)
         {
             tail.next = l2;
         }


        LinkedList1.display(head);
    }
}
