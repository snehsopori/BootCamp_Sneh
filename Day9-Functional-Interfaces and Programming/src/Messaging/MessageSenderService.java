package Messaging;

public class MessageSenderService {

    public static void sendMessage(String string, MessageSenderInterface messageSender) {
        messageSender.send(string);
    }

}
