package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods;

import java.util.List;

public interface Commando {
    List<Mission> getMissions();
    void addMission(Mission mission);
}
