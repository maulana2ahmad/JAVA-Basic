package com.example.more.object.clas;

import javax.swing.*;

public class Driver
{
    public static void main(String[] args)
    {
        Subject subject1 = new Subject("TPLMI01", "Teknik Informatika 1");

        Student student1 = new Student("Maulana", 2013140911);

        ExamPaper Paper = new ExamPaper(student1, subject1, 100);

        System.out.println("Subject Code: " + Paper.getSubject().getSubjectCode());

        System.out.println("Student Name: " + Paper.getStudent().getStudentName());

        System.out.println("Student Number: " + Paper.getStudent().getStudentNumber());

        System.out.println("Marks: " + Paper.getMarks());

//        //print semuanya
//        System.out.println(Paper);

        //isi subject class
//        Subject subject2 = new Subject("TPLMI02", "Teknik Informatika 2");
//
//        if (subject1.equalse(subject2))
//            System.out.println("They are the same");
//
//        System.out.println(subject1);

//            //menggunakan poopup
//            JOptionPane.showMessageDialog(null, "The are the same: ");
//
//        JOptionPane.showMessageDialog(null, subject1);
    }
}
