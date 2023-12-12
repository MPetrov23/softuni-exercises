package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_Songs {
    private String typeList;
    private String name;
    private String time;

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int songsNum = Integer.parseInt(sc.nextLine());
        List<_4_Songs> songs = new ArrayList<>();

        for(int i=0; i<songsNum; i++){
            String[]input = sc.nextLine().split("_");

            String type=input[0];
            String name=input[1];
            String time=input[2];

            _4_Songs song = new _4_Songs();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = sc.nextLine();

        if(typeList.equals("all")){
            for(_4_Songs song :songs){
                System.out.println(song.getName());
            }
        }else{
            for(_4_Songs song : songs){
                if(song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
