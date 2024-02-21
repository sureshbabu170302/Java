import java.util.*;

public class PrintSubArray 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int []arr = new  int[n];
        System.out.println();
        // Creating an Array and taking input from user
        for(int i=0;i<n;i++)
        {
            System.out.print( "Element for index["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        for(int si=0 ; si<n ; si++)
        {
            for(int ei = si ; ei<n ; ei++)
            {
                for(int j=si ; j<ei ;j++)
                {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}