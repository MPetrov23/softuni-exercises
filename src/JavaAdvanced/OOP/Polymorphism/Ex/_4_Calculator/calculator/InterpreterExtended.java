package JavaAdvanced.OOP.Polymorphism.Ex._4_Calculator.calculator;

public class InterpreterExtended extends InputInterpreter{
    private MSOperation storage;

    public InterpreterExtended(CalculationEngine engine) {
        super(engine);
        this.storage = new MSOperation();
    }

    @Override
    public Operation getOperation(String operation) {

            if (operation.equals("/")) {
                return new DivideOperation();
            }
            else if (operation.equals("ms")) {
                return this.storage;
            }
            else if (operation.equals("mr")) {
                return new MROperation(storage);
            }
            else {
                return super.getOperation(operation);
            }
    }
}
