package JavaAdvanced.OOP.Polymorphism.Ex._3_Word.word;

public class PasteTransform implements TextTransform {
    private CutTransform cut;

    public PasteTransform(CutTransform cut) {
        this.cut = cut;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        text.replace(startIndex, endIndex, this.cut.getCut().toString());
    }
}
