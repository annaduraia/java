package serialization;

import java.io.Serializable;

public class Father {

	int parent = 1;

	public Father() {
		System.out.println("Father <span id= class Constructor span...");
		//parent = 3;
	}

	{
	//	parent = 2;
		System.out.println("Instance Block....");
	}

	public void getinfo(){
		System.out.println("Father test");
	}
}