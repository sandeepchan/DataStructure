public class NthNodeFromENd {

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
        int count = 0;
        curr = first;
        while (curr != null)
        {
            count++;
            curr = curr.node;
        }
       int N = 2;
       count = count - N ;
       curr = first;
       for(int i =0 ; i < count; i++)
       {
           curr = curr.node;
       }
        System.out.println(curr.data);
        effiecentWay(first, 2);
    }

    public static LinkedList effiecentWay(LinkedList head, int N)
    {
        LinkedList second = head;
        LinkedList first = head;
        for(var i =0; i < N; i++)
        {
            first = first.node;
        }
        while (first != null)
        {
            first = first.node;
            second = second.node;
        }
        System.out.println(second.data);
        return null;
    }
}
