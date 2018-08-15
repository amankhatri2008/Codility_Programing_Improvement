package practice;

public class ToLowerCaseToUppercase {

	public String toLowerCase(String toLowerCharString) {
		char[] charArray = toLowerCharString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] = (char) (charArray[i] + 32);
				
			}

		}

		return new String(charArray);
	}
	public String toUpperCase(String toUpperCharString) {
		char[] charArray = toUpperCharString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i] - 32);
				
			}

		}

		return new String(charArray);
	}

	public static void main(String[] argr) {

		ToLowerCaseToUppercase toLowerCase = new ToLowerCaseToUppercase();

		System.out.println(toLowerCase.toLowerCase("TOLOWER"));
		System.out.println(toLowerCase.toUpperCase("toupper"));
	}

}
