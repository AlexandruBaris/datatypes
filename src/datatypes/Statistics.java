package datatypes;

public class Statistics {

    private final double grRate = 1.05;
    private final String sourceoff = "Source for the world population counter:";
    private final String revision = "* World population prospect the 2019 revision - United Nations, Department of Economic and Social Affairs";
    private long wrldppl = 7831439009L;
    private String internat = "* International Programs Center at the U.S Census Bureau, Population Division";


    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        System.out.println(statistics.wrldppl + " Current World Population");
        System.out.println("* is curently(2020) growing at a rate of around " + statistics.grRate + "% per year,\n" +
                "adding 81 million people per year to the total");
        System.out.println(statistics.sourceoff + "\n" +
                statistics.revision + "\n" +
                statistics.internat);


    }

    public void refresh() {
        //connect to internet
        wrldppl = 78546154321L;
    }
}