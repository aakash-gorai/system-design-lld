package BehaviourableDesignPatterns.MementoPattern;
/*
A text editor where user can do undo changes, such as text edition or formatting.
*/

public class TextEditor {
    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    // Creates a snapshot
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // Restores from snapshot
    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
