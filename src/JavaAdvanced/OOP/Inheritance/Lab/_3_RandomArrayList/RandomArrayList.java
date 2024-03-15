package JavaAdvanced.OOP.Inheritance.Lab._3_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement(){
        int elementIndex = new Random().nextInt(super.size());
        return super.remove(elementIndex);
    }
}
