package com.stackroute.pe;

import java.util.Comparator;

public class StudentDetails {

    private int id;
    private String name;
    private int age;

    //constructor
    public StudentDetails(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

class StudentSort implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails list1, StudentDetails list2) {
        if (list1.getAge() == list2.getAge()) {
            if (list1.getName().equals(list2.getName()))
                return list1.getId() - list2.getId();
            else
                return list2.getName().compareTo(list1.getName());
        } else {
            return
                    list2.getAge() - list1.getAge();
        }
    }
}
