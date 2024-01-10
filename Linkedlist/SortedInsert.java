public class SortedInsert {
      public static void main (String [] args)
      {
          int [] elements = {10, 20, 30 ,40};
          var head = new LinkedList(elements[0]);
          var curr = head;
          for (int i =1; i < elements.length; i++)
          {
              var tmp =  new LinkedList(elements[i]);
              curr.node =  tmp;
              curr = tmp;

          }
          int item = 35;
          insertSorted(head, item);


          display(head);
      }
      public  static LinkedList insertSorted(LinkedList head, int item)
      {
          var tmp = new LinkedList(item);
          if(head == null)
          {
              return  tmp;
          }
          if(item < head.data)
          {

              tmp.node = head;
              return  tmp;
          }

          var curr = head;
          while (curr.node != null && curr.node.data < item)
          {
              curr = curr.node;
          }
          tmp.node = curr.node;
          curr.node = tmp;
          return  head;

      }

      public static  void display(LinkedList head)
      {
          var curr = head;
          while (curr != null)
          {
              System.out.println(curr.data);
              curr = curr.node;
          }
      }
}
