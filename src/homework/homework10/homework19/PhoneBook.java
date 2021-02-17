package homework.homework10.homework19;

public class PhoneBook {
    private String name;
    private String number;


    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setNumber() {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone Book |> Name: " + name + "\t|> Phone number: " + number;
    }
}
