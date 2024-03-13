public class MaximumSubarraySum {
    public static void main(String[] args) {
        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArraySum(array);
    }

    public static void maxSubArraySum(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++)
        {
            int sum=0;
            for(int j=i; j<arr.length ; j++)
            {
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println("The sum of maximum subarray is :"+ max);
    }
}
