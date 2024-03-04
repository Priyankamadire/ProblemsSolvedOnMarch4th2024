/*
 * 1456. Maximum Number of Vowels in a Substring of Given Length
Solved
Medium
Topics
Companies
Hint
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 
 */
import java.util.*;

public class VowelsSubstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        System.out.print(maxVowels(n,k));
    }
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int cnt=0;
        int ans = Integer.MIN_VALUE;
        int i =0,j=0;
        while(j<n){
            if(isVolwel(s.charAt(j))){
                cnt++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                int p = cnt;
                ans = Math.max(p,ans);
                if(isVolwel(s.charAt(i))){
                    cnt--;
                }
                i++;
                j++;
            }
        }
        return ans;
        
    }
    public static boolean isVolwel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}