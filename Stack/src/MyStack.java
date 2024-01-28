import java.util.ArrayList;

public class MyStack {
    static ArrayList<Integer> arr = new ArrayList<>();

    public  static void push(int item)
    {
        arr.add(item);
    }
    public static Integer pop()
    {
        int res = arr.get(arr.size() -1);
        arr.remove(arr.size() -1);
        return  res;
    }
    public static boolean isEmpty(){
        return  arr.isEmpty();
    }
    public static int peek(){
        return  arr.get(arr.size()-1);
    }
}
