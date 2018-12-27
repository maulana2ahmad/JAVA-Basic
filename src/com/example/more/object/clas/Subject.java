package com.example.more.object.clas;

public class Subject
{
    private String subjectCode;
    private String subjectName;

    //konstrak 1
    public Subject (String subjectCode, String subjectName)
    {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    //konstrak 2
    public Subject (Subject subject)
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    //booleann konstrak
    public boolean equalse (Subject object)
    {
        //if jika di ganti return
        return (this.subjectCode.equals(object.subjectCode) &&
            this.subjectName.equals(object.subjectName));
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }

    public String getSubjectCode()
    {
        return subjectCode;
    }

    //inheritance
    //overriding
    @Override
    public String toString()
    {
        return "Sibject information: \n" +
                "Subject Code: " + subjectCode + "\n" +
                "Subject Name: " + subjectName;
    }
}
