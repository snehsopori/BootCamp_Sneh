package Messaging;

@FunctionalInterface
interface MessageSenderInterface {
    void send(String msg);
}
