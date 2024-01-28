package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerofHanoi(3, 'A', 'B', 'C');
    }
    public static void towerofHanoi(int n, char  a, char  b, char  c)
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+ a +" to " + c);
            return;
        }
        towerofHanoi(n-1, a,c,b);
        System.out.println(n + " From " +a + " to" + c);
        towerofHanoi(n-1, b,a,c);
    }
}
