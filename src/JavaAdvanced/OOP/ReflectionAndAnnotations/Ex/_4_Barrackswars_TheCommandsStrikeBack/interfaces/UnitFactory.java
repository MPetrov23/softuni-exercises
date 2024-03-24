package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType);
}