/*
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. 
Each phone number has exactly 8 digits without any leading zeros.
 */
package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		Map<String, Integer> contact = new HashMap<>();
		for (int i = 0; i < num; i++) {
			String name = sc.nextLine();
			int number = sc.nextInt();
			sc.nextLine();
			contact.put(name, number);
		}

		while (sc.hasNext()) {
			String req = sc.nextLine();
			if (contact.containsKey(req)) {
				System.out.println(req + "=" + contact.get(req));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();

	}

}
