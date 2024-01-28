package Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("isPalindrome "+isPalindrome("abbcbba"));
        System.out.println("isPalindrome "+isPalindrome("abas"));
        String str = "ababa";
        System.out.println("Recursive call " + isPalindromeRecursion(str, 0, str.length() -1));
    }
    public static boolean isPalindrome(String str)
    {
        int i =  0;
        int j = str.length() -1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return  true;
    }
    public static boolean isPalindromeRecursion(String str, int i, int j)
    {
        if(i >=j)
        {
            return  true;
        }
       else if(str.charAt(i) == str.charAt(j)){
            return isPalindromeRecursion(str, i+1, j-1);
        }
      return  false;
    }
}
