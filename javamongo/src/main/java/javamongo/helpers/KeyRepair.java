package javamongo.helpers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

public class KeyRepair {

    public static <T> T fixJsonKey(T json) {

        if (json instanceof JSONObject) {
            JSONObject jsonObject = (JSONObject) json;
            List<String> keyList = new LinkedList<String>(jsonObject.keySet());
            for (String key : keyList) {
                if (!key.matches(".*[\\s\t\n]+.*")) {
                    Object value = jsonObject.get(key);
                    fixJsonKey(value);
                    continue;
                }

                Object value = jsonObject.remove(key);
                String newKey = key.replaceAll("[\\s\t\n]", "");

                fixJsonKey(value);

                jsonObject.accumulate(newKey, value);
                return (T) jsonObject;
            }
        } else if (json instanceof JSONArray) {
            for (Object aJsonArray : (JSONArray) json) {
                fixJsonKey(aJsonArray);
            }
        }
        return null;
    }
}
