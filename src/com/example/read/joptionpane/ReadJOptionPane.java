package com.example.read.joptionpane;

import javax.swing.*;

public class ReadJOptionPane
{
    public static void main(String[] args)
    {
        String name;
        String username;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        username = JOptionPane.showInputDialog("Please enter your username: ");

        String kedua = (name + " " + username);

        JOptionPane.showMessageDialog(null, "Hallo " + kedua); ;

        int firsNumber;
        int secondNumber;
        String input;

        input = JOptionPane.showInputDialog("Please enter firs number: ");
        firsNumber = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Please enter secon number");
        secondNumber = Integer.parseInt(input);

        double averager = (firsNumber + secondNumber) / 2.0;

        JOptionPane.showMessageDialog(null, "Average: " + averager);
    }
}