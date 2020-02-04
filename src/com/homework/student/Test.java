package com.homework.student;

import com.homework.student.service.StudentService;

public class Test {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        //print the number of students who have the same full name
        studentService.printMap(StudentService.getStudentsNumberWithSameFullName(studentService.studentList));
        System.out.println();

        //print the number of students studying in the same faculty
        studentService.printMap(StudentService.getStudentsNumberFromSameFaculty(studentService.studentList));
        System.out.println();

    }
}
