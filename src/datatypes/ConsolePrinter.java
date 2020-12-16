package datatypes;

public class ConsolePrinter {
    public static void main(String[] args) {
        String line = "----------------------------------------------------------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------";
        String seasonally = "Seasonally adjusted                                  ";
        String notSeasonally = "Not Seasonally adjusted                                ";
        String performance = "Performance Measures                       ";
        String tax = "Total Tax Revenue";
        String property = "Property";
        String income = "Income";
        String sales = "Sales";
        String na = "(na)";
        int taxRevenue = 1254632;
        int propertyAmount = -213423;
        int incomeAmount = 120039;
        int salesAmount = 92348476;
        float propertyIndicator = 2.5487F;
        double incomeIndicator = 0.74;
        double salesIndicator = 720.75;
        System.out.println(line);
        System.out.printf("|| %94s || %94s || %66s || \n", seasonally, notSeasonally, performance);
        System.out.println(line);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", tax, property, income, sales);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", tax, property, income, sales);
        System.out.printf("|| %-20s | %-20s | %-20s || \n", property, income, sales);
        System.out.println(line);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", na, na, na, na);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", na, na, na, na);
        System.out.printf("|| %-20s | %-20s | %-20s ||\n", na, na, na, na);
        System.out.println(line);
        System.out.printf("|| %+,25d | %(,20d | %(,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);


    }

}
