package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int commands=Integer.parseInt(sc.nextLine());
        String command="";
        List<String> guests= new ArrayList<>();

        for(int i=0;i<commands;i++){
            command=sc.nextLine();
            String[] currComand=command.split(" ");
            String name=currComand[0];

            if(command.contains("not")){
                if(guests.contains(name)){
                    guests.remove(name);
                }else{
                    System.out.printf("%s is not in the list!\n",name);
                }
            }else{
                if(guests.contains(name)){
                    System.out.printf("%s is already in the list!\n",name);
                }else{
                    guests.add(name);
                }
            }
        }

        for(String name:guests){
            System.out.println(name);
        }
    }
}
