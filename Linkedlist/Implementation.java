public class Implementation {
    public static void  main(String [] args)
    {
       var first = new LinkedList(10);
       var second = new LinkedList(20);
       first.node = second;
       var third = new LinkedList( 30);
       second.node = third;

       var insertNew = insertAtBeginning(first, 60);
        insertAtLast(third, 6);
       var temp = insertNew;


       while (temp != null)
       {
           System.out.println("data is "+ temp.data);
           temp = temp.node;
       }
        var newlist = insertAtGivenLast(insertNew, 2, 34);
        recursiveCall(newlist);
        System.out.println("delete First");
        var deleteFirst= deleteFirstNode(newlist);
        recursiveCall(deleteFirst);
        System.out.println("delete Last");
        var deleteLast = deleteLastNode(deleteFirst);
        recursiveCall(deleteLast);

        int idx = serachData(deleteLast, 34);
        System.out.println("Index is " + idx);

        System.out.println("Index recursive call " + searchDataRecursive(deleteFirst, 30));

    }
    public static LinkedList recursiveCall(LinkedList node)
    {
        if(node != null)
        {
            System.out.println("recursive call data is " + node.data);
            return recursiveCall(node.node);
        }
        return null;

    }
    public  static  LinkedList insertAtBeginning(LinkedList node, int data)
    {
         LinkedList temp = new LinkedList(data);
         temp.node = node;
         return temp;
    }
    public  static  void insertAtLast(LinkedList head, int data)
    {
        var tmp = head;
        if(head == null){
            System.out.printf("head" + head.node);
            return;
        }
        while (tmp.node != null)
        {
            tmp = tmp;
        }
        var temp = new LinkedList(data);
        tmp.node = temp;
    }
    public  static  LinkedList insertAtGivenLast(LinkedList head,int pos, int data)
    {
        LinkedList temp = new LinkedList(data);
        if(head == null)
        {
            return null;
        }
        if(pos ==1)
        {
            temp.data = data;
            return temp;
        }
        LinkedList curr = head;
        for(var i= 0; i < pos-1 && curr != null; i++)
        {
             curr = curr.node;
        }
        temp.node = curr.node;
        curr.node = temp;

        return  head;

    }

    public  static LinkedList deleteFirstNode(LinkedList head)
    {
        if(head == null)
        {
            return  null;
        }
        return  head.node;
    }

    public  static LinkedList deleteLastNode(LinkedList head)
    {
        if(head == null)
        {
            return  null;
        }
        LinkedList curr= head;
        while (curr.node.node != null)
        {
           curr = curr.node;
        }
        curr.node = null;
        return  head;
    }


    public static int serachData(LinkedList list, int data)
    {
        var curr = list;
        int  i = 0;
        while (curr != null)
        {
            if(curr.data == data)
            {
                return  i;
            }
            curr = curr.node;
            i++;
        }
        return  -1;
    }


    public static  int searchDataRecursive(LinkedList list, int data)
    {
        if(list == null)
        {
            return  -1;
        }
        if(list.data == data)
        {
            return 1;
        }
        else{
            int res =  searchDataRecursive(list.node, data);
            if(res == -1)
            {
                return  -1;
            }
            else {
                return res+1;
            }
        }

    }
}
