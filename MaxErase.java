import java.util.*;

public class MaxErase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int m = sc.nextInt();
        System.out.print(slidingWindowsolve(arr));

    }

    public static int slidingWindowsolve(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        int ans = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (hs.contains(nums[i])) {
                while (hs.contains(nums[i])) {
                    sum -= nums[j];
                    hs.remove(nums[j]);
                    j++;

                }
              
            }
               sum+=nums[i];
                hs.add(nums[i]);
            ans = Math.max(ans,sum);

        }
        return ans;

    }

    /*
     * this is brute force approach
     * public static int slidingWindowsolve(int[] nums) {
     * int n = nums.length;
     * // ArrayList<Integer> al = new ArrayList<>();
     * HashSet<Integer> hs = new HashSet<>();
     * int sum = 0;
     * for (int arr : nums) {
     * hs.add(arr);
     * }
     * for( int kk : hs ) {
     * sum+=kk ;
     * }
     * 
     * System.out.print(hs);
     * // 4,2,4,5,6
     * return sum;
     * 
     * }
     * 
     */

    public static boolean isDuplicate(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(i)) {
                return true;
            }
            hs.add(i);
        }
        return false;
    }
}