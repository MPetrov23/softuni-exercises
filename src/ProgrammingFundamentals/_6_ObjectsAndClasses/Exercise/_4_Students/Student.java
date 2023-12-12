package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise._4_Students;

import java.util.*;

public class Student {

    private String name;
    private double grade;

    public Student(double grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();

        for(int i=0; i< lines; i++){
            String[] studentData = sc.nextLine().split(" ");
            String studentName = studentData[0]+" "+studentData[1];
            double studentGrade = Double.parseDouble(studentData[2]);

            Student student = new Student(studentGrade,studentName);
            students.add(student);
        }

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());

        for(Student student : students){
            System.out.printf("%s: %.2f\n",student.getName(),student.getGrade());

        }    }
}
