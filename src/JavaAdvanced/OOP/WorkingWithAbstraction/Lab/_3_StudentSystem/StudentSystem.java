package JavaAdvanced.OOP.WorkingWithAbstraction.Lab._3_StudentSystem;


import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem()
    {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[]args) {
        String command = args[0];
        String name = args[1];

        if (command.equals("Create"))
        {
            int age = Integer.parseInt(args[2]);
            double grade =Double.parseDouble(args[3]);

           create(name,age,grade);
        }
        else if (command.equals("Show"))
        {
           show(name);
        }
    }

    public void create(String name,int age, double grade){
        if (!repo.containsKey(name))
        {
            var student = new Student(name, age, grade);
            repo.put(name,student);
        }
    }

    public void show(String name){
        if (repo.containsKey(name))
        {
            Student student = repo.get(name);
            print(student);
        }
    }

    public void print(Student student){
        String view = String.format("%s is %s years old.",student.getName(),student.getAge());

        if (student.getGrade() >= 5.00)
        {
            view += " Excellent student.";
        }
        else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50)
        {
            view += " Average student.";
        }
        else
        {
            view += " Very nice person.";
        }

        System.out.println(view);
    }

}
