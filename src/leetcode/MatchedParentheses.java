package leetcode;

/**
 * A string s of parentheses (“(” and “)”) and brackets (“[” and “]”) is matched
 * if it is of one of the following forms: 2 • the empty string • (x), where x
 * is matched • [x], where x is matched • xy where x and y are both matched.
 * 
 * Describe a dynamic program to determine whether a string s is matched
 * 
 * @author sahiljain
 *
 */
public class MatchedParentheses {

	public static void main(String[] args) {
		String s = "(())";
		System.out.println(isMatched(s));
	}

	private static boolean isMatched(String s) {
		if (s.length() == 0)
			return true;
		else if (s.length() % 2 == 1)
			return false;
		else if (s.equals("[]") || s.equals("()")) {
			return true;
		}

		else if (s.charAt(0) == ']' || s.charAt(0) == ')') {
			return false;
		} else {

			int j = s.length() - 1;
			char first = s.charAt(0);

			// in true case either the string has nested structure or
			// multiple concatenations of parenthesis
			while (j > 0) {
				if ((first == '(' && s.charAt(j) == ')') || (first == '[' && s.charAt(j) == ']')) {
					if (j < s.length()) {
						if (isMatched(s.substring(0, j + 1)) && isMatched(s.substring(j + 1, s.length())))
							return true;
					} else {
						// nested case
						if (isMatched(s.substring(1, j)))
							return true;

					}

				}
				j--;
			}

		}
		return false;
	}
}
