
/*1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
Solved
Medium
Topics
Companies
Hint
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 

Constraints:

1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104 */
import java.util.*;

public class SubArrayThreshold {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int t = sc.nextInt();
        System.out.print(slidingWindowsolve(arr, m, t));

    }

    public static int slidingWindowsolve(int[] arr, int k, int threshold) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        int avg = 0;
        int i = 0, j = 0;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                int p = sum;
                if (((double) p / k) >= threshold) {
                    al.add(p);
                }
                sum -= arr[i];
                i++;
                j++;
            }

        }
        return al.size();
    }
}