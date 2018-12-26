package com.example.array;

public class HeightAndLow
{
    public static void main(String[] args)
    {
        int [] numbers = {2, 6, 10, 12, 15, 17, 1, 22};

        int height = numbers[0];
//  Mencetak nilai tertinggi
        for (int i =1; i < numbers.length; i++)
        {
            if (numbers[i] > height)
            {
                height = numbers[i];
            }
        }
        System.out.println("The height value is: " + height);

        //Mencetak nilai terendah

        int low = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < low)
            {
                low = numbers[i];
            }
        }
        System.out.println("The low vlue is: " + low);
    }
}