package com.example.theswitc.statement;

import javax.swing.*;

public class TheSwitchStatement
{
    public static void main(String[] args)
    {
        int number;

        String input = JOptionPane.showInputDialog("Please enter 1, 2, or 3: ");
        number = Integer.parseInt(input);

        /**
         * If Else
         */
//        if (number == 1)
//        {
//            JOptionPane.showMessageDialog(null, "Please enter 1");
//        }
//        else if (number == 2)
//        {
//            JOptionPane.showMessageDialog(null, "Please enter 2");
//        }
//        else if (number == 3)
//        {
//            JOptionPane.showMessageDialog(null, "Please enter 3");
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Your did not enter 1, 2, 3!");
//        }
        /**
         * Switch
         */
        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Your enter 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Your enter 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Your enter 3");
                break;

             default:
             JOptionPane.showMessageDialog(null, "Your did not enter 1, 2, or 3");
        }

        char latter;

        input = JOptionPane.showInputDialog("Please enter your a, b, or c");
        latter = input.charAt(0);

        switch (latter)
        {
            case 'a':
                JOptionPane.showMessageDialog(null, "Your enter a");
                break;
            case 'b':
                JOptionPane.showMessageDialog(null, "Your enter b");
                break;
            case 'c':
                JOptionPane.showMessageDialog(null, "Your enter c");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Your did not 1, b, or c");
        }
        System.exit(0 );
    }
}
