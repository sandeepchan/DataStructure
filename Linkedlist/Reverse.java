public class Reverse {
    public static void main(String[] args) {
        LinkedList first = new LinkedList(10);
        LinkedList curr = first;
        int [] arr = {15, 16, 17, 21, 22};
        for(var i = 0; i < arr.length; i++)
        {

            var tmp = new LinkedList(arr[i]);
            curr.node = tmp;
            curr = tmp;

        }


        System.out.println("Efficient");
        curr = first;
        iteratable(first);

    }

   private  static  LinkedList iteratable(LinkedList first)
   {
       var curr = first;
       curr = first;
       LinkedList prev = null;
       while (curr != null)
       {
           var node = curr.node;
           curr.node = prev;
           prev = curr;

           curr = node;
       }

       while (prev != null)
       {
           System.out.println(prev.data);
           prev = prev.node;
       }
       return  prev;

   }

}




