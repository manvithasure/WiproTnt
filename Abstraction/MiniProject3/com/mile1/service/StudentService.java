package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentService {
    public int findNumberOfNullMarksArray(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }
        return count;
    }
    public int findNumberOfNullNames(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }
        return count;
    }
    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }
        return count;
    }
    public void validateStudents(Student[] students) {
        StudentReport report = new StudentReport();
        for (Student s : students) {
            try {
                if (s == null) {
                    throw new NullStudentObjectException();
                }
                String grade = report.validate(s);
                System.out.println("Name : " + s.getName());
                System.out.println("Grade : " + grade);
            } catch (NullStudentObjectException e) {
                System.out.println(e.getMessage());
            } catch (NullNameException e) {
                System.out.println(e.getMessage());
            } catch (NullMarksArrayException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("-------------------------");
        }
    }
}