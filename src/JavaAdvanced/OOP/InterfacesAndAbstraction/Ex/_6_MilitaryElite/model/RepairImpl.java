package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private int workedHours;

    public RepairImpl(String partName, int workedHours) {
        this.partName = partName;
        this.workedHours = workedHours;
    }


    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHoursWorked() {
        return this.workedHours;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.partName, this.workedHours);
    }
}
