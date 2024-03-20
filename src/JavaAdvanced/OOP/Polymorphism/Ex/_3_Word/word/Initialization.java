package JavaAdvanced.OOP.Polymorphism.Ex._3_Word.word;

public class Initialization {
    public static CommandInterface createCommandInterface(StringBuilder text){
        CommandInterface commandInterface = new CommandImpl(text);
        commandInterface.init();
        return commandInterface;
    }
}
