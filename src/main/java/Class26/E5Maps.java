package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5Maps {
        public static void main(String[] args) {

            //Maps are collection of Entries
            //Entries are collection of key value pairs

            TreeMap<String, Double> makeUp = new TreeMap<>();
            makeUp.put("Lipsticks", 22.0);
            makeUp.put("BlushOn", 40.0);
            makeUp.put("Base", 50.0);
            makeUp.put("Foundation", 90.0);
            makeUp.put("EyeLiner", 25.5);
            makeUp.put("EyeLiner", 30.5);
            makeUp.put("Concealer", 35.5);

            Set<Map.Entry<String, Double>> entries = makeUp.entrySet();
            for (Map.Entry<String, Double> e : entries) {
                System.out.println(e.getKey() + " " + e.getValue());


            }
        }
    }

