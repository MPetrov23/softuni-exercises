package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._5_Barrackswars_ReturnOfTheDependencies.units;

import JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._3_Barrackswars_ANewFactory.models.units.AbstractUnit;

public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH,HORSEMAN_DAMAGE);
    }
}
