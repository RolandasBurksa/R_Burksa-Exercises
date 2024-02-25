package lt.techin.rolandas;

import javax.xml.crypto.Data;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String message;
    private Date date;

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.date = new Date();

    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "From:" + sender + "\n" +
                "To:" + receiver + "\n" +
                "Message='" + message + "\n" +
                "Date:" + date + "\n" ;
    }
}
