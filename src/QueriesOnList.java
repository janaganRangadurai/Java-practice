/*
 * Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
 */
package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueriesOnList {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        
        int que = sc.nextInt();
        for (int i = 0; i < que; i++) {
        	String query = sc.next();
        	if (query.equals("Insert")) {
        		int p = sc.nextInt();
        		int r = sc.nextInt();
        		list.add(p, r);
				
			}else {
				list.remove(sc.nextInt());
			}
			
		}
        sc.close();
        
        for (Integer integer : list) {
			System.out.print(integer + " ");
		}
        
            
        }

}
