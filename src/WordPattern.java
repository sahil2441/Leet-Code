import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WordPattern {

	public static void main(String[] args) {

		String pattern = "a";
		String str = "a";
		Stack stack = new Stack<>();

		System.out.println(isIsomorphic(pattern, str));
	}

	public static boolean wordPattern(String pattern, String str) {

		String[] strings = str.split(" ");
		if (strings.length != pattern.length())
			return false;

		Map map = new HashMap();

		for (Integer i = 0; i < strings.length; i++) {
			if (map.put(strings[i], i) != map.put(pattern.charAt(i), i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isIsomorphic(String s, String t) {
		Map map = new HashMap();

		for (Integer i = 0; i < s.length(); i++) {
		}
		return true;
	}

}
