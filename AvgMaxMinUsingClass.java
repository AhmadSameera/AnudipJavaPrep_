package anudip_assignment;

import java.util.Scanner;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    int rollNumber;
    Subject[] subjects;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        subjects = new Subject[2];
        subjects[0] = new Subject("Maths", 0);
        subjects[1] = new Subject("English", 0);
    }
}

class Teacher {
    void setMarks(Student student) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < student.subjects.length; i++) {
            System.out.print("Enter marks for " + student.subjects[i].name + " for " + student.name + ": ");
            student.subjects[i].marks = scanner.nextInt();
        }
    }

    double calculateAverage(Student[] students) {
        double totalMarks = 0;
        for (Student student : students) {
            for (Subject subject : student.subjects) {
                totalMarks += subject.marks;
            }
        }
        return totalMarks / (students.length * 2); // Assuming 2 subjects per student
    }

    void findMaxMin(Student[] students) {
        int maxMarks = Integer.MIN_VALUE;
        int minMarks = Integer.MAX_VALUE;

        for (Student student : students) {
            for (Subject subject : student.subjects) {
                maxMarks = Math.max(maxMarks, subject.marks);
                minMarks = Math.min(minMarks, subject.marks);
            }
        }

        System.out.println("Maximum Marks: " + maxMarks);
        System.out.println("Minimum Marks: " + minMarks);
    }
}

public class AvgMaxMinUsingClass {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);

        // Create 10 students with names and roll numbers
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i] = new Student(name, i + 1);
        }

        // Set marks for each student's subjects
        for (Student student : students) {
            teacher.setMarks(student);
        }

        // display the average marks
        double averageMarks = teacher.calculateAverage(students);
        System.out.println("Average Marks: " + averageMarks);

        // Find  the maximum and minimum marks
        teacher.findMaxMin(students);
    }
}

