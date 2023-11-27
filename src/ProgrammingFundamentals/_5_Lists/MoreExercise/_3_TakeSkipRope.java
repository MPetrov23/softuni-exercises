package ProgrammingFundamentals._5_Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_TakeSkipRope {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List <String> input = stringToListOfString(sc.nextLine());
        List <Integer> numbers = new ArrayList<>();

      for(int i=0; i< input.size(); i++){
          if(isInteger(input.get(i))){
                numbers.add(Integer.parseInt(input.get(i)));
                input.remove(i);
                i--;
          }
      }


        String result="";
        int i=0;
        while(input.size()>0){
            if(i> numbers.size()-1){
                break;
            }
        if(i==0 || i%2==0){
              for(int j=0; j<numbers.get(i);j++){
                  if(input.size()==0){
                      break;
                  }
                      result += input.get(0);
                      input.remove(0);
              }
          }
          else{
              for(int j=0; j<numbers.get(i);j++){
                  if(input.size()==0){
                      break;
                  }
                      input.remove(0);
              }
          }
            i++;
      }

      System.out.println(result);
    }

    private static List<String> stringToListOfString(String inputString) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            stringList.add(String.valueOf(inputString.charAt(i)));
        }

        return stringList;
    }
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
