package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Commando;
import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;
    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions=new ArrayList<>();
    }

    @Override
    public List<Mission> getMissions() {
        return Collections.unmodifiableList(missions);
    }

    @Override
    public void addMission(Mission mission) {
        missions.add(mission);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s %s Id: %d Salary: %.2f", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary())).append(System.lineSeparator());
        stringBuilder.append("Corps: ").append(corps).append(System.lineSeparator());
        stringBuilder.append("Missions:").append(System.lineSeparator());
        for (Mission mission : missions) {
            stringBuilder.append(" ").append(mission.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }
}
