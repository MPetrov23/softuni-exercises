package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._7_CollectionHierarchy;

public class AddRemovableCollection extends Collection implements AddRemovable,Addable{


    @Override
    public String remove() {
        return super.removeLast();
    }

    @Override
    public int add(String item) {
        super.addFirst(item);
        return 0;
    }
}
