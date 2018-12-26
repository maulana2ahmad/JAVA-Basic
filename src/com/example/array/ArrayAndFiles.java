package com.example.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayAndFiles
{
    public static void main(String[] args) throws FileNotFoundException {
        int [] values = new int[11];

        int i = 0;

        File file = new File("Values.txt");

        if (file.exists())
        {
            Scanner inpuFIle = new Scanner(file);

            while (inpuFIle.hasNext() && i < values.length)
            {
                values[i] = inpuFIle.nextInt();
                i++;
            }

            inpuFIle.close();

            for (int value : values)
            {
                System.out.println(value);
            }
        }
    }
}
