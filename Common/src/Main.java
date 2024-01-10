import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("i", 2);
        data.put("d", 1);
        data.put("k", 4);
        data.put("l", 2);
        List<Map.Entry<String , Integer>> res = new ArrayList<>(data.entrySet());




        Comparator<Map.Entry<String, Integer>> comp = (s, v)->{
              int val = s.getValue().compareTo(v.getValue());
              if(val == 0)
              {
                  return  s.getKey().compareTo(v.getKey());

              }
              return  val;
        };


        res.sort(comp);

        res.forEach(System.out::println);


        maxsummArray();


    }


    public  static int binarySearch(int arr [],int l, int  r, int x){
        if(r >= l)
        {
            int mid = l + (r -l) / 2;
            if(arr[mid] == x)
            {
                System.out.println("Found" + mid + " value " + x);
            }
            else if (arr[mid]  > x){

                return binarySearch(arr, l, mid -1, x);

            }
            else {
                return binarySearch(arr, mid, r, x);
            }
        }
        return -1;

    }

    public  static  void maxsummArray(){
        int arr [] = {10,21,123,56,10,1,2, 300};
        int k = 3;
        int Max_sum = Integer.MIN_VALUE;
        int j = 0;
        int i =0;
        int required = k;
        int curr_sum = 0;
        while (j < arr.length)
        {
            curr_sum += arr[j];
            required--;

            while (required == 0)
            {
                if(curr_sum > Max_sum)
                {
                    Max_sum = curr_sum;

                }
                curr_sum = curr_sum - arr[i];
                i++;
                required= required + 1;
            }

            j++;
        }
        System.out.println(Max_sum);
    }
}


