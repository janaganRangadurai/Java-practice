/*
 * The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of A and B.
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
 */

package src;

public class StringFormat {

	public static void main(String[] args) {

		String A = "hello";
		String B = "world";
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		String capA = A.substring(0, 1).toUpperCase().concat(A.substring(1));
		String capB = B.substring(0, 1).toUpperCase().concat(B.substring(1));
		System.out.println(capA + " " + capB);

	}

}
