public class MyLinkedlist {

      MyLinkedlist next;
      MyLinkedlist prev;
      int data;
      static  MyLinkedlist top = null;

    public MyLinkedlist(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public static void push(int item, MyLinkedlist node)
    {
        MyLinkedlist tmp = new MyLinkedlist(10);
        node.next = tmp;
        tmp.prev = node;
        top = tmp;

    }
    public static Integer pop()
    {
        int data = top.data;
        top =top.prev;
        top.next = null;
        return  data;

    }
    public static boolean isEmpty(){
        return  top != null ? false : null;
    }
    public static  int peel(){
        return  top.data;
    }
}
