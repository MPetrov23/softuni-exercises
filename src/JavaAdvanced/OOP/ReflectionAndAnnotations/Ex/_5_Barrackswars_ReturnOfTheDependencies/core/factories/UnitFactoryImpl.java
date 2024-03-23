package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.core.factories;


import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Unit;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		try{
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
			return constructor.newInstance();
		}
		catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
