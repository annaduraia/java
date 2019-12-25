package serialization;

import java.io.Serializable;

public class Son extends Father implements Serializable  
{
	int child = 4;

	public Son() {
		System.out.println("Son Constructor...");
		child = 5;
	}

	{
		child = 6;
	}
	public void getinfo(){
		System.out.println("Son test");
	}
}
