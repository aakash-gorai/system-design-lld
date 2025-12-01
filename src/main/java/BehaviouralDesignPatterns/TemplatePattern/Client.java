package BehaviouralDesignPatterns.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        Parser jsonParser = new JsonParser();
        Parser csvParser = new CSVParser();

        jsonParser.parse();
        csvParser.parse();
    }
}
