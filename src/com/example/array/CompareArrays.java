package com.example.array;

public class CompareArrays
{
    public static void main(String[] args)
    {
        //Membandingkan Array=
        int [] number1 = {2, 3, 4, 5, 6, 7};
        int [] number2 = {2, 3, 4, 5, 6, 7};

        boolean arraysEqual = true;
        int i = 0;

        if (number1.length != number2.length)
        {
            arraysEqual = true;
        }
        while (arraysEqual && i < number1.length)
        {
            if (number1[i] != number2[i])
            {
                arraysEqual = false;
            }
            i++;
        }

        if (arraysEqual)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not the same");
        }

        //Cara salah, untuk membandiingkan dua Array dengan menggunakan sama dengan ganda
//        if (number1 == number2)
//        {
//            System.out.println("They are the same");
//        }
//        else
//        {
//            System.out.println("They are not the same");
//        }
    }
}
