package com.example.textfiels;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles
{
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int count = 0;
        double average;

        File file = new File("OutputFile.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

//            Cetak manual
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());

            while (inputFile.hasNext())
            {
//                System.out.println(inputFile.nextLine()); //ketika looping string

                sum = sum + inputFile.nextInt();
                count++;
            }

            inputFile.close();

            average = sum / (double) count;

            JOptionPane.showMessageDialog(null,
                    "Sum of all values: " + sum + "\n" +
                             "The number of value: " + count + "\n" +
                             "The verage is: " + average);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The file does" + " not exite");
        }
    }
}
