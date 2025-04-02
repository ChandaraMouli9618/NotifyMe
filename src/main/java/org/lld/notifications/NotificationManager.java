package org.lld.notifications;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private static NotificationManager instance;
    private final List<Notification> notifications = new ArrayList<>();

    private NotificationManager(){}

    public static NotificationManager getInstance(){
        if(instance == null){
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public void processNotifications(){
        for(Notification notification : notifications){
            notification.send();
        }
        notifications.clear();
    }
}
