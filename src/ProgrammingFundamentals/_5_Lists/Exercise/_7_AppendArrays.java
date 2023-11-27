package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputArrays = scanner.nextLine();
        List<String> arrays = Arrays.stream(inputArrays.split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(arrays);

        System.out.println(arrays.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll(",","")
                .replaceAll("\\s+"," ")
        );
    }
}
