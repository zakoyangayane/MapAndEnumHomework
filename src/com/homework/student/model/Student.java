package com.homework.student.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private int age;
    private String phoneNumber;
    private Faculty faculty;

    public Student(String firstName, String lastName, int age, String phoneNumber, Faculty faculty) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        setAge(age);
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(FIRST_NAME, student.FIRST_NAME) &&
                Objects.equals(LAST_NAME, student.LAST_NAME) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                faculty == student.faculty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIRST_NAME, LAST_NAME, age, phoneNumber, faculty);
    }

    /*getting students with the same full name, counting them and adding to a map*/
    public static Map<String, Integer> getStudentsNumberWithSameFullName(List<Student> studentList) {
        Map<String, Integer> studentsMap = new HashMap<>();
        if (studentList != null) {
            for (Student student : studentList) {
                String fullName = student.getFIRST_NAME() + " " + student.getLAST_NAME();
                if (studentsMap.containsKey(fullName)) {
                    studentsMap.replace(fullName, studentsMap.get(fullName) + 1);
                } else {
                    studentsMap.put(fullName, 1);
                }
            }
        }
        return studentsMap;
    }

    /*getting number of students studying in the same faculty */
    public static Map<Enum<Faculty>, Integer> getStudentsNumberFromSameFaculty(List<Student> studentList) {
        Map<Enum<Faculty>, Integer> facultiesMap = new HashMap<>();
        if (studentList != null) {
            for (Student student : studentList) {
                if (facultiesMap.containsKey(student.getFaculty())) {
                    facultiesMap.replace(student.getFaculty(), facultiesMap.get(student.getFaculty()) + 1);
                } else {
                    facultiesMap.put(student.getFaculty(), 1);
                }
            }
        }
        return facultiesMap;
    }
}
