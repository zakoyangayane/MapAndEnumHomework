package com.homework.student.service;

import com.homework.student.model.Faculty;
import com.homework.student.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentService {

    /*creating Student objects*/
    public final Student student1 = new Student("Aram", "Gabrielyan",
            21, "091111111", Faculty.appliedMathematicsAndInformatics);
    public final Student student2 = new Student("Gayane", "Zakoyan",
            19, "092222222", Faculty.philosophy);
    public final Student student3 = new Student("Ani", "Simonyan",
            15, "093333333", Faculty.appliedMathematicsAndInformatics);
    public final Student student4 = new Student("Aram", "Gabrielyan",
            30, "094444444", Faculty.physics);
    public final Student student5 = new Student("Gayane", "Zakoyan",
            46, "095555555", Faculty.physics);
    public final Student student6 = new Student("Ani", "Simonyan",
            28, "096666666", Faculty.philosophy);
    public final Student student7 = new Student("Gayane", "Zakoyan",
            32, "097777777", Faculty.appliedMathematicsAndInformatics);
    public final Student student8 = new Student("Ani", "Simonyan",
            29, "098888888", Faculty.appliedMathematicsAndInformatics);

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
