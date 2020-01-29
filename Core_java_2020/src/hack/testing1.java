package hack;

/**
 * 
 * You are given two passages of text that have been scanned and passed through
 * OCR software. (OCR stands for Optical Character Recognition, which is the
 * conversion of printed text into machine-readable strings.) Unfortunately, the
 * scans were of poor quality and some letters were not recognized by the OCR
 * software. Write a program to check (based on the output from the OCR
 * software) whether the two text sources might in fact be the same.
 * 
 * 
 * You are given two strings S and T consisting of N and M characters,
 * respectively, and you would like to check whether they might have been
 * obtained as OCR scans of the same text. For example, both strings "
 * 
 * @author 
 *
 */
public class testing1 {
	public static void main(String[] args) {

		 System.out.println(new testing1().Solution("A2Le", "2pL1"));
		 System.out.println(new testing1().Solution("a10", "10a"));
		System.out.println(new testing1().Solution("ba1", "1Ad"));

	}

	public boolean Solution(String S, String T) {
		String s = S;
		StringBuilder expanded = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				expanded.append(s.charAt(i));
			} else {
				for (int j = 0; j < Character.getNumericValue(s.charAt(i)); j++) {
					expanded.append('?');
				}
			}
		}

		final String tempS = expanded.toString();

		s = T;
		expanded = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				expanded.append(s.charAt(i));
			} else {
				for (int j = 0; j < Character.getNumericValue(s.charAt(i)); j++) {
					expanded.append('?');
				}
			}
		}

		final String tempT = expanded.toString();

		if (tempS.length() != tempT.length()) {
			return false;
		}

		for (int i = 0; i < tempS.length(); i++) {
			if (tempS.charAt(i) != '?' && tempT.charAt(i) != '?' && tempS.charAt(i) != tempT.charAt(i)) {
				return false;
			}
		}

		return true;
	}

}
