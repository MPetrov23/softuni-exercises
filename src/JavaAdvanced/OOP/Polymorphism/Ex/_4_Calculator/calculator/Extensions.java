package JavaAdvanced.OOP.Polymorphism.Ex._4_Calculator.calculator;

public class Extensions {
    private Extensions() {

    }
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new InterpreterExtended(engine);
    }
}
