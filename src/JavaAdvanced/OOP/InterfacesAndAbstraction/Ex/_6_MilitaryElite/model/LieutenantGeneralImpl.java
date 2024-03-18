package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.LieutenantGeneral;
import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Soldier> underCommand;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.underCommand = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier){
        underCommand.add(soldier);
    }

    @Override
    public List<Soldier> getSoldiers() {
        return Collections.unmodifiableList(underCommand);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary())).append(System.lineSeparator());
        stringBuilder.append("Privates:").append(System.lineSeparator());

        for (Soldier soldier : underCommand) {
            stringBuilder.append(" ").append(soldier.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
