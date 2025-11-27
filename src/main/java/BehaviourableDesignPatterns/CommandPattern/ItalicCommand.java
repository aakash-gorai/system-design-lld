package BehaviourableDesignPatterns.CommandPattern;

public class ItalicCommand implements Command {
    private TextEditor textEditor;

    ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.italicText();
    }
}
