package JavaAdvanced.OOP.Polymorphism.Ex._4_Calculator.calculator;

import java.util.ArrayList;
import java.util.List;

public class DivideOperation implements Operation{
    private List<Integer> operands;
    private int result;

    public DivideOperation() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        operands.add(operand);
        if(isCompleted()){
            result=operands.get(0) / operands.get(1);
        }
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public boolean isCompleted() {
        return operands.size()==2;
    }
}
