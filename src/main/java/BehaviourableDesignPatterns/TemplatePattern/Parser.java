package BehaviourableDesignPatterns.TemplatePattern;

abstract public class Parser {

    public void parse() {
        openFile();
        parseFile();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening the file");
    }

    protected void closeFile() {
        System.out.println("Closing the file");
    }

    protected abstract void parseFile();
}
