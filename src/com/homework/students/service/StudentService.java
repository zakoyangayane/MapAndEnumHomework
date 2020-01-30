package com.homework.students.service;

import com.homework.students.model.Faculties;
import com.homework.students.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentService {

    /*creating Student objects*/
    public final Student student1 = new Student("Aram", "Gabrielyan",
            21, "091111111", Faculties.appliedMathematicsAndInformatics);
    public final Student student2 = new Student("Gayane", "Zakoyan",
            19, "092222222", Faculties.philosophy);
    public final Student student3 = new Student("Ani", "Simonyan",
            15, "093333333", Faculties.appliedMathematicsAndInformatics);
    public final Student student4 = new Student("Aram", "Gabrielyan",
            30, "094444444", Faculties.physics);
    public final Student student5 = new Student("Gayane", "Zakoyan",
            46, "095555555", Faculties.physics);
    public final Student student6 = new Student("Ani", "Simonyan",
            28, "096666666", Faculties.philosophy);
    public final Student student7 = new Student("Gayane", "Zakoyan",
            32, "097777777", Faculties.appliedMathematicsAndInformatics);
    public final Student student8 = new Student("Ani", "Simonyan",
            29, "098888888", Faculties.appliedMathematicsAndInformatics);

    /*creating list of the students*/
    public List<Student> studentList = new ArrayList<>() {{
        add(student1);
        add(student2);
        add(student3);
        add(student4);
        add(student5);
        add(student6);
        add(student7);
        add(student8);
    }};

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
}
