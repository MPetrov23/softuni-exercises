package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.Unit;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.UnitFactory;

    public class Add extends Command {
        public Add(String[] data, Repository repository, UnitFactory unitFactory) {
            super(data, repository, unitFactory);
        }

        @Override
        public String execute() {
            String unitType = getData()[1];
            Unit unitToAdd = getUnitFactory().createUnit(unitType);
            getRepository().addUnit(unitToAdd);
            return unitType + " added!";
        }
    }