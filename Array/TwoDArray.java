import java.util.*;

public class TwoDArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int [][] arr = new int [row][col];
        System.out.println();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print("Enter values of index " + "(" + i + "," + j + ") :" );
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
