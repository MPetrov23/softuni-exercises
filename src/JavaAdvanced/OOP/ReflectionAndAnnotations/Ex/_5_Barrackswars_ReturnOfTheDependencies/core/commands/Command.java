package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.core.commands;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.interfaces.Executable;
public abstract class Command implements Executable {
    private String[] data;
    protected Command(String[] data) {
        this.data = data;
    }
    protected String[] getData() {
        return data;
    }
}
