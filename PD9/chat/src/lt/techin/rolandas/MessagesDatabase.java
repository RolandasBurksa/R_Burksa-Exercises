package lt.techin.rolandas;

import java.util.ArrayList;
import java.util.List;

public class MessagesDatabase {
    private static List<Message> messages = new ArrayList<>();
    public static void addNewMessage(User sender, User receiver, String message) {
        messages.add(new Message(sender, receiver, message));

    }
    public static void showMessages(User user1, User user2){
        for(Message message : messages){
            if(message.getSender() == user1 && message.getReceiver() == user2
                || message.getSender() == user2 && message.getReceiver() == user1){
                System.out.println(message.getSender() + " : " + message.getMessage() + "(" + message.getDate() + ")");
            }
        }

    }

}
