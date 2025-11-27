package BehaviourableDesignPatterns.CommandPattern;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Command boldCommand = new BoldCommand(textEditor);
        Command italicCommand = new ItalicCommand(textEditor);

        Button button = new Button();
        button.setCommand(boldCommand);
        button.click();

        button.setCommand(italicCommand);
        button.click();
    }
}
