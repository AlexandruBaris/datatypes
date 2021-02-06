package practice;

import java.util.Arrays;

public class Testing {
    public static void main(String... args) {
        //Instance variables are declared in a class, but outside a method, constructor or any block.
        int a; // - instance variable


        ///Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        ///Sometimes you must use wrapper classes, for example when working with Collection objects,
        // such as ArrayList, where primitive types cannot be used (the list can only store objects):
        String b = "123";
        int x = Integer.parseInt(b);
        int y = Integer.parseInt("123");
        System.out.println(x);


        //The java string valueOf() method converts different types of values into string.
        // By the help of string valueOf() method, you can convert int to string, long to string,
        // boolean to string, character to string, float to string, double to string,
        // object to string and char array to string.
        int value = 10;
        String s = String.valueOf(value);
        System.out.println(s + 10);


        // ternary
        int r = 20;
        int e = r < 21 ? 1 : 2;
        System.out.println(e);
        // condition ? true : false;


        // enhanced for loop
        int[] numbers = {10, 20, 30, 40, 50};

        for (int k : numbers) {
            System.out.print(k + " ");
        }
        System.out.println();
        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(Arrays.toString(numbers) + " ");
        }

    }
}
