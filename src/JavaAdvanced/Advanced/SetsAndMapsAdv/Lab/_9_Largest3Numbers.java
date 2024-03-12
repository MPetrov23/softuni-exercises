package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _9_Largest3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                    .collect(Collectors.toList());

            for (int i = 0; i < numbers.size() && i < 3; i++) {
                System.out.print(numbers.get(i)+" ");
            }
        }
}
