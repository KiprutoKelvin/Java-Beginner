package com.kiprutoh;

import java.awt.*;
import java.util.Arrays;

public class Main {
    /*
    How to build Methods:
        - Access Modifier
        - Optional Static
        - Return Type
        - Name
        - Optional Parameters
        - Method Body
        - Optional Return Value
     */
    private  static int add(int n1, int n2) {
        int results = n1 + n2;
        return results;
    }
    public static void main(String[] args) {

        System.out.println("Chamgei missing");
        System.out.println();
        System.out.println(20 + 10);

        // Primitives
        int number1 = 20;
        int number2 = 30;
        double amount = 1_000_000_005.23;
        int result = number1 + number2;
        System.out.println(result);
        System.out.println(amount);
        double pi = 3.14;
        boolean isAdult = true;
        char a = 'A';
        byte n = 127;
        short m = 32000;

        // Naming variable
        int numberOfGoals = 0;
        System.out.println(numberOfGoals);
        // booleans
        boolean hasDog = true;
        // Strings
        String brand = "KiprutoFarm";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.substring(0, 3));
        System.out.println("  ".isEmpty());
        System.out.println("  ".isBlank());

        /*
            Reference Types
            objects
         */
        int age = 24;
        Point pointA = new Point(45, 60);
        System.out.println("pointA = " + pointA);
        pointA.move(10, 11);
        System.out.println("pointA = " + pointA);

        // Arrays
        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 55;
        numbers[2] = 12;
        numbers[3] = 36;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {8, 6, 4, 3, 2};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 65;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        String[] names = {"Kiru", "Mambet"};

        // Arrays null values
        int[] numbers3 = new int[4];
        Arrays.fill(numbers3, -5);//fill default value
        numbers3[0] = 2;
        System.out.println(Arrays.toString(numbers3));

        String[] names1 = new String[5];
        Arrays.fill(names1, "Mobjot");
        names1[1] = "Rotich";
        System.out.println(Arrays.toString(names1));

        // Loops and Arrays
        String[] names2 = {"John", "Doe", "Labat", "Solopchot", "Artet"};
        System.out.println("\nOriginal Array");
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
        System.out.println("\nReversed Array");
        for (int i = names2.length -1; i >= 0; i--) {
            System.out.println(names2[i]);
        }

        // If Statements
        if (false){
            System.out.println("This statement is true");
        }else {
            System.out.println("This statement is false");
        }

        // Methods
        int results = add(20, 67);
        System.out.println(results);

        // Classes
            Dog dog = new Dog();
            dog.bark();
    }

        static class Dog {
            String jina;
            void bark() {
                System.out.println(jina + ": bark...");
            }
        }
}