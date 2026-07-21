package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
public class StudentMain {
    public static void main(String[] args) {
        Student[] data = new Student[5];
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {70, 80, 90});
        data[2] = new Student("Ravi", null);
        data[3] = null;
        data[4] = new Student("Priya", new int[] {40, 60, 55});
        StudentReport report = new StudentReport();
        System.out.println("Student Grades");
        System.out.println("-------------------------");
        for (Student s : data) {
            try {
                if (s == null) {
                    System.out.println("Student object is null");
                    continue;
                }
                String grade = report.validate(s);
                System.out.println("Name : " + s.getName());
                System.out.println("Grade : " + grade);
            } catch (NullNameException e) {
                System.out.println(e.getMessage());
            } catch (NullMarksArrayException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("-------------------------");
        }
        StudentService service = new StudentService();

        System.out.println("Number of Null Student Objects : "
                + service.findNumberOfNullObjects(data));

        System.out.println("Number of Null Student Names : "
                + service.findNumberOfNullNames(data));

        System.out.println("Number of Null Marks Arrays : "
                + service.findNumberOfNullMarksArray(data));
    }
}