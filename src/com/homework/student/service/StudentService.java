package com.homework.student.service;

import com.homework.student.model.Faculty;
import com.homework.student.model.Student;

import java.util.*;

public class StudentService {
    public List<Student> studentList;

    public StudentService() {
        /*creating Student objects*/
        final Student student1 = new Student("Aram", "Gabrielyan",
                21, "091111111", Faculty.APPLIED_MATHEMATICS_AND_INFORMATICS);
        final Student student2 = new Student("Gayane", "Zakoyan",
                19, "092222222", Faculty.PHILOSOPHY);
        final Student student3 = new Student("Ani", "Simonyan",
                15, "093333333", Faculty.APPLIED_MATHEMATICS_AND_INFORMATICS);
        final Student student4 = new Student("Aram", "Gabrielyan",
                30, "094444444", Faculty.PHYSICS);
        final Student student5 = new Student("Gayane", "Zakoyan",
                46, "095555555", Faculty.PHYSICS);
        final Student student6 = new Student("Ani", "Simonyan",
                28, "096666666", Faculty.PHILOSOPHY);
        final Student student7 = new Student("Gayane", "Zakoyan",
                32, "097777777", Faculty.APPLIED_MATHEMATICS_AND_INFORMATICS);
        final Student student8 = new Student("Ani", "Simonyan",
                29, "098888888", Faculty.APPLIED_MATHEMATICS_AND_INFORMATICS);

        /*creating list of the students*/
        studentList = new ArrayList<>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
            add(student5);
            add(student6);
            add(student7);
            add(student8);
        }};
    }

    /*printing the map*/
    public void printMap(Map map) {
        if (!map.isEmpty()) {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                Object current = iterator.next();
                System.out.println(current + " " + map.get(current));
            }
        }
    }

    /*getting students with the same full name, counting them and adding to a map*/
    public Map<Student, Integer> getStudentsNumberWithSameFullName(List<Student> studentList) {
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
    public Map<Enum<Faculty>, Integer> getStudentsNumberFromSameFaculty(List<Student> studentList) {
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
