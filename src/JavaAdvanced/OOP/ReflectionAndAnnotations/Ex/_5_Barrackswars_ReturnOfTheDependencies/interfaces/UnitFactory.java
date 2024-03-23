package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}