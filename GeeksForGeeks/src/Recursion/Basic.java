package Recursion;

public class Basic {

    public static void main(String args [])
    {
        printNumber(10);
        System.out.println("1 to n");
        print1ToN(10);

        System.out.println(factorial(10));

        System.out.println("Fibonacci");

        System.out.println( fibonacci(4));

        System.out.println("Sum of digit  " + sumOfNumber(10));

        System.out.println("sum of digit " + sodigit(2439));

    }

    public static int printNumber(int n)
    {
        if(n==0)
        {
            return 0;

        }
        System.out.println(n);
        return printNumber(n-1);

    }
    public  static  void print1ToN(int n)
    {
        if(n==0)
        {
            return;

        }

        print1ToN(n-1);
        System.out.println(n);

    }

    public  static  int factorial(int n)
    {
        if(n==1) return 1;
        return n* factorial(n-1);
    }

    private  static  int fibonacci(int n)
    {
        if(n ==0) return 0;
        if(n==1) return 1;
        return  fibonacci(n-1) + fibonacci(n-2);
    }

    private static  int sumOfNumber(int n)
    {
        if( n == 1)
        {
            return  1;
        }
        return  n + sumOfNumber(n-1);
    }

    private static int sodigit(int n)
    {
        if (n <= 0)
        {
            return  0;
        }
        return (n % 10) + sodigit(n/10);
    }





}
