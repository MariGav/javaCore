import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, String> phoneToName;

    public PhoneBook() {
        phoneToName = new HashMap<>();
    }

    public void add(String phone, String name) {
        phoneToName.put(phone, name);
    }

    public ArrayList<String> get(String name) {
        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, String> phoneEntry : phoneToName.entrySet()) {
            if (phoneEntry.getValue().equals(name)) {
                result.add(phoneEntry.getKey());
            }
        }

        return result;
    }

    public void delete(String phone) {
       phoneToName.remove(phone);
    }
}
