package jdk18;

@FunctionalInterface
interface FI
{
	public int add(int a, int b);
	//public int add(int a, int b, int c);

}





public class LambdaEpression {

	public static void main(String[] args) {
		FI fi = (a,b)->a+b;
		
		
		System.out.println(fi.add(2, 4));

	}

}
