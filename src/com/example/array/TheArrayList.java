package com.example.array;

import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Maulana");
        names.add("Ahmad");
        names.add("Dinda");
        names.add("Paramitha");

        //merubah urutan dengan menambahkan nilai index
        names.add(3, "Mdul");

        //merubah nama dengan menambahkan nilai index
        names.set(1, "Ahmad Maulana");

        //menghapus dengan menambahkan nilai index
        names.remove(0);

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
    }
}
