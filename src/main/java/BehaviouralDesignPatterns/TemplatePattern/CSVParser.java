package BehaviouralDesignPatterns.TemplatePattern;

public class CSVParser extends Parser {
    @Override
    protected void parseFile() {
        System.out.println("Parsing CSV file");
    }
}
