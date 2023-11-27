package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _8_AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> text = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command= sc.nextLine();

        while(!command.equals("3:1")){
            if(command.contains("merge")){
                int start = Integer.parseInt(command.split(" ")[1]);
                int end = Integer.parseInt(command.split(" ")[2]);

                if(start<0){
                start=0;
            }
            if(end>text.size()-1){
                end=text.size()-1;
            }
                if (start >= 0 && start <= text.size() - 1 && end >= 0 && end <= text.size() - 1) {
                    String mergeRes = "";
                    for( int i=start;i<=end;i++){
                        String curr = text.get(i);
                        mergeRes += curr;
                    }
                    for( int i=start;i<=end;i++){
                        text.remove(start);
                    }
                    text.add(start,mergeRes);
                }
            }else if(command.contains("divide")){
                int index=Integer.parseInt(command.split(" ")[1]);
                int parts=Integer.parseInt(command.split(" ")[2]);

                if(index>=0 && index<=text.size()-1){
                    String textToDivide = text.get(index);
                    text.remove(index);

                    int partSize=textToDivide.length() /parts;
                    int startIndex=0;

                    for(int i=1; i<parts; i++){
                        String textForPart = textToDivide.substring(startIndex,startIndex+partSize);
                        text.add(index,textForPart);
                        index++;
                        startIndex+=partSize;
                    }
                    String textLastPart = textToDivide.substring(startIndex,textToDivide.length());
                    text.add(index,textLastPart);
                }
            }
            command= sc.nextLine();
        }
        System.out.println(String.join(" ", text));
    }
}
