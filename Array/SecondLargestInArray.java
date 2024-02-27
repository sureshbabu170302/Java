import java.util.Scanner;

public class SecondLargestInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array: ");
        int n = sc.nextInt();
        int [] arr =  new int[n];
        
        for (int i=0 ; i <  n ; i++ )  
        {
            System.out.print( "Enter numbers for "+i+ " index: " );
            arr[i] = sc.nextInt() ;
        }
        secondLargest(arr);
    }
    
    public static void secondLargest(int[]arr)
    {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length ; i++) 
        {
            if (arr[i]>firstLargest) 
            {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nThe second largest element is : "+secondLargest);
    }
}
