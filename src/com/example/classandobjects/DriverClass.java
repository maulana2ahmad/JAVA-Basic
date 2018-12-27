package com.example.classandobjects;

public class DriverClass
{
    public static void main(String[] args)
    {
        House house = new House(10, 2, "Title", "Brick" );

        //merubah menggunakan set
        house.setNrOfWindows(3);
        house.setTypeWalls("Plaster");

        System.out.println("House: ");
        System.out.println();
        System.out.println("Nr of windows: " + house.getNrOfWindows());
        System.out.println("Nr of Door: " + house.getNrOfDoors());
        System.out.println("Type of Roof: " + house.getTypeRoof());
        System.out.println("Type of Wall: " + house.getTypeWalls());
    }
}
