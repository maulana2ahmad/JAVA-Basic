package com.example.textfiels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WrintingToFiles
{
    public static void main(String[] args) throws IOException
    {
        //create the file and open the file
        //if the file exit it will repleace the file
        PrintWriter outputFiles = new PrintWriter("OutputFiles.txt");

        outputFiles.println("This is line 1");
        outputFiles.println("This is line 2");
        outputFiles.println("This is line 3");
        outputFiles.println("This is line 4");
        outputFiles.println("This is line 5");

        outputFiles.close();
    }
}
