package ProgrammingFundamentals._2_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNumber =Integer.parseInt(sc.nextLine());
        int capacity =Integer.parseInt(sc.nextLine());

        int courses= (int) Math.ceil((double) peopleNumber/capacity);

        System.out.print(courses);
        }
    }

