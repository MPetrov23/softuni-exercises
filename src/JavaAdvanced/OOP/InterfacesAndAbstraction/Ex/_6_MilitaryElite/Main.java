package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Soldier;
import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Soldier> soldiers = new ArrayList<>();

        String command = sc.nextLine();
        while (!"End".equals(command)) {

            assignSoldier(soldiers,command);

            command = sc.nextLine();
        }

        soldiers.forEach(System.out::println);
    }

    private static void assignSoldier(List<Soldier> soldiers,String command){
        String[] commandParts = command.split("\\s+");
        String type = commandParts[0];

        switch (type) {
            case "Private":
                PrivateImpl priv = new PrivateImpl(Integer.parseInt(commandParts[1]), commandParts[2], commandParts[3], Double.parseDouble(commandParts[4]));
                soldiers.add(priv);
                break;
            case "LieutenantGeneral":
                LieutenantGeneralImpl lieutenantGeneralImpl = new LieutenantGeneralImpl(Integer.parseInt(commandParts[1]), commandParts[2], commandParts[3], Double.parseDouble(commandParts[4]));
                addPrivate(soldiers, lieutenantGeneralImpl, commandParts);
                soldiers.add(lieutenantGeneralImpl);
                break;
            case "Engineer":
                    EngineerImpl engineer = new EngineerImpl(Integer.parseInt(commandParts[1]), commandParts[2], commandParts[3], Double.parseDouble(commandParts[4]), commandParts[5]);
                    addRepair(engineer, commandParts);
                    soldiers.add(engineer);
                break;
            case "Commando":
                    CommandoImpl commando = new CommandoImpl(Integer.parseInt(commandParts[1]), commandParts[2], commandParts[3], Double.parseDouble(commandParts[4]), commandParts[5]);
                    addMission(commando, commandParts);
                    soldiers.add(commando);
                    break;
            case "Spy" :
                SpyImpl spy = new SpyImpl(Integer.parseInt(commandParts[1]), commandParts[2], commandParts[3], commandParts[4]);
                soldiers.add(spy);
                break;
        }
    }

    private static void addMission(CommandoImpl commando, String[] commandParts) {
        for (int i = 6; i < commandParts.length; i += 2) {
            String CodeName = commandParts[i];
            String State = commandParts[i + 1];

                MissionImpl mission = new MissionImpl(CodeName, State);
                commando.addMission(mission);
        }
    }

    private static void addRepair(EngineerImpl engineer, String[] commandParts) {
        for (int i = 6; i < commandParts.length; i += 2) {
            String partName = commandParts[i];
            int workHours = Integer.parseInt(commandParts[i + 1]);
            RepairImpl repair = new RepairImpl(partName, workHours);
            engineer.addRepair(repair);
        }
    }

    private static void addPrivate(List<Soldier> soldiersList, LieutenantGeneralImpl lieutenantGeneral, String[] commandParts) {
        for (int i = 5; i < commandParts.length; i++) {
            for (Soldier soldier : soldiersList) {
                if (soldier.getId() == Integer.parseInt(commandParts[i])) {
                    lieutenantGeneral.addSoldier(soldier);
                }
            }
        }
    }
}
