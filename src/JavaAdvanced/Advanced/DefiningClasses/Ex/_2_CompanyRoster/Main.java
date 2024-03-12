package JavaAdvanced.Advanced.DefiningClasses.Ex._2_CompanyRoster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        Department departments = new Department(count);

        for (int i = 0; i < count; i++) {
            String[] employeeData = sc.nextLine().split("\\s+");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];

            if(employeeData.length == 4){
                Employee employee=new Employee(name,salary,position,department);
                departments.add(employee);
            }
            else if (employeeData.length == 5) {
                if (employeeData[4].contains("@")) {
                    String email =employeeData[4];
                    Employee employee=new Employee(name,salary,position,department,email);
                    departments.add(employee);
                } else {
                    int age = Integer.parseInt(employeeData[4]);
                    Employee employee=new Employee(name,salary,position,department,age);
                    departments.add(employee);
                }
            } else if (employeeData.length == 6) {
                String email = employeeData[4];
                int age = Integer.parseInt(employeeData[5]);
                Employee employee=new Employee(name,salary,position,department,email,age);
                departments.add(employee);
            }
        }
        System.out.println(departments.getInfo());
    }
}
