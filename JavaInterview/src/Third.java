import java.util.Arrays;
import java.util.HashMap;

public class Third {

    public static void main(String[] args) {
        String test = "thisIsJavaT";

        HashMap<Integer, Character> tmp = new HashMap<>();
        int i = 0;
        boolean islang = false;
        boolean isJava = false;
        while (i < test.length())
        {
            Character ch = test.charAt(i);
            if(ch == '_')
            {
                islang = true;
                i++;
                continue;
            }
            else  if( Character.isUpperCase(ch))
            {
                isJava = true;
                i++;
                continue;
            }
            else{
                if(islang == true)
                {
                    tmp.put(i, Character.toUpperCase(ch));
                    islang  = false;
                }
                else if(isJava == true)
                {
                    System.out.println(i);
                    tmp.put(i-1, '_');
                    tmp.put(i, Character.toLowerCase(ch));
                    isJava = false;
                }
                else{
                    tmp.put(i, ch);
                }
            }
            i++;
        }

        tmp.forEach((k,v)->{
            System.out.println(v);
        });
    }
}
