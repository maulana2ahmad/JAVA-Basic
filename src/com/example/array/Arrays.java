package com.example.array;

public class Arrays
{
    public static void main(String[] args)
    {
        int [] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;

        int [] numbers2 = {10, 15, 20, 25, 30, 35, 40};

//        System.out.println(numbers[1]);

        for (int i = 0; i < numbers2.length; i++)
        {
            System.out.println(numbers2[i]);
        }

        System.out.println();

        //cara cepat for loop
        for (int var : numbers2)
        {
            System.out.println(var);
        }
    }
}
