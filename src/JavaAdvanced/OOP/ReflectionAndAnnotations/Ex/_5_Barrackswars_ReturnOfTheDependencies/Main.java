package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies;


import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.core.Engine;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.core.factories.UnitFactoryImpl;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.data.UnitRepository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
