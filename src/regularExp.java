/*
 * Given a string,s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Input Format

A single string,s .

Constraints

s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
 */
package src;

import java.util.Scanner;

public class regularExp {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        String[] tokens = input.trim().split("[^A-Za-z]+");
        
        if(input.trim().isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(tokens.length);
            for (String string : tokens) {
                System.out.println(string);
            }
        }
    }
}

