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

