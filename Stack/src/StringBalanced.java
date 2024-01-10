import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class StringBalanced {
    public static void main(String[] args) {
        var strPar  = "(([[]]))";
        System.out.println(isProper(strPar));
    }

    public static  boolean matching(char a, char b)
    {
        return  ((a== '(' && b ==')') || (a =='[' && b ==']') || (a == '{' && b =='}'));
    }

    public  static  boolean isProper(String  strPar)
    {
        Deque<Character> data = new ArrayDeque<>();

        for (int i = 0; i < strPar.length() ; i++) {
            var str = strPar.charAt(i);
            if (str == '(' || str == '[' || str == '{') {
                data.push(str);
            } else {
                if (data.isEmpty()) return false;
                else if (!matching(data.peek(), str)) {
                    return false;
                } else {
                    data.pop();
                }
            }
        }
        if(data.isEmpty()) return  true;
        return  false;
    }
}
