/*
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
 */
package src;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	static boolean isAnagram(String a, String b){
        a= a.toLowerCase();
        b= b.toLowerCase();
        
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        
        Arrays.sort(charA);
        Arrays.sort(charB);
        
        if(a.length() != b.length()){
            return false;
        }
        
        return Arrays.equals(charA, charB);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
    }
}

