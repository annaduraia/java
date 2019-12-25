package StringHandling;

public class StringMain {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(3, "---");
System.out.println(sb);
 
		String Str = "    1$2$3$4$   5$6$7$8$9$1";
		String Str1 = " 1$2$3$4$5$6$7$8$9$1";
		Str = Str.replace('$', ' ');
		System.out.println(Str);

		System.out.println(Str.concat("anna"));
		System.out.println("Trim" + Str.trim());// white space removed,
		System.out.println("value " + String.valueOf(Str));// it showing the
															// value

		char a = Str1.charAt(4);
		System.out.println("char at" + a);
		int res = Str.compareTo(Str1);
		System.out.println(res);
		System.out.println(Str.concat(Str1));// merge with string
		System.out.println(Str.contains(Str1)); // return true or false check
												// both r equal

		for (String retval : Str.split("$")) {
			System.out.println(retval);
		}

		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();
		String s4 = new String("Rakesh");
		String s5 = new String("Rakesh").intern();

		if (s1 == s2) {
			System.out.println("s1 and s2 are same"); // 1.
		}

		if (s1 == s3) {
			System.out.println("s1 and s3 are same"); // 2.
		}

		if (s1 == s4) {
			System.out.println("s1 and s4 are same"); // 3.
		}

		if (s1 == s5) {
			System.out.println("s1 and s5 are same"); // 4.
		}
		// string Reverse
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
		}
		System.out.println(s1.substring(3));
		// String to charactor array
		String password = "password123";
		char[] passwordInCharArray = password.toCharArray();

		for (char temp : passwordInCharArray) {
			System.out.println(temp);
		}

		// String Str = new String("Welcome to Tutorialspoint.com");
		//
		// System.out.print("Return Value :" );
		// System.out.println(s.replaceAll("(.*)Tutorials(.*)",
		// "AMROOD" ));
		// System.out.println(Str);
	}
}
