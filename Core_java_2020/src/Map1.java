import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("PostgreSQL", "Free Open Source Enterprise Database");
		map.put("DB2", "Enterprise Database , It's expensive");
		map.put("Oracle", "Enterprise Database , It's expensive");
		map.put("MySQL", "Free Open SourceDatabase (no more, try MariaDB)");

		System.out.println(map.get("PostgreSQL")); // Free Open Source
													// Enterprise Database
		for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }
	}

}
