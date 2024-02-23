import java.util.*;

public class MaxArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in your array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int max = arr[0];

        for(int i=0 ; i < arr.length ; i++)
        {
            System.out.print("\nEnter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("\nThe largest element is " + max);
    }
}