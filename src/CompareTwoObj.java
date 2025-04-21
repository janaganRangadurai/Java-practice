package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class CompareTwoObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Player[] players = new Player[n];
		for (int i = 0; i < n; i++) {
			players[i] = new Player(sc.next(), sc.nextInt());
		}
		sc.close();

		Comparator<Player> checker = new Comparator<>() {
			@Override
			public int compare(Player p1, Player p2) {

				if (p1.score == p2.score) {
					return p1.name.compareTo(p2.name);
				} else if (p1.score < p2.score) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Arrays.sort(players, checker);
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].name + " " + players[i].score);
		}
	}
}
