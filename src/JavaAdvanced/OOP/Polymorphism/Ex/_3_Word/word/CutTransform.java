package JavaAdvanced.OOP.Polymorphism.Ex._3_Word.word;

public class CutTransform implements TextTransform {
    private StringBuilder cut;
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        cut = new StringBuilder();
        cut.append(text.substring(startIndex,endIndex));
        text.delete(startIndex,endIndex);
    }

    public StringBuilder getCut() {
        return cut;
    }
}
