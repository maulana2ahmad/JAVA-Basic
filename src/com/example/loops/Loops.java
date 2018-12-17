package com.example.loops;

public class Loops
{
    public static void main(String[] args)
    {
        // the while loop

        int x = 0; // loop control variable

        while (x < 5) //pre-test loop
        {
            System.out.println("Hello Word");
            x++; // increment
        }

        System.out.println("++++++++++++++++");

        //to do--while loop

        int y = 0; //loop control variable

        do
        {
            System.out.println("Hello word");
            y++;

        } while (y < 5); //post-test loop

        System.out.println("++++++++++++++++");


        //the for loop
        for (int a = 0; a < 5; a++) //pre-test loop
        {
            System.out.println("Hello word!");
        }
    }
}
