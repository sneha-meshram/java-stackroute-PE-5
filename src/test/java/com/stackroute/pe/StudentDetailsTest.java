package com.stackroute.pe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDetailsTest {

    StudentDetails studentDetails;

    @Test

    public void givenClassShouldReturnTheStudentDetails(){
        List<StudentDetails> inputStudent=new ArrayList();

        StudentDetails detail1=new StudentDetails(1,"stella",23);
        StudentDetails detail2=new StudentDetails(2,"julie",33);
        StudentDetails detail3=new StudentDetails(3,"rosie",45);
        StudentDetails detail4=new StudentDetails(4,"julie",17);

        inputStudent.add(detail1);
        inputStudent.add(detail2);
        inputStudent.add(detail3);
        inputStudent.add(detail4);

        Collections.sort(inputStudent,new StudentSort());
        String expected="[Student{id=1, name='stella', age=23}, Student{id=2, name='julie', age=33}, Student{id=3, name='rosie', age=45}}]";
        assertEquals(expected, inputStudent.toString());
    }

}