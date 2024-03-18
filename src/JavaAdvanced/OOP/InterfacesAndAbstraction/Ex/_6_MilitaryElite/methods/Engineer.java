package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
