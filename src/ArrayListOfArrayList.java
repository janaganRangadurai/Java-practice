/*
 * You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in y-th position of x-th line.

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			ArrayList<Integer> integersList = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				integersList.add(sc.nextInt());
			}
			arrayLists.add(integersList);
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			x--;
			y--;

			if (x >= 0 && x < arrayLists.size()) {
				ArrayList<Integer> outList = arrayLists.get(x);
				if (y >= 0 && y < outList.size()) {
					System.out.println(outList.get(y));
				} else {
					System.out.println("ERROR!");
				}
			} else {
				System.out.println("ERROR!");
			}
		}

		sc.close();

	}

}
