
/*1358. Number of Substrings Containing All Three Characters
Solved
Medium
Topics
Companies
Hint
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c character */
import java.util.*;

public class AllThreeCharacters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.print(numberOfSubstrings(n));
    }

    public static int numberOfSubstrings(String s) {
        int temp[] = new int[3]; // abc
        int cnt = 0;
        int j = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            temp[s.charAt(i) - 'a']++;
            while (temp[0] > 0 && temp[1] > 0 && temp[2] > 0) {
                temp[s.charAt(j) - 'a']--;
                j++;
            }
            cnt = cnt + j;
        }
        return cnt;

    }
}