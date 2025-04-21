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
