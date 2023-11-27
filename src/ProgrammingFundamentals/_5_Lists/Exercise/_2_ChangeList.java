package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input= sc.nextLine();

        while(!input.equals("end")){
            if(input.contains("Delete")){
                String[] delete=input.split(" ");
                int deleteNumber= Integer.parseInt(delete[1]);
                for(int i=0;i<nums.size();i++){
                    if(nums.get(i)==deleteNumber){
                        nums.remove(i);
                    }
                }
            } else if (input.contains("Insert")){
                String[] insert=input.split(" ");
                int number = Integer.parseInt(insert[1]);
                int index = Integer.parseInt(insert[2]);

                nums.add(index,number);
            }

            input=sc.nextLine();
        }

        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
