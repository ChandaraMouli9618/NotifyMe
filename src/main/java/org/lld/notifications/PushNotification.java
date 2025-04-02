package org.lld.notifications;

public class PushNotification extends Notification{

    public PushNotification(String recipient, String message){
        super(recipient, message);
    }

    @Override
    public void send(){
        System.out.println("Push Notification Sent to : " + super.recipient + " , with message content as : " + super.message);
    }
}
