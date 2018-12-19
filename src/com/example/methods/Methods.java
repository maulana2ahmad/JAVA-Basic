package com.example.methods;

import javax.swing.*;

public class Methods
{
    public static void main(String[] args)
    {

//        printAverage(20, 30);

//        double average = getAverage(30, 30);
//        System.out.println("Average: " + average);

//        String fullName = fullName("Maulana",  "Ahmad");
//        System.out.println(fullName);

        int value = 20;

        if (isvalied(value))
        {
            System.out.printf("The value is in range!");
        }
        else
        {
            System.out.println("The value is not range!");
        }
    }

    /**
     * This method prints the average of two number
     * @param var1 The first value
     * @param var2 The second value
     */

    public static void printAverage(int var1, int var2)
    {
        double average = (var1 + var2) / 2.0;

        System.out.println("Average: " + average);
    }

    /**
     * The method calculate the average and return it
     * @param var1 The first value
     * @param var2 The second value
     * @return The average of the 2 value
     */

    public static double getAverage(int var1, int var2)
    {
//        double average = (var1 + var2) / 2.0; //cara tidak singkat
//        return average;

          return (var1 + var2) / 2.0; //Cara singkat
    }

    /**
     *
     * @param name
     * @param surname
     * @return
     */

    public static String fullName(String name, String surname)
    {
//        String fullName = name + " " + surname; cara tidak singkat
//        return fullName;

          return name + " " + surname; //cara singkat
    }

    /**
     *
     * @param number
     * @return
     */

    //range between 1 and 100
    public static boolean isvalied(int number)
    {
        //cara lambat
//        boolean status;
//
//        if (number >= 1 && number <= 100)
//        {
//            status = true;
//        }
//        else
//        {
//            status = false;
//        }
//        return status;

        return (number >= 1 && number <= 100); //cara singkat
    }
}