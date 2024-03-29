package JavaAdvanced.Advanced.IteratorsAndComparators._6_StrategyPattern;


import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int result = Integer.compare(p1.name.length(), p2.name.length());
        if (result == 0) {
            char char1 = p1.name.toLowerCase().charAt(0);
            char char2 = p2.name.toLowerCase().charAt(0);
            int compare = Character.compare(char1, char2);
            if (compare < 0) {
                result = -1;
            } else if (compare > 0) {
                result = 1;
            }
        }
        return result;
    }
}