public class minimumsum1ton {

    public static void main(String[] args) {
        int range = 16;
        int i =0;
        while (1 != 0)
        {
            int sum = sumofdigit(i);
            if(sum == range)
            {
                System.out.println("smallest sum is " + i);
                break;
            }
            i++;

        }





    }
    public  static int sumofdigit(int n)
    {
        int sum = 0;
        while (n !=0)
        {
            sum = sum + n%10;
            n = n/10;
        }
        return  sum;
    }
}


