package com.example.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals
{
    public static void main(String[] args)
    {
        int days;
        double sales;
        double totalSales = 0.0; // running total

        DecimalFormat dolar = new DecimalFormat("#,##0.00"); //2000.000 -> dibulatkan

        String input = JOptionPane.showInputDialog("Untuk berapa hari Anda punya penjualan " + "Angka");
        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Masukkan penjualan selama berhari-hari " + count);

            sales = Double.parseDouble(input);

            //totalSales = totalSales + sales; // sama saja dengan (totalSales += sales;)

            totalSales += sales;
        }

        JOptionPane.showMessageDialog(null, "Total penjualan: $ " + dolar.format(totalSales));

        System.exit(0);


    }
}
