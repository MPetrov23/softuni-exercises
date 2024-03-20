package JavaAdvanced.OOP.Polymorphism.Ex._4_Calculator.calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MSOperation implements Operation{
    private Deque<Integer> memoryStack;

    public MSOperation() {
        this.memoryStack=new ArrayDeque<>();
    }

    @Override
    public void addOperand(int operand) {
        memoryStack.push(operand);
    }

    @Override
    public int getResult() {
        return memoryStack.pop();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
