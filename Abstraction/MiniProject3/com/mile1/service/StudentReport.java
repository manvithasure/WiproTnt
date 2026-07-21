package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
public class StudentReport {
    public String validate(Student s)
            throws NullNameException, NullMarksArrayException {
        if (s.getName() == null) {
            throw new NullNameException();
        }
        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }
        int[] marks = s.getMarks();
        for (int mark : marks) {
            if (mark < 35) {
                s.setGrade("F");
                return "F";
            }
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double avg = sum / (double) marks.length;
        if (avg >= 85) {
            s.setGrade("A+");
        } else if (avg >= 70) {
            s.setGrade("A");
        } else if (avg >= 60) {
            s.setGrade("B");
        } else if (avg >= 50) {
            s.setGrade("C");
        } else {
            s.setGrade("F");
        }
        return s.getGrade();
    }
}