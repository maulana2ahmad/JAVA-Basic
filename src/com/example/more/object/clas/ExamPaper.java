package com.example.more.object.clas;

public class ExamPaper
{
    public Student student;
    public Subject subject;
    private int marks;

    public ExamPaper(Student student, Subject subject, int marks)
    {
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    public Subject getSubject()
    {
        return subject;
    }

    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }
}
