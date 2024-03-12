package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.*;

public class _8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsCount = Integer.parseInt(sc.nextLine());

        Map<String, Double> students = new TreeMap<>();

        for(int i=0; i<studentsCount; i++){
            String student =sc.nextLine();
            double grade = getGrade(sc);
            students.putIfAbsent(student, grade);
        }

        students.forEach((student,grade) ->{
            System.out.printf("%s is graduated with %s\n",student,grade);
        });
    }

    public static double getGrade(Scanner sc){
        double[] grades = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        double total=0;
        for(int i=0;i<grades.length;i++){
            total+=grades[i];
        }
        return total/grades.length;
    }
}
