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
