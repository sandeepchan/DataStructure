package Recursion;

import java.util.HashSet;

public class SubsetString {
    public static void main(String[] args) {
        subset("abc", "", 0);
    }
    public static  void subset(String str, String tmp, int i)
    {
        if(i == str.length())
        {
            System.out.println(tmp);
            return;
        }
        subset(str, tmp, i+1);
        subset(str, tmp+str.charAt(i), i+1);

    }


}
