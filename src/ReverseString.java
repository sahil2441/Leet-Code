

public class ReverseString {

	public static void main(String[] args) {
		String s = "  a ";
		System.out.println(reverseString(s));
	}

	private static String reverseString(String s) {
		String[] parts = s.split("\\s");
		StringBuilder builder = new StringBuilder();
		if (parts.length > 0) {
			builder.append(parts[parts.length - 1]);
			for (int j = parts.length - 2; j >= 0; j--) {
				if (parts[j].equals("")) {
					continue;
				}
				builder.append(" " + parts[j]);
			}
		}

		return builder.toString();

	}

}
