package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class Report extends Command{
    protected Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return getRepository().getStatistics();
    }
}
