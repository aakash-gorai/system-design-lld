package BehaviourableDesignPatterns.MementoPattern;

import java.util.Stack;

//manages the memento class (snapshots of the Text Editor)
public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if(!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
