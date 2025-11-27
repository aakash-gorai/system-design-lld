package BehaviourableDesignPatterns.TemplatePattern;

public class JsonParser extends Parser {

    @Override
    protected void parseFile() {
        System.out.println("Parsing json file");
    }
}
