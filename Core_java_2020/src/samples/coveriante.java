package samples;

public class coveriante {
	public enum abc {Anna, durai}
	
	public Object my() {
		System.out.println("First: my()");
		return null;
	}

	public static void main(String[] args) {
		coveriante o = new Second();
		o.my(); // which my() is called?
		System.out.println(abc.Anna);
	}
}

class Second extends coveriante {
	public String my() {
		System.out.println("Second: my()");
		return null;
	}
}
