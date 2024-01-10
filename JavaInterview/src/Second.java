import java.util.Arrays;
import java.util.HashMap;

public class Second {
    public static void main(String[] args) {
        String test = "a";
        String pattern = "aa";

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (int i =0 ; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            var count = characterCounts.get(ch);
            characterCounts.put(ch,  count == null ? 1  : count + 1);
        }
        int required = pattern.length();
        int max_length = Integer.MAX_VALUE;
        int start = 0;
        int i = 0;
        int j = 0;

        while (j <  test.length())
        {
            char ch = test.charAt(j);
            if(characterCounts.containsKey(ch) && characterCounts.get(ch) > 0 )
            {
                System.out.println("Here "+ ch);
                characterCounts.put(ch, characterCounts.get(ch) - 1);
                required--;
            }
            else if(characterCounts.containsKey(ch)){
                var count = characterCounts.get(ch) == null ? -1 : characterCounts.get(ch) -1;
                characterCounts.put(ch, count);
            }
            while (required == 0)
            {

                System.out.println("required 0 " + i);
                int len =  j-i+1;

                if(max_length  > len)
                {
                    max_length = len;
                    start = i;
                }

                if(characterCounts.containsKey(test.charAt(i)))
                {
                    characterCounts.put(test.charAt(i), characterCounts.get(test.charAt(i)) + 1);


                }
                if( characterCounts.containsKey(test.charAt(i)) &&  characterCounts.get(test.charAt(i)) > 0)
                {
                    System.out.println(test.charAt(i));
                    required++;
                }
                i =  i+1;

            }

            j++;
        }
        System.out.println(start+ "ss" + ( start+max_length) );
        System.out.println(test.substring(start, start+max_length));

    }
    }
