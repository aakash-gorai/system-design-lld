package BehaviouralDesignPatterns.MementoPattern;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();


        editor.write("Version 1");
        careTaker.save(editor);

        editor.write("Version 2");
        careTaker.save(editor);

        editor.write("Version 3");
        careTaker.save(editor);

        System.out.println(editor.getContent());  // Version 3

        careTaker.undo(editor);
        System.out.println(editor.getContent());  // Version 2

        careTaker.undo(editor);
        System.out.println(editor.getContent());  // Version 1
    }
}
