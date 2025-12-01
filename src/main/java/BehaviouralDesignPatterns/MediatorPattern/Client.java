package BehaviouralDesignPatterns.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User aakash = new User("aakash", chatRoom);
        User riya = new User("riya", chatRoom);
        chatRoom.addUser(aakash);
        chatRoom.addUser(riya);
        aakash.sendMessage("hi riya");
    }
}
