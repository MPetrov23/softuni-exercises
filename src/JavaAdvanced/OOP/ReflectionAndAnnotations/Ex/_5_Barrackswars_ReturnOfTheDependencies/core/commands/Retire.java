package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Inject;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Repository;

public class Retire extends Command {
    @Inject
    private Repository repository;
    public Retire(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unit = getData()[1];
        this.repository.removeUnit(unit);
        return unit + " retired!";
    }
}
