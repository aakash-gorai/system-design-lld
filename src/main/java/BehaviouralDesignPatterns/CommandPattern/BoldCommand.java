package BehaviouralDesignPatterns.CommandPattern;

public class BoldCommand implements Command {
    private TextEditor textEditor;

    BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.boldText();
    }
}
