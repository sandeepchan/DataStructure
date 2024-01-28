package Recursion;

public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(ropeCutting(23,12,9,11));
    }
    public static  int ropeCutting(int n, int a, int b, int c)
    {
        if(n ==0)
        {
            return 0;
        }
        if(n < 0)
        {
            return -1;
        }
        int max =   Math.max(Math.max(ropeCutting(n-a, a,b,c), ropeCutting(n-b,a,b,c)), ropeCutting(n-c, a,b,c)) ;
        if(max == -1)
        {
            return  -1;
        }
        return max + 1;
    }
}
