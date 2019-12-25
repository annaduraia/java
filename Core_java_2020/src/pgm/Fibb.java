package pgm;

public class Fibb {

	public static void main(String[] args) {
		fib(5);

	}
	
	public static void fib(int n){
		int csv=0;
		int cpv=1;
		System.out.println("Postion value  "+cpv+"  Series value "+csv);
		System.out.println();
		if(cpv==n){
			System.out.println("the series value in "+n +"th position is "+ csv);
		}else if(cpv!=n){
			cpv++;
			csv=csv+cpv;
			fib(n);
		}
		
	}

}
