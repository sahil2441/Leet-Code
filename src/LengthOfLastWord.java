
public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "This is";
		String[] strings = s.split(" ");
		for (int i = 0; i < strings.length; i++) {
			// System.out.println(strings[i]);
		}
		// System.out.println(s.lastIndexOf(" "));
		System.out.println(s.trim().length() - s.trim().lastIndexOf(" ") - 1);

	}

}
