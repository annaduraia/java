import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberAccerence {

	public static void main(String[] args) {
		findNumbers("three two one ");
		findNumbers("one two three test");
		findNumbers("one five five three two two");
	}

	private static void findNumbers(String string) {
		if (string == null || string.isEmpty()) {
			System.out.println("INVALID");
			return;
		}
		String[] stringarray = { "zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine" };
		List<String> list = Arrays.asList(stringarray);
		String[] strings = string.split(" ");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (String str : strings) {
			if (list.indexOf(str) != -1) {
				int position = list.indexOf(str);
				if (map.get(position) == null)
					map.put(position, 1);
				else {
					Integer inte = map.get(position);
					map.put(position, ++inte);
				}
			} else {
				System.out.println("INVALID");
				return;
			}
		}
		String output = "";
		for (int i = 0; i <= 9; i++) {
			if (map.get(i) != null) {
				output += i + "-" + map.get(i) + ",";
			}
		}
		System.out.println(output.substring(0, output.length() - 1));
	}
}
