package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6_Students2 {
    private String firstName;
    private String lastName;
    private String age;
    private String homeTown;

    public _6_Students2(String firstName, String lastName, String age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<_6_Students2> students = new ArrayList<>();
        String input = sc.nextLine();

        while(!input.equals("end")){
            String[] data= input.split(" ");
            String firstName=data[0];
            String lastName=data[1];
            String age=data[2];
            String town=data[3];

            if(isExisting(students,firstName,lastName)){
                _6_Students2 student= getStudent(students,firstName,lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(town);


            }else {
                _6_Students2 student = new _6_Students2(firstName, lastName, age, town);
                students.add(student);
            }

            input=sc.nextLine();
        }

        String town= sc.nextLine();

        for(_6_Students2 student : students){
            if(student.getHomeTown().equals(town)){
                System.out.println(student.firstName+" "+student.getLastName()+" is "+student.getAge()+" years old");
            }
        }
    }

    private static boolean isExisting(List<_6_Students2> students, String firstName, String lastName){
        for(_6_Students2 student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    private static _6_Students2 getStudent(List <_6_Students2> students,String firstName, String lastName) {
        _6_Students2 existingStudent = null;

        for(_6_Students2 student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent=student;
            }
        }
      return existingStudent;

    }
}
