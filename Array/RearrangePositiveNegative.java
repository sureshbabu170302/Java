import java.util.*;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
       int [] arr = {3, 1, -2, -5, 2, -4};
       rearrangePositiveNegative(arr);
    }

    public static void rearrangePositiveNegative(int [] arr)
    {
        int [] positive = new int[arr.length/2];
        int [] negative = new int[arr.length/2];
        int positiveIndex = 0;
        int negativeIndex = 0;

        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]>0) {
                positive[positiveIndex++] = arr[i];
            }
            else{
                negative[negativeIndex++] = arr[i];
            }
        }
        for(int i=0; i<arr.length/2; i+=1) {
            arr[2*i]=positive[i];
            arr[2*i+1]=negative[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
