package JavaAdvanced.OOP.Encapsulation.Ex._5_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();
        String command = sc.nextLine();

        while (!command.equals("END")) {
            String[] commandParts = command.split(";");
            String action = commandParts[0];
            String teamName = commandParts[1];

            if (action.equals("Team")) {
                    createTeam(teams,teamName);
            } else if (action.equals("Add")) {
                    addPlayer(teams,teamName,commandParts);
            } else if (action.equals("Remove")) {
                    removePlayer(teams,teamName,commandParts[2]);
            } else if (action.equals("Rating")) {
                    getTeamRating(teams,teamName);
            }
            command = sc.nextLine();
        }

    }

    public static void createTeam(List<Team> teams, String teamName){
        Team team = new Team(teamName);
        teams.add(team);
    }

    public static void addPlayer(List<Team> teams,String teamName, String[] commandParts){
        boolean isTeam = false;

        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                isTeam = true;
                try {
                    Player player = new Player(commandParts[2], Integer.parseInt(commandParts[3]), Integer.parseInt(commandParts[4]),
                            Integer.parseInt(commandParts[5]), Integer.parseInt(commandParts[6]) ,Integer.parseInt(commandParts[7]));
                    team.addPlayer(player);
                } catch (IllegalArgumentException e) {
                    System.out.printf("%s%n",e.getMessage());
                }
            }
        }
        if (!isTeam) {
            System.out.printf("Team %s does not exist.%n", teamName);
        }

    }

    public static void removePlayer(List<Team> teams, String teamName, String player) {
        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                team.removePlayer(player);
            }
        }
    }

    public static void getTeamRating(List<Team> teams, String teamName) {
        boolean isTeamExist = false;
        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                isTeamExist = true;
                System.out.printf("%s - %.0f%n", team.getName(), team.getRating());
            }
        }
        if (!isTeamExist) {
            System.out.printf("Team %s does not exist.%n", teamName);
        }
    }

}
