package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int integerType = 10;
        double doubleType = 20.30;
        String stringType = "hello world";
        char charType = 'M';
        String[] arrayString = {"this", "is", "array"};
        ArrayList<String> listType = new ArrayList();
        listType.add("hello");
        listType.add("world");
        //int type is the label for printing the variable value
        System.out.println("int type: " + integerType);
        System.out.println("double type: " + doubleType);
        System.out.println("string type: " + stringType);
        System.out.println("char type: " + charType);
        //Array and Aaraylist are not printable with the following code (in row), we need to have access to each positions.
        // Loop is the way to access to every positions
        System.out.println("array of string: " + arrayString);
        for(int e = 0; e < arrayString.length; e++){
            //instructions here
            //1st way
            //System.out.println(arrayString[e]);
            //2st way
            System.out.print(arrayString[e] + " ");
        }

        System.out.println();

        for (int e = 0; e < listType.size(); e++){
            System.out.print(listType.get(e) + " ");
        }
    }
}