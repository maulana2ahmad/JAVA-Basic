package com.example.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput
{
    public static void main ( String[] args)
    {
        int firNumber;
        int lastNumber;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the firs number");
        firNumber = kb.nextInt();

        System.out.println("Plese enter the las number");
        lastNumber = kb.nextInt();

        double average = (firNumber + lastNumber) / 2.0;

        System.out.println("The Average : " + average);

        String name;
        String username;

        kb.nextLine();
        System.out.println("Pleas enter you name : ");
        name = kb.nextLine();

        System.out.println("Please enter you username : ");
        username = kb.nextLine();

        System.out.println("Hallo " + name + " " + username);
    }
}