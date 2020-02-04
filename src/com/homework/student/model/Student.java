package com.homework.student.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private Faculty faculty;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int age, String phoneNumber, Faculty faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }

    /*getting students with the same full name, counting them and adding to a map*/
    public static Map<Student, Integer> getStudentsNumberWithSameFullName(List<Student> studentList) {
        Map<Student, Integer> studentsMap = new HashMap<>();
        if (studentList != null) {
            for (Student student : studentList) {
                if (studentsMap.containsKey(student)) {
                    studentsMap.put(student, studentsMap.get(student) + 1);
                } else {
                    studentsMap.put(student, 1);
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
                    facultiesMap.put(student.getFaculty(), facultiesMap.get(student.getFaculty()) + 1);
                } else {
                    facultiesMap.put(student.getFaculty(), 1);
                }
            }
        }
        return facultiesMap;
    }
}
