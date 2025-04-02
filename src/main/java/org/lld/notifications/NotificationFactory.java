package org.lld.notifications;

public class NotificationFactory {
    public static Notification createNotification(String type, String recipient, String message){
        return switch (type) {
            case "EMAIL" -> new EmailNotification(recipient, message);
            case "SMS" -> new SMSNotification(recipient, message);
            case "PUSH" -> new PushNotification(recipient, message);
            default -> throw new IllegalArgumentException("Invalid notification type : " + type);
        };
    }
}
