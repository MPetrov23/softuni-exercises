package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.enums.Corps;
import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    Corps corps;


    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        setCorps(corps);
    }

    public void setCorps(String corps) {
        if(!"Airforces".equals(corps) && !"Marines".equals(corps)){
            throw new IllegalArgumentException("Invalid corp!");
        }
        this.corps=Corps.valueOf(corps);
    }

    @Override
    public Corps getCorps() {
        return corps;
    }
}
