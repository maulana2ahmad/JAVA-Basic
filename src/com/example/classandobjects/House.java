package com.example.classandobjects;

public class House
{
    private int nrOfWindows;
    private int nrOfDoors;
    private String typeRoof;
    private String typeWalls;


    //Konstraktor 1
    //Konstrakter method yang sama dengan nilai parameter yang berbeda adalah method overloading
    //method ini hanya mengembalikan nilai untuk properti tertentu
    public House()
    {
        nrOfWindows = 0;
        nrOfDoors = 0;
        typeRoof = null;
        typeWalls = null;
    }

    //Konstraktor 2
    public House(int nrOfWindows, int nrOfDoors, String typeRoof, String typeWalls)
    {
        this.nrOfWindows = nrOfWindows;
        this.nrOfDoors = nrOfDoors;
        this.typeRoof = typeRoof;
        this.typeWalls = typeWalls;
    }


    // cara 3 lebih baik
    //getter
    public int getNrOfWindows()
    {
        return nrOfWindows;
    }

    public int getNrOfDoors()
    {
        return nrOfDoors;
    }

    public String getTypeRoof()
    {
        return typeRoof;
    }

    public String getTypeWalls()
    {
        return typeWalls;
    }

    //setter
    public void setNrOfWindows ( int nrOfWindows)
    {
        this.nrOfWindows = nrOfWindows;
    }

    public void setNrOfDoors(int nrOfDoors)
    {
        this.nrOfDoors = nrOfDoors;
    }

    public void setTypeRoof(String typeRoof)
    {
        this.typeRoof = typeRoof;
    }

    public void setTypeWalls(String typeWalls)
    {
        this.typeWalls = typeWalls;
    }
}
