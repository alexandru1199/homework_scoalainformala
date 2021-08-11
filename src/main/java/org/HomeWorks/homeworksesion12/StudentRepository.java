package org.HomeWorks.homeworksesion12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> Students = new ArrayList<>();

    public void addStudent(Student student) {
        Students.add(student);
    }

    public void removeStudent(String ID) {

        for (Student i : Students) {
            if (i.getID() == ID) {
                Students.remove(i);
            }
        }
    }

    public void retrieveStudentsByAge(int age) {
        if (age < 0) {
            throw new ArithmeticException("the age should be positive");
        }
        for (Student i : Students) {

            if (i.getAge() == age) {

                System.out.println(i.getFirstName());
            }
        }
    }

    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepository();
        studentRepository.addStudent(new Student("Sirbu", "Alexandru-VLADUT", "1", "M", LocalDate.of(2000, 2, 7)));
        studentRepository.addStudent(new Student("Sirbu2", "Alexandru-VLADUT2", "2", "M", LocalDate.of(2000, 2, 7)));
        studentRepository.addStudent(new Student("Sirbu3", "Alexandru-VLADUT3", "1", "M", LocalDate.of(2003, 2, 7)));
        for (Student i : studentRepository.Students) {
            System.out.println(i.getFirstName());
        }

        studentRepository.retrieveStudentsByAge(21);
        studentRepository.removeStudent("2");
        for (Student i : studentRepository.Students) {
            System.out.println(i.getFirstName());
        }

    }
}
