package org.lld.model;

import org.lld.notifications.Notification;
import org.lld.notifications.NotificationFactory;

import java.util.Set;

public class User {
    String name;
    String email;
    String phoneNo;
    Set<String> subscribedChannels;

    public User(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void subscribe(String channel){
        subscribedChannels.add(channel);
    }

    public void unsubscribe(String channel){
        subscribedChannels.remove(channel);
    }

    public void sendNotifications(String message){
        for(String channel : subscribedChannels){
            Notification notification = NotificationFactory.createNotification(channel, name, message);

        }
    }

}
