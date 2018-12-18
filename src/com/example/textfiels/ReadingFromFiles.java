package com.example.textfiels;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("OutputFiles.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());

            inputFile.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The file does" + " not exite");
        }
    }
}
