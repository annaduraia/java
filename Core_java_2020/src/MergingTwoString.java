public class MergingTwoString {

	public static void main(String[] args) {
		System.out.println(mergeTwoString("sakthi", "vel"));

	}

	private static String mergeTwoString(String string1, String string2) {

		char[] char1 = string1.toCharArray();
		char[] char2 = string2.toCharArray();
		int length = char1.length + char2.length;
		char[] resultChar = new char[length];
		int j = 0;
		int i = 0;
		while (true) {
			if (char1.length > i)
				resultChar[j++] = char1[i];
			else
				i++;
			if (char2.length > i)
				resultChar[j++] = char2[i++];
			else
				i++;
			if (j == length)
				break;
		}
		return new String(resultChar);
	}

}
