import java.util.Scanner;

public class RotateClockwiseTwoDArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns for the array: ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                System.out.print("Enter values for index (" + i +  "," + j + ") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        displayArray(arr);
        System.out.println( "Array after transpose: " );
        transposeArray(arr);
        displayArray(arr);
        System.out.println( "Array after rotating 90 degree : " );
        reverseTransposeArray(arr);
        displayArray(arr);
    }

    public static void transposeArray(int[][]arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr[0].length; j++) 
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void displayArray(int[][]arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseTransposeArray(int[][]arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            int start = 0;
            int end = arr[0].length - 1;
    
            while (start < end) 
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
    
                start++;
                end--;
            }
        }
    }
}
