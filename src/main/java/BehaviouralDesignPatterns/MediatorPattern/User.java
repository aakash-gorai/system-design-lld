package BehaviouralDesignPatterns.MediatorPattern;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(User user, String msg) {
        System.out.println("Received " + msg + " from " + user.getName());
    }

    public void sendMessage(String msg) {
        System.out.println("Sending message " + msg);
        chatMediator.sendMessage(msg, this);
    }
}
