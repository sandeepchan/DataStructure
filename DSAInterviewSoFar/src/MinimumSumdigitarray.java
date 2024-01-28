import java.util.Arrays;

public class MinimumSumdigitarray {

    /*
    * Given an array
    *   [6, 8, 4, 5, 2, 3]
    *    [2,3,4,5,6,8]
     * */
    public static void main(String[] args) {
        int [] digit = {6,8,4,5,2,3};
        Arrays.sort(digit);
        int a = 0;
        int b = 0;
        for(int i =0 ; i < digit.length; i++)
        {
            if(i % 2 ==0)
            {
                a = a * 10 + digit[i];
            }
            else{
                b = b * 10 + digit[i];
            }
        }
        System.out.println(a + b);
    }
}
