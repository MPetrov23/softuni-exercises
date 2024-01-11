package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet pet){
        if (data.size() < capacity) {
            data.add(pet);
            System.out.println("Pet added to the salon: " + pet);
        } else {
            System.out.println("Grooming salon is at full capacity. Cannot add more pets.");
        }
    }
    public boolean remove(String name){
        for(Pet pet : data){
            if(pet.getName().equals(name)){
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        for(Pet pet : data){
            if(pet.getName().equals(name) && pet.getOwner().equals(owner)){
                data.remove(pet);
                return pet;
            }
        }
        return null;
    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics() {
        StringBuilder statistics = new StringBuilder("The grooming salon has the following clients:\n");
        for (Pet pet : data) {
            statistics.append(pet.getName()).append(" ").append(pet.getOwner()).append("\n");
        }
        return statistics.toString();
    }


}
