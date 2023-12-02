public class CircularLinkedlist {

    public static void main(String[] args) {
       var head = new Cicular(20);
       int [] data = {45, 56, 10, 90};
       Cicular cur = head;
       for (var item: data)
       {
           var tmp = new Cicular(item);
           cur.next  = tmp;
           cur = tmp;
       }
       cur.next = head;
       display(head);
       System.out.println("Start at Beginning");
       var start =  insertAtBegin(head, 100);
       display(start);

        System.out.println("Start at Beginning Efficient");
       display(insertAtEndff(start, 123));


        System.out.println("Insert At end");
        display(insertAtEnd(start, 1));
        System.out.println("Insert At end Efficient");
        var insertEndEff = insertAtEndEff(start, 13);
        display(insertEndEff);

        System.out.println("Delete Head");
        deleteHead(insertEndEff);

    }
    public static  void display(Cicular head){
        var tmp = head;
        do{
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        while (tmp != head);
    }
    public  static  Cicular insertAtBegin(Cicular head, int data){
        var tmp = new Cicular(data);
        if(head == null)
        {

            return  tmp;

        }
        var cur = head;

        while (cur.next!=head){
            cur = cur.next;
        }
        cur.next = tmp;
        tmp.next = head;
        return  tmp;
    }

    public static Cicular insertAtEndff(Cicular head, int data){
        var tmp = new Cicular(data);
        if(head == null)
        {

            return  tmp;

        }
        var temp = head;
        tmp.next = head.next;
        head.next = tmp;
        int t = head.data;
        head.data = tmp.data;
        tmp.data = t;

        return  head;
    }


    public  static  Cicular insertAtEnd(Cicular head, int data)
    {
        var tmp = new Cicular(data);
        if(head == null)
        {

            return  tmp;

        }
        var curr = head;
        while (curr.next != head)
        {
            curr = curr.next;
        }
        curr.next = tmp;
        tmp.next = head;
        return head;
    }

    public static Cicular insertAtEndEff(Cicular head, int data)
    {
        var tmp = new Cicular(data);
        if(head == null)
        {
            return  tmp;
        }
        else{
            tmp.next = head.next;
            head.next = tmp;
            tmp.data = head.data;
            head.data = data;
        }
        return  tmp;
    }

    public  static  Cicular deleteHead(Cicular head)
    {

        if(head == null)
        {
            return  null;
        }
        var curr = head;
        while (curr.next != head)
        {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    public  static  Cicular deleteHeadEff(Cicular head)
    {

        if(head == null)
        {
            return  null;
        }
        if(head.next == head)
        {
            return  null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public  static  Cicular deleteKt(Cicular head, int k)
    {
        if(head == null)
        {
            return  null;
        }
        var curr = head;
        for(int i =0; i <k-2; i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return  head;
    }
}


