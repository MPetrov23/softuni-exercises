package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Inject;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Unit;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.UnitFactory;

public class Add extends Command {
       private String[] data;
       @Inject
       private Repository repository;
       @Inject
       private UnitFactory unitFactory;

    public Add(String[] data) {
        super(data);

    }

    @Override
        public String execute() {
            String unitType = getData()[1];
            Unit unitToAdd = this.unitFactory.createUnit(unitType);
            this.repository.addUnit(unitToAdd);
            return unitType + " added!";
        }
    }