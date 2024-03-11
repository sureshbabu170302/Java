public class MajorityElementArray {
    public static void main(String[] args) {
        int [] arr = {2, 2, 1, 3, 3, 2, 2};
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        MajorityElement(arr);
    }   
    public static void MajorityElement(int [] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int count = 0;
            for(int j=i ; j<arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count > arr.length/2)
            {
                System.out.println("Majority Element of the array is : " + arr[i]);
            }
        }
    } 
}
