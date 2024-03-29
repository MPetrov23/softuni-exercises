package JavaAdvanced.OOP.Inheritance.Ex._6_Animals;

public class Kittens extends Cat{
    private static final String GENDER = "Female";
    public Kittens(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
