import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Prime {
    public static void main(String args[]) {
        int number = 31;
        System.out.println(number + " is prime " + isPrime(number));
        System.out.println("Is palindrome "+isPlaindrome(121));
        twoSum();
        rotate();
        secondHighest();
        String data = "sandeepchand";


        HashSet<String> chs = new HashSet<>();
        var result = Arrays.stream(data.split("")).filter(s->!chs.add(s)).toList();
        System.out.println(result);

//       var result = data.chars().filter(s-> {
//           if(!chs.add((char) s)){
//
//               return  true;
//           }
//           return false;
//       }).toArray();
//
//        Arrays.stream(result).forEach(s-> System.out.println((char)s));


    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            System.out.println("Not a Prime Number");
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i < Math.sqrt(number); i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }


    public  static boolean isPlaindrome(int number)
    {

        int n = number;
        int rem = 0;
        int sum = 0;
        while(n >0)
        {
            rem = n % 10;
            n = n / 10;
            System.out.println(rem);
            sum =(sum * 10) + rem;
        }
        if(sum == number)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static int twoSum(){
        HashMap<Integer, Integer> count = new HashMap<>();

        int  nums [] = {2,7,11,15};
        int target = 9;
        for(int i = 0; i < nums.length; i++)
        {
            if(count.containsKey(target - nums[i]))
            {
                System.out.println(nums[count.get(target-nums[i])] + " second " + nums[i]);
                break;
            }
            else{
                count.put(nums[i], i);
            }
        }
        return  1;
    }
    public static void rotate(){
        int  nums [] = {2,7,11,15};
        int target = 2;
        for(int i = 0; i <  target; i++)
        {
            int first = nums[0];
            for(int j = 1; j < nums.length; j++)
            {
                nums[j-1] = nums[j];
            }
            nums[nums.length - 1] = first;
        }

    }


    public static  void secondHighest()
    {
        int  nums [] = {2,7,11,15, 14};
        int first, second;
       first = second = Integer.MIN_VALUE;

       for(int i = 0; i < nums.length; i++ )
       {
           if(nums[i] > first)
           {
               second = first;
               first = nums[i];
           }
           else if(nums[i] > second && nums[i] != first)
           {
               second = nums[i];
           }
       }
        System.out.println(second);

    }
}
