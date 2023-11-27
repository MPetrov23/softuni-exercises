package ProgrammingFundamentals._5_Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_CarRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> time = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int middle=time.size()/2;
        double left=0;
        double right=0;

        for(int i=0;i<middle;i++){
            if(time.get(i)==0){
                left=left*0.8;
            }else{
                left+=time.get(i);
            }
        }

        for(int i= time.size()-1;i>middle;i--){
            if(time.get(i)==0){
                right=right*0.8;
            }else{
                right+=time.get(i);
            }
        }

        if(left<right){
            System.out.printf("The winner is left with total time: %.1f",left);
        }else{
            System.out.printf("The winner is right with total time: %.1f",right);

        }
    }
}
