package org.example.srp;

public class Main {
    public static void main(String[] args) {

        Student student=new Student();

        StudentEmails studentEmails=new StudentEmails();
        studentEmails.sendEmail();

        StudentRegister studentRegister=new StudentRegister();
        studentRegister.registerStudent();

        StudentResult studentResult=new StudentResult();
        studentResult.calculateStudentResult();

        //TODO Each class should have only one method.

    }
}