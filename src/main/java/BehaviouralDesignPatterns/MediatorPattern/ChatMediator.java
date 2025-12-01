package BehaviouralDesignPatterns.MediatorPattern;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String msg, User user);
}
