package Linkedlist;

import org.w3c.dom.Node;

import java.util.List;

public class ReverseByK {

    public static void main(String[] args) {
        List <Integer> data = List.of(1,2,3,4,5,6,7,8,9);

        int k = 3;
        var head = LinkedList1.getLinkedList(data);
        var result =  reverse(head, k);
        LinkedList1.display(result);
    }

    public static MyLinkedlist reverse(MyLinkedlist head,  int k)
    {

        var curr = head;
        MyLinkedlist prev = null, next = null;
        int c = 0;
        while ( curr != null && c < k)
        {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
          c++;



        }

        if(next != null)
        {
           MyLinkedlist res =  reverse(next, k);
           head.next = res;

        }
        return  prev;
    }
}
