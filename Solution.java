//A small program to find whether or not the String argument are alternating consonant and vowels.

public class Solution {
    public static boolean isAlt(String word) {
          return word.matches("[aeiou]{0,1}([^aeiou][aeiou])*[^aeiou]{0,1}");
    }
    
    public static void main(String[]args){
    
    Solution d= new Solution();
    System.out.println(d.isAlt("rara"));
    System.out.println( d.isAlt("danino"));
    System.out.println( d.isAlt("dsdfsf"));
    
    }
    
}