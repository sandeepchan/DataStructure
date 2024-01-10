package Linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);

        MyLinkedlist head = getLinkedList(data);



        display(nativeReverseMethod(head));

        System.out.println("Better Approach");
        var reverse = betterApproachReverse(head);
        display(reverse);
        System.out.println("Middle of Linked list");
        var middle = middleOfList(reverse);
        System.out.println(middle.data);


        System.out.println("Merged List");
        var l1 = getLinkedList(Arrays.asList(3, 7, 10));
        var l2 = getLinkedList(Arrays.asList(1,2,5,8,10));

        var mergedLinkedList = mergeList(l1, l2);
        display(mergedLinkedList);

        var result = removenth(reverse, 3);

        display(result);


        System.out.println("Intersection");
        var dd = intersection();
        System.out.println(dd.data);


        System.out.println("Detect Loop ");
        detectLoop();


    }
    public static MyLinkedlist getLinkedList(List<Integer> data){
        MyLinkedlist head = null;
        var curr = head;
        for(var item : data)
        {
            var tmp = new MyLinkedlist(item);
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
    public static void display(MyLinkedlist head){
        var curr = head;
        while (curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static MyLinkedlist nativeReverseMethod(MyLinkedlist head){
        Stack<Integer> stack = new Stack<>();
        var curr =head;
        while (curr != null)
        {
            stack.push(curr.data);
            curr = curr.next;

        }

        curr = head;
        while (curr != null)
        {
            curr.data = stack.pop();
            curr = curr.next;
        }
        return  head;

    }

    public static MyLinkedlist betterApproachReverse(MyLinkedlist head)
    {
        var curr = head;
        MyLinkedlist  prev = null;
        while (curr != null)
        {
            var next = curr.next;

            curr.next = prev;
            prev =curr;
            curr = next;
        }
        return  prev;
    }



    public static  MyLinkedlist middleOfList(MyLinkedlist head)
    {
        if(head  == null)
        {
            return null;
        }
        var slow = head;
        var fast = head;

        while (fast != null  &&  fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

    public static  MyLinkedlist mergeList(MyLinkedlist l1, MyLinkedlist l2)
    {
        // use sort
        var curr = l1;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        System.out.println(curr);
        curr.next = l2;
        return  l1;
    }


    public  static  MyLinkedlist removenth(MyLinkedlist head, int k)
    {
        var slow = head;
        var fast = head;
        for (int i = 0 ; i < k; i++)
        {
            fast = fast.next;
        }

        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static  MyLinkedlist intersection(){
        MyLinkedlist head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        MyLinkedlist head1 = head;
        head = head.next.next.next;
        MyLinkedlist headSec = null;
        headSec=insertNode(headSec,3);
        MyLinkedlist head2 = headSec;
        headSec.next = head;
        //printing of the lists

        return  intersectionPoint(head1, head2);

    }

    static  MyLinkedlist intersectionPoint(MyLinkedlist l1, MyLinkedlist l2){

        HashSet<MyLinkedlist> lists = new HashSet<>();
        while (l1 != null)
        {
            lists.add(l1);
            l1 = l1.next;
        }
        while (l2 != null)
        {
            if(lists.contains(l2)) return  l2;
            l2 = l2.next;
        }
        return  null;
    }

    static MyLinkedlist insertNode(MyLinkedlist head,int val) {
        MyLinkedlist newNode = new MyLinkedlist(val);

        if(head == null) {
            head = newNode;
            return head;
        }

        MyLinkedlist temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }


    static void createCycle(MyLinkedlist head,int a,int b) {
        int cnta = 0,cntb = 0;
        MyLinkedlist p1 = head;
        MyLinkedlist p2 = head;
        while(cnta != a || cntb != b) {
            if(cnta != a)
            {p1 = p1.next; ++cnta;}
            if(cntb != b)
            {p2 = p2.next; ++cntb;}
        }
        p2.next = p1;
    }
    static  void detectLoop(){
        MyLinkedlist head = null;
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);
        createCycle(head,1,3);//creating cycle in the list

        var removedLoop = detectCycle(head);
        display(removedLoop);
    }

    static MyLinkedlist detectCycle(MyLinkedlist myLinkedlist)
    {
        var slow = myLinkedlist;
        var fast = myLinkedlist;
        var isLoop = false;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                isLoop = true;
                break;
            }

        }
        if(isLoop) {
            slow = myLinkedlist;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;

            }
            System.out.println(fast.data);
            fast.next = null;
        }
        return  myLinkedlist;
    }


}
