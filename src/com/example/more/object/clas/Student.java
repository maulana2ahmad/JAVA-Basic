package com.example.more.object.clas;

public class Student
{
    private String studentName;
    private long studentNumber;

    //konstraktor
    public Student(String studentName, long studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public Student(Student student)
    {
        this.studentName = student.studentName;
        this.studentNumber = student.studentNumber;
    }

    public boolean equals(Student object)
    {
        return (this.studentNumber == object.studentNumber && this.studentName.equals(object.studentName));
    }

    //getter and setter

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public long getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString()
    {
        return "The Information: \n " +
                "Student Name: " + studentName + "\n" +
                "Student Nuber: " + studentNumber + "\n" + "\n";
    }
}
