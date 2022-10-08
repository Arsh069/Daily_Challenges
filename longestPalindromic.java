/* 
Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.
 */

class Solution {
    public String longestPalindrome(String s) {
       String k = "";
        if(s.length() == 1)
            return s;
       for(int i=0;i<s.length();i++){
           for(int j=s.length()-1;j>=i;j--){
               if(check(s,i,j)){
                   if(k.length() < s.substring(i,j+1).length())
                       k = s.substring(i,j+1);
                   break;
               }
               else if(k.length() > j-i)
                   break;
           }
           
       }
        return k;
    }
    public boolean check(String s , int i, int j){
        String p = s.substring(i,j+1);
       
            
        int h = 0;
        int f = p.length()-1;
        while(h<=f){
            if(p.charAt(h)!=p.charAt(f))
                return false;
            h++;
            f--;
        }
     
        return true; 
      
        
        
    }
}