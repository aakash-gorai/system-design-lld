package CreationalDesignPatterns.SingletonDesignPattern;

public class AppSettings {
    private static AppSettings instance;

    private String databaseUrl;
    private String apiKey;

    private AppSettings() {
        databaseUrl = "abc.com";
        apiKey = "1234";
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
