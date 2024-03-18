import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] array = new int[]{100, 200, 1, 2, 3, 4};
        int n = array.length;
        int ans = findLongestConsecutive(array, n);
        System.out.println("Longest consecutive is: "+ans); 
    }

    public static  int findLongestConsecutive(int[]arr, int n) {
        Arrays.sort(arr);
        //1, 2, 3, 4, 100, 200 
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        
        for(int i = 0; i<n ; i++){
            if(arr[i]-1 == lastSmaller){
                count = count+1;
                lastSmaller = arr[i];
            }
            else if(lastSmaller != arr[i]){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
