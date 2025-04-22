/*
 * You are given n pairs of strings. Two pairs (a,b)  and (c,d) are identical if a=d and c=d. That also implies (a,b0 is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.
 */
package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		Set<String> pair = new HashSet<>();
		for (int i = 0; i < t; i++) {
			String key = sc.next();
			String value = sc.next();

			String setPair = key + " " + value;
			pair.add(setPair);
			System.out.println(pair.size());
		}
		sc.close();
	}
}
