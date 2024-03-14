package JavaAdvanced.OOP.Encapsulation.Ex._2_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double productPerDay(){
        return this.calculateProductPerDay();
    }

    @Override
    public String toString(){

        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",getName(),getAge(),productPerDay());
    }

    private double calculateProductPerDay(){
        if(getAge()<6){
            return 2.0;
        } else if (getAge()<12) {
            return 1.0;
        }else {
            return 0.75;
        }
    }


}
