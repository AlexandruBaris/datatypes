package homework.homework20;

import java.util.HashMap;

public class Month {
    private int monthNumber;

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int number) {
        if (number < 1 || number > 12) new Month();
        else this.monthNumber = number;
    }

    public Month(String monthName) {
        HashMap<String, Integer> month = new HashMap<>();
        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);
        if (month.containsKey(monthName)) this.monthNumber = month.get(monthName);
        else new Month();
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) new Month();
        else this.monthNumber = monthNumber;
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthNumber=" + monthNumber +
                '}';
    }

    public String getMonthName() {
        HashMap<Integer, String> name = new HashMap<>();
        name.put(1, "January");
        name.put(2, "February");
        name.put(3, "March");
        name.put(4, "April");
        name.put(5, "May");
        name.put(6, "June");
        name.put(7, "July");
        name.put(8, "August");
        name.put(9, "September");
        name.put(10, "October");
        name.put(11, "November");
        name.put(12, "December");

        return name.get(getMonthNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return monthNumber == month.monthNumber;
    }

}
