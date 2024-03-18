package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.model;

import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.methods.Mission;
import JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._6_MilitaryElite.enums.State;

public class MissionImpl implements Mission {
    private String codeName;
    private State state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public State getState() {
        return this.state;
    }

    private void setState(String state){
        if(!"inProgress".equals(state) && !"finished".equals(state)){
            throw new IllegalArgumentException("Invalid mission state!");
        }
        this.state=State.valueOf(state);
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state.toString());
    }
}
