package CreationalDesignPatterns.SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettingsCopy = AppSettings.getInstance();

        System.out.println(appSettings.getDatabaseUrl());
        System.out.println(appSettings.getApiKey());

        System.out.println(appSettings == appSettingsCopy);

    }
}
