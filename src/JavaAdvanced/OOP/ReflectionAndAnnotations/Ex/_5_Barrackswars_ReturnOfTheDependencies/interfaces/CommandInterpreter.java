package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
