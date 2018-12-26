package com.example.array;

public class SumAndAverage
{
    public static void main(String[] args)
    {
        int [] value = {1, 2, 3};

        int sum = 0;

        for (int i = 0; i < value.length; i++)
        {
            sum += value[i];
        }
        double average = (double) sum / value.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
