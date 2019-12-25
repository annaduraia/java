import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
	static List<String> setStr = new ArrayList();

	public static void main(String[] args) {

		String s = permutation("pp");

		System.out.println(s);
	}

	public static String permutation(String str) {
		String str1 = str;
		str = albhaStr(str);
		permutation("", str);
		if (setStr.size() != 1) {
			int index = setStr.indexOf(str1);
			// System.out.println(setStr);
			++index;
			if (setStr.size() >= index)
				return setStr.get(index);
			else
				return "";
		}
		return "no answer";
	}

	private static String albhaStr(String userInput) {
		char[] charArray = userInput.toCharArray();

		// 4
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (Character.toLowerCase(charArray[j]) < Character
						.toLowerCase(charArray[i])) {
					swapChars(i, j, charArray);
				}
			}
		}

		// 6
		return String.valueOf(charArray);
	}

	// 5

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			if (!setStr.contains(prefix))
				setStr.add(prefix);
		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	private static void swapChars(int i, int j, char[] charArray) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}

}
