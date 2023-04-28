import java.util.HashMap;

public class MyHashMap {
    private HashMap<String, String> map;

    public MyHashMap() {
        this.map = new HashMap<String, String>();
    }

    public void add(String key, String value) {
        map.put(key, value);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public String get(String key) {
        return map.get(key);
    }

    public void display() {
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
