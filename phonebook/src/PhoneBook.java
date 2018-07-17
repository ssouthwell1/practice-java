import java.util.HashMap;
import java.util.Map;

public class PhoneBook {


    Map<Integer, String> phoneBook = new HashMap<>();
    Integer phoneNumber;
    String name;
    static Integer phoneBook_ID = 0;

    public PhoneBook() {
       phoneBook_ID++;
    }


    public boolean addContact(Integer phoneNumber, String name) {
        if (!phoneBook.containsKey(phoneNumber)) {
            phoneBook.put(phoneNumber, name);
            return true;
        }
        return false;

    }

    public boolean deleteContact(Integer phoneNumber) {
        if (phoneBook.containsKey(phoneNumber)) {
            phoneBook.remove(phoneNumber);
            return true;
        }
        return false;
    }

    public Map lookupPhoneNumberByName(String name) {
        phoneBook.containsValue(name)

    }

    public Integer lookupNameByPhoneNumber(Integer phoneNumber) {


    }

    public String findCaller(Integer phoneNumber) {
        return phoneBook.get(phoneNumber);

    }

    public Integer formatPhoneNumber(String phoneNumberString) {

        String digits = phoneNumberString.replaceAll()

    }


}
