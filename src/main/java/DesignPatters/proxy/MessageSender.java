package DesignPatters.proxy;

public interface MessageSender {
    void sendMessage(String channelName, String username, String message);
}
