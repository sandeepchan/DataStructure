public class reverseLinkedlistBySize {
    public static void main(String[] args) {
        var result = createLinkedList();
        int count = 0;
        int k = 3;
        var curr = result;
        while (curr!=null)
        {
            count++;
            curr = curr.node;


        }
        System.out.println(count/3);
    }
    public  static  LinkedList createLinkedList()
    {
        LinkedList first = new LinkedList(10);
        LinkedList curr = first;
        int [] arr = {20, 30, 40, 50, 60, 70};
        for(var i = 0; i < arr.length; i++)
        {

            var tmp = new LinkedList(arr[i]);
            curr.node = tmp;
            curr = tmp;

        }

        curr = first;
        return  curr;
    }
}
