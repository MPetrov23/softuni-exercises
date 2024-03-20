package JavaAdvanced.OOP.Polymorphism.Ex._4_Calculator.calculator;

public class MROperation implements Operation{
    private MSOperation storage;

    public MROperation(MSOperation storage) {
        this.storage = storage;
    }

    @Override
    public void addOperand(int operand) {
    }

    @Override
    public int getResult() {
        return storage.getResult();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
