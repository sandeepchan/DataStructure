import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Demo, String> dd = new HashMap<>();
        var t1 = new Demo();
        var t2 = new Demo();
        var t3 = new Demo();
        var t4 = new Demo();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        dd.put(t1, "A");
        dd.put(t2, "B");
        dd.put(t3, "C");
        dd.put(t4, "E");

        System.out.println(dd.size());
        System.out.println(dd.get(t3));
    }
}

