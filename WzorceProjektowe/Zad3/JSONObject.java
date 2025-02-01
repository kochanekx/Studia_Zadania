package Studia.WzorceProjektowe.Zad3;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {
    private final Map<String, Object> map;

    public JSONObject(String json) {
        this.map = parseJson(json);
    }

    private Map<String, Object> parseJson(String json) {
        Map<String, Object> result = new HashMap<>();

        json = json.trim().replaceAll("[{}]", "");
        String[] pairs = json.split(",");

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().replaceAll("\"", "");
                String value = keyValue[1].trim().replaceAll("\"", "");
                result.put(key, value);
            }
        }
        return result;
    }

    public Map<String, Object> toMap() {
        return this.map;
    }
}
