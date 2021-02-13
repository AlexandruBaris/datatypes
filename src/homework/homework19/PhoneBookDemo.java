package homework.homework19;

import java.util.ArrayList;


public class PhoneBookDemo {
    public static void main(String... args) {
        ArrayList<PhoneBook> book = new ArrayList<>();

        PhoneBook user = new PhoneBook("AL", "12345");
        PhoneBook user1 = new PhoneBook("AD", "456879");
        PhoneBook user2 = new PhoneBook("As", "754123");

        book.add(user);
        book.add(user1);
        book.add(user2);

        for (PhoneBook phoneBook : book) {
            System.out.println(phoneBook);
        }
    }
}
