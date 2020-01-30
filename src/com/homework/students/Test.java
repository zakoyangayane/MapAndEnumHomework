package com.homework.students;

import com.homework.students.model.Student;
import com.homework.students.service.StudentService;

public class Test {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        //print the number of students who have the same full name
        studentService.printMap(Student.getStudentsNumberWithSameFullName(studentService.studentList));
        System.out.println();

        //print the number of students studying in the same faculty
        studentService.printMap(Student.getStudentsNumberFromSameFaculty(studentService.studentList));
        System.out.println();

    }
}
