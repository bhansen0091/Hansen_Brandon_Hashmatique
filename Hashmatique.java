import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public HashMap makeHM() {
        HashMap<String, String> newHM = new HashMap<String, String>();
        newHM.put("Song 1", "Lyrics 1");
        newHM.put("Song 2", "Lyrics 2");
        newHM.put("Song 3", "Lyrics 3");
        newHM.put("Song 4", "Lyrics 4");

        return newHM;
    }
    
    public String getByTitle(HashMap hm, String searchKey) {
        return hm.get(searchKey).toString();
    }

    public void printAll(HashMap hm) {
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.printf("\nKey: %s | Value: %s", key, hm.get(key));
        }
    }
    
}