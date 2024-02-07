package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _1_CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstParam = inputArray(sc);
        int firstRows= firstParam[0];
        int firstCols= firstParam[1];
        int[][] firstArray = new int[firstRows][firstCols];
        for(int row=0; row<firstRows; row++){
            firstArray[row] = inputArray(sc);
        }

        int[] secondParam = inputArray(sc);
        int secondRows = secondParam[0];
        int secondCols = secondParam[1];

        int[][] secondArray = new int[secondRows][secondCols];
        for(int row=0; row<secondRows; row++){
            secondArray[row] = inputArray(sc);
        }

        if(!compare(firstParam,secondParam)){
            System.out.println("not equal");
            return;
        }

        for(int row=0; row<firstRows; row++){
            if(!compare(firstArray[row],secondArray[row])){
                System.out.println("not equal");
                return;
            }
        }

        System.out.println("equal");
    }


    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static boolean compare(int[] first, int[] second){
       boolean areEqual = true;

       for(int i=0; i< first.length; i++){
           if(first[i] != second[i]){
               areEqual=false;
                break;
           }
       }
       return areEqual;
    }
}
