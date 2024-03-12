package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.*;

public class _5_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLines = Integer.parseInt(sc.nextLine());

        Map<String, List <Double>> students = new TreeMap();

        for(int i=0; i<inputLines; i++){

            String[] data = sc.nextLine().split("\\s+");
            String student = data[0];
            double grade = Double.parseDouble(data[1]);

            if(students.containsKey(student)){
                students.get(student).add(grade);
            }else{
                students.put(student,new ArrayList<>());
                students.get(student).add(grade);
            }
        }
        students.entrySet().forEach(student -> {
            System.out.printf("%s -> ",student.getKey());
            double grades = 0;
            int counter = 0;
            for (int i = 0; i < student.getValue().size(); i++) {
                grades += student.getValue().get(i);
                counter++;
                System.out.printf("%.2f ",student.getValue().get(i));
            }
            double averageGrade = grades / counter;
            System.out.printf("(avg: %.2f)%n",averageGrade);
        });

    }
}
