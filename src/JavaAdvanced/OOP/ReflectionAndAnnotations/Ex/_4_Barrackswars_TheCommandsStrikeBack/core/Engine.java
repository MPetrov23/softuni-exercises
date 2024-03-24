package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.core;


import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Repository;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.Unit;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.interfaces.UnitFactory;
import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._4_Barrackswars_TheCommandsStrikeBack.interfaces.Executable;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {
	private static final String COMMAND = "JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.core.commands.";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ExecutionControl.NotImplementedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException {
		Executable command = null;
		commandName = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1);

		try {
			Class<?> clas = Class.forName(COMMAND + commandName);
			Constructor<?> constructor = clas.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
			command = (Executable) constructor.newInstance(data, repository, unitFactory);
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
				 InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		return command.execute();
	}
}
