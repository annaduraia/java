package pgm;

public class ReverseInt1 {
	public static void main(String[] args) {
		int a = reverse(1234);
		System.out.println(a);
	}
	public static int reverse(int n) {
		String inputString = String.valueOf(n);
		StringBuffer stringBuffer = new StringBuffer(inputString);
		stringBuffer.reverse();
		String reversedString = stringBuffer.toString();
		int reversedInt = Integer.parseInt(reversedString);		
		return reversedInt;
	}
}
