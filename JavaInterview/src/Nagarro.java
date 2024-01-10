import java.util.Arrays;

public class Nagarro {
    public static void main(String[] args) {
        int arr [][] = {{75, 76, 65, 87, 87}, {
            78, 76, 68, 56, 89
        }, {
            67, 87, 78, 77, 65
        }};
        int result [] = new int[arr.length];
        int index = 0;

        double minavg = Double.MAX_VALUE;
        for(int i = 0; i < arr[0].length; i++)
        {   double sum = 0;
            for (int j = 0; j < arr.length;  j++)
            {

                sum +=arr[j][i];
            }
            double avg = sum/ arr.length;
            if(avg < minavg)
            {
                minavg = avg;
                index = i;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(j == index)
                {
                    continue;
                }
                result[i] += arr[i][j];
            }
        }


        System.out.println(Arrays.toString(result));


    }
}
