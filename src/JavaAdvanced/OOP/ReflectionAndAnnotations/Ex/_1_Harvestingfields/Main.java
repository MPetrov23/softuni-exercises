package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._1_Harvestingfields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, List<Field>> fields = sortFields();
		StringBuilder result = new StringBuilder();

		String command = sc.nextLine();
		while(!"HARVEST".equals(command)){
		List<Field> currentFields = fields.get(command);
		for(Field fiel : currentFields){
			result.append(String.format("%s %s %s\n",
					Modifier.toString(fiel.getModifiers()),
					fiel.getType().getSimpleName(),
					fiel.getName()));
		}
			command = sc.nextLine();
		}
		System.out.println(result);
	}

	private static Map<String, List<Field>> sortFields(){
		Map<String, List<Field>> fields= new HashMap<>();

		List<Field> all = Arrays.asList(RichSoilLand.class.getDeclaredFields());
		fields.put("all",all);

		for(Field field : all){
			if(Modifier.isPublic(field.getModifiers())){
				if(!fields.containsKey("public")){
					fields.put("public", new ArrayList<>());
				}
				fields.get("public").add(field);
			}
			else if(Modifier.isProtected(field.getModifiers())){
				if(!fields.containsKey("protected")){
					fields.put("protected", new ArrayList<>());				}
				fields.get("protected").add(field);
			}
			else if(Modifier.isPrivate(field.getModifiers())){
				if(!fields.containsKey("private")){
					fields.put("private", new ArrayList<>());
				}
				fields.get("private").add(field);
			}
		}
		return fields;
	}
}
