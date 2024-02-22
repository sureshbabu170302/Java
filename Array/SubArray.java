import java.util.Scanner;

public class SubArray 
{
    public static void main(String[] args) 
    {
        int [] arr = new int[5];    
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter elements of array:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print( "Enter elements of index "+(i)+" : ");
            arr[i] = sc.nextInt();
        }

        displayArray(arr);
        reverseArray(arr);
        System.out.println();
        maxArray(arr);
        minArray(arr);
        maxSubArray(arr);
    }   

    public static  void displayArray(int[] arr)
    {
        System.out.print("\n Elements in the array are: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" " );
        }
    }

    public static void reverseArray(int[]arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("\n Elements in the reversed array are: ");
        for(int k=0 ; k<arr.length ; k++)
        {
            System.out.print(arr[k]+" " );
        }
    }
    public static void  maxArray(int []arr)
    {
        int max =  arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(" Biggest element in Array is: " + max);
    }

    public static void  minArray(int []arr)
    {
        int min =  arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(" Smallest element in Array is: " + min);
    }

    public static void maxSubArray(int[] arr) 
    {
        for (int si = 0; si < arr.length; si++) 
        {
            for (int ei = si; ei < arr.length; ei++) 
            {
                int max = arr[si]; 
                for (int i = si; i <= ei; i++) 
                {
                    if (max < arr[i]) 
                    {
                        max = arr[i];
                    }
                    System.out.print(arr[i] + " ");
                }
                System.out.println("Maximum in subarray: " + max);
            }
        }
    }
    
}
