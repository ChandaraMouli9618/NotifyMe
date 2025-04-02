package org.lld.notifications;

public abstract class Notification {
    String recipient;
    String message;

    public Notification(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send();
}
