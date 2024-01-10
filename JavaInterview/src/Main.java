import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String test = "5test1 is1 2a This ";
        HashMap<Integer, String> record = new HashMap<>();
        var result = test.split(" ");
        for (var i =0; i < result.length; i++)
        {
            var word = result[i];
            int sum = 0;
            String ch = "";
            for (var j = 0; j < word.length(); j++)
            {
                var string = word.charAt(j);

                Boolean isNumeric = true;
                try {
                    Integer num = Integer.parseInt(String.valueOf(string));
                    sum += num;
                } catch (NumberFormatException e) {
                    isNumeric = false;
                }
                if(!isNumeric)
                {
                    ch += string;
                }

            }
            record.put(sum, ch);
        }
    }
}