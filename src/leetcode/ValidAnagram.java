package leetcode;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * @author sahiljain
 *
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int len1 = s.length();
		int len2 = t.length();

		if (len1 != len2) {
			return false;
		}

		int[] array = new int[26];

		for (int i = 0; i < len1; i++) {
			array[(int) (s.charAt(i) - 'a')]++;
			array[(int) (t.charAt(i) - 'a')]--;
		}

		for (int i = 0; i < 26; i++) {
			if (array[i] != 0) {
				return false;
			}
		}
		return true;
	}
}