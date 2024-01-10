import java.util.*;

public class SortKeysVal {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("i", 2);
        data.put("d", 1);
        data.put("k", 4);
        data.put("l", 2);

        Comparator<Map.Entry<String, Integer>> cpm =  new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int val  = o1.getValue().compareTo(o2.getValue());
                if(val == 0)
                {
                    return  o1.getKey().compareTo(o2.getKey());
                }
                return val;
            }
        };
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(data.entrySet());
        System.out.println(data.entrySet());
        Collections.sort(list, cpm);

        System.out.println(Arrays.toString(list.toArray()));






    }
}
