package Linkedlist;

import java.util.List;

//Add two numbers represented as Linked Lists
//Problem Statement: Given the heads of two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
public class TwONumberAsLikedlist {

    public static void main(String[] args) {
        var l1 = LinkedList1.getLinkedList(List.of(9,9,9,9,9,9,9));
        var l2  = LinkedList1.getLinkedList(List.of(9,9,9,9));


        var l3 = LinkedList1.getLinkedList(List.of(2,4,3));
        var l4  = LinkedList1.getLinkedList(List.of(5,6,4));

        l1 = LinkedList1.betterApproachReverse(l1);
        l2 = LinkedList1.betterApproachReverse(l2);
        LinkedList1.display(l1);
        System.out.println("Second");
        LinkedList1.display(l2);

        // assuming l1 has greater length

        var carry = 0;
        var curr = l1;

        while (curr != null)
        {
            var sum = curr.data + carry;
            if(l2 != null)
            {
                sum +=  l2.data;
                l2= l2.next;
            }

            carry =  sum /10;
            curr.data = sum % 10;
            if(curr.next == null && carry != 0)
            {
                MyLinkedlist newNode = new MyLinkedlist(carry);
                curr.next = newNode;
                break;
            }
            curr = curr.next;

        }





        System.out.println(carry + "let print sum");

        LinkedList1.display(l1);
    }
}
