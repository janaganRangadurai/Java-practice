/*
 * In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
 */
package src;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpPattern {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        
        while(n-->0){
            String p = sc.nextLine();
            try{
                Pattern.compile(p);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }


}
