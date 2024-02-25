package lt.techin.rolandas;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Akvile");
        User user2 = new User("Karolis");


        user1.sendMessage(user2, "Hello, how are you?");
        user2.sendMessage(user1, "Nice to meet you...");

        MessagesDatabase.showMessages(user1, user2);
    }
}
