package Revision;


import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Revision {
    public static void main(String args [])
    {
        InsertInSorted();
    }
    public static MyLinedList InsertInSorted()
    {
        List<Integer> data = Arrays.asList(1,2,2,3,3,4,5,5,5,5,7,8,8,8);
        int num = 6;
        var tmp = new MyLinedList(num);
        MyLinedList head = getLinkedList(data);

        var curr = head;
        while (curr.next != null )
        {
            if(num >= curr.data && num <=curr.next.data)
            {
                var next = curr.next;
                curr.next = tmp;
                tmp.next =next;
                break;


            }
            curr = curr.next;
        }
        System.out.println("For even");
        middleofLinkedList(head);
        printList(head);

        kthNode(head, 3);

        var updatedList = reverseList(head);

        removeDuplicate(updatedList);

        var child =  middleofLinkedList(head);
        var lastNode = updatedList;
        while (lastNode.next != null)
        {
            lastNode = lastNode.next;
        }
        lastNode.next = head;
        detectLoop(updatedList);

        List<Integer> forPali = List.of(1,2,2,1);
        var pal = getLinkedList(forPali);
        System.out.println(isPalindrome(pal));


        System.out.println(efficientPalindrome(pal));

        return  null;
    }
    public static MyLinedList getLinkedList(List<Integer> data){
        MyLinedList head = null;
        var curr = head;
        for(var item : data)
        {
            var tmp = new MyLinedList(item);
            if(head == null)
            {
                head = tmp;

            }
            else{
                curr.next = tmp;
            }
            curr = tmp;

        }
        return  head;

    }
    public  static  void printList(MyLinedList head)
    {
        var curr = head;
        while (curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


    public static MyLinedList middleofLinkedList(MyLinedList head)
    {
        MyLinedList slow =head;
        MyLinedList fast = head;
        while (fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }


    public static void kthNode(MyLinedList head, int k)
    {  if(head == null)
        {
            return ;
        }
        var slow = head;
        var forward = head;
        for(int i =0; i< k; i++)
        {

            forward = forward.next;
        }
        while (forward != null)
        {
            slow = slow.next;
            forward = forward.next;
        }

        System.out.println(slow.data);
    }


    public static  MyLinedList  reverseList(MyLinedList head)
    {
        MyLinedList prev = null;
        var curr = head;
        while (curr != null)
        {
            var next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        System.out.println("Reverse is");
        printList(prev);
        return prev;
    }

    public  static  void removeDuplicate(MyLinedList head)
    {
        System.out.println("Remove duplicate");
        var curr = head;
        while (curr.next != null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        printList(head);
    }

    public static  void detectLoop(MyLinedList head)
    {
        var slow = head;
        var fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }

        }

        slow = head;

        while (slow.next != fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        System.out.println("Remove circle");
        printList(head);
    }


    public static boolean isPalindrome(MyLinedList head)
    {
        Stack<Integer> data= new Stack<>();
        var curr = head;
        while (curr != null)
        {
            data.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while (curr!= null)
        {
            if(data.pop() != curr.data) return  false;
            curr = curr.next;
        }
        return  true;
    }

    public static boolean efficientPalindrome(MyLinedList head)
    {
       var mid = middleofLinkedList(head);
       var rev = reverseList(mid);
       var curr = head;

       while (rev != null)
       {
           if(curr.data != rev.data) return  false;
           curr = curr.next;
           rev = rev.next;
       }
       return  true;
    }
}
