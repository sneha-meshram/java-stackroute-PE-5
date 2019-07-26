package com.stackroute.pe;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentDetailsTest {

    StudentDetails studentDetails;

    @Test

    public void givenClassShouldReturnTheStudentDetails(){
        ArrayList<StudentDetails> inputStudent=new ArrayList();
        StudentDetails detail1=new StudentDetails(1,"stella",23);
        StudentDetails detail2=new StudentDetails(2,"julie",23);
        StudentDetails detail3=new StudentDetails(1,"rosie",23);

        inputStudent.add(detail1);
        inputStudent.add(detail2);
        inputStudent.add(detail3);

        String expectedOutput={}






    }

}