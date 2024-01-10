public class duplicateSorted {

    public static void main(String[] args) {
        LinkedList node = createLinkedList();
       removeDuplicate(node);

        var curr = node;

        while (curr != null)
        {
            System.out.println(curr.data);
            curr = curr.node;
        }

    }
    public  static  LinkedList createLinkedList()
    {
        LinkedList first = new LinkedList(10);
        LinkedList curr = first;
        int [] arr = {10, 20, 20, 30, 30, 30};
        for(var i = 0; i < arr.length; i++)
        {

            var tmp = new LinkedList(arr[i]);
            curr.node = tmp;
            curr = tmp;

        }

        curr = first;
        return  curr;
    }

    public static void removeDuplicate(LinkedList head){
      var curr  = head;
      while (curr != null && curr.node != null)
      {
          if(curr.data != curr.node.data)
          {
              curr = curr.node;
          }
          else{
              curr.node = curr.node.node;
          }
      }

    }
}
