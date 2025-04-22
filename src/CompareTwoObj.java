/*
 * The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.

Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer,n , denoting the number of players.
Each of the n subsequent lines contains a player's name and score, respectively.
 */
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
