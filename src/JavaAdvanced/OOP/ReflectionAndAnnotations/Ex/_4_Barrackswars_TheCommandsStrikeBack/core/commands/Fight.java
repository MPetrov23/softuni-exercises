package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class Fight extends Command{

    protected Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
