/*package jsons;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArrayObject
{
    public static void main(String[] args) {
        
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(100));
        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");
        obj.put("messages", list);
        String name = (String) obj.get("name");
        System.out.println("name :"+name);
        long age = (Integer) obj.get("age");
        System.out.println("age :"+age);
        // loop array
        JSONArray msg = (JSONArray) obj.get("messages");
        Iterator<String> iterator = msg.iterator();
        while (iterator.hasNext()) {
            System.out.println("Itr :"+iterator.next());
        }
        System.out.print(obj);
    }
   try {
     
            FileWriter file = new FileWriter("D:\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
     
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        Object obj = parser.parse(new FileReader("c:\\test.json"));
        
        JSONObject jsonObject = (JSONObject) obj;
}
*/