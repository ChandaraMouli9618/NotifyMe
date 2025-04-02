package org.lld;

import org.lld.model.User;
import org.lld.notifications.NotificationManager;

public class NotificationSystem {
    public static void main(String[] args) {
        User user1 = new User("Alice", "alice@123.com", "9878767896");
        user1.subscribe("SMS");
        user1.subscribe("EMAIL");
        user1.sendNotifications("Price Dropped, Hurry Up");
        User user2 = new User("Bob", "bob.r@123.com", "84559067896");
        user2.subscribe("PUSH");
        User user3 = new User("Martin", "martinlk@123.com", "75943767896");
        user3.subscribe("EMAIL");
        user2.sendNotifications("Price Dropped, Hurry Up");
        NotificationManager.getInstance().processNotifications();

        user3.sendNotifications("Price Dropped, Hurry Up");
        User user4 = new User("Tony", "tony.stark@123.com", "28494967896");
        user4.subscribe("SMS");
        user4.subscribe("EMAIL");
        user4.subscribe("PUSH");
        User user5 = new User("Rick", "rickpson@123.com", "83675767896");
        user5.subscribe("PUSH");
        user5.subscribe("SMS");
        user5.sendNotifications("Price Dropped, Hurry Up");
        user4.sendNotifications("Price Dropped, Hurry Up");
        NotificationManager.getInstance().processNotifications();
    }
}