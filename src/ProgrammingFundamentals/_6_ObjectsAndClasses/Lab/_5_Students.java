package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _5_Students {
    private String firstName;
    private String lastName;
    private String age;
    private String homeTown;

    public _5_Students(String firstName, String lastName, String age, String homeTown) {
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
        List<_5_Students> students = new ArrayList<>();
        String input = sc.nextLine();

        while(!input.equals("end")){
            String[] data= input.split(" ");

            _5_Students student=new _5_Students(data[0],data[1],data[2],data[3]);
            students.add(student);

            input=sc.nextLine();
        }

        String town= sc.nextLine();

        for(_5_Students student : students){
            if(student.getHomeTown().equals(town)){
                System.out.println(student.getFirstName()+" "+student.getLastName()+" is "+student.getAge()+" years old");
            }
        }
    }
}
