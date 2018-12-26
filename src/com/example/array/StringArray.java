package com.example.array;

public class StringArray
{
    public static void main(String[] args)
    {
        String[] names = getName();

        for (int i = 0; i < names.length; i++)
        {
            if (names[i] != null)
            {
                System.out.println(names[i].charAt(0));
            }
        }
    }
    public static String [] getName()
    {
        String [] names = new String[6];

        names[0] = "Maulana";
        names[1] = "Ahmad";
        names[2] = "Dinda";
        names[3] = "Paramitha";
        names[4] = "Mdul";

        return names;
    }
}
