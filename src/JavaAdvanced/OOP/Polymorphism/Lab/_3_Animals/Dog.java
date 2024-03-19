package JavaAdvanced.OOP.Polymorphism.Lab._3_Animals;

public class Dog extends Animal{
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf(){
        return String.format("%sDJAAF",super.explainSelf());
    }
}
