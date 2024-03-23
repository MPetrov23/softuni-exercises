package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.units;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.models.units.AbstractUnit;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}

