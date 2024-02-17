import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int [] data = {10,2,3,1,8,12};
        sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println(binarySearch(data, 8, 0, data.length-1));;
    }
    public static int[] sort(int data[])
    {
        for(int i =0; i < data.length; i++)
        {
            for(int j = i+1; j < data.length; j++)
            {
                if(data[i]> data[j])
                {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return  data;
    }
    public static  int binarySearch(int [] arr, int n, int l, int k)
    {
        if (k >= l)
        {
            int mid = l + (k-l) /2;
            if(arr[mid] == n)
            {
                return  mid;
            }
            else if(arr[mid] < n)
            {
                return  binarySearch(arr, n, mid+1, k);
            }
            else {
                return binarySearch(arr, n, l, mid-1);
            }
        }
        return  -1;
    }
}
