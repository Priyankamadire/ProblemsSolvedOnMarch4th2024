
/*
Code
Testcase
Test Result
Test Result
1248. Count Number of Nice Subarrays
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There is no odd numbers in the array.
Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 

Constraints:

1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length */
import java.util.*;

public class NiceSubArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.print(numberOfSubarrays(arr, m));

    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int cnt = 0;
        int odd = 0;
        while (j < n) {
            if (nums[j] % 2 == 1) {
                odd++;
            }
            while (odd > k) {
                if (nums[i] % 2 == 1) {
                    odd--;
                }
                i++;

            }
            cnt += j - i + 1;
            j++;

        }
        return cnt;
    }
}