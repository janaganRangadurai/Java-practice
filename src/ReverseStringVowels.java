//Reversing only Vowels :
//input : IceCrEaM
//output : acECreIM

package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringVowels {

	public static void main(String[] args) {
		String original = "IceCrEaM";
		String out = reverseVowels(original);
		System.out.println(out);
	}

	public static String reverseVowels(String string) {

		char[] ch = string.toCharArray();

		List<Integer> vowelsIdxs = new ArrayList<>();
		List<Character> vowelChars = new ArrayList<>();

		for (int i = 0; i < ch.length; i++) {
			String vowel = "AEIOUaeiou";
			if (vowel.indexOf(ch[i]) != -1) {
				vowelsIdxs.add(i);
				vowelChars.add(ch[i]);
			}
		}

		Collections.reverse(vowelChars);

		for (int i = 0; i < vowelsIdxs.size(); i++) {
			ch[vowelsIdxs.get(i)] = vowelChars.get(i);
		}
		return new String(ch);
	}
}
