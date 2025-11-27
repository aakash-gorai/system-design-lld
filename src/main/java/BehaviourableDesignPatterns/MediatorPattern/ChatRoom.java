package BehaviourableDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> userList;

    ChatRoom() {
        userList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for(User user: userList) {
            if(user != sender) {
                user.receiveMessage(sender, msg);
            }
        }
    }
}
