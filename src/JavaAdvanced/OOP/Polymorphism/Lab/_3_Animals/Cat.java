package JavaAdvanced.OOP.Polymorphism.Lab._3_Animals;

public class Cat extends Animal{
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf(){
        return String.format("%sMEEOW",super.explainSelf());
    }
}
