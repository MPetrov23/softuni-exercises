package JavaAdvanced.OOP.Polymorphism.Lab._4_WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    protected Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public abstract boolean canEatFood(Food food);


    public void eat(Food food) {
        if (canEatFood(food)) {
            foodEaten += food.getQuantity();
        } else {
            System.out.printf("%ss are not eating that type of food!%n", getClass().getSimpleName());
        }
    }
}