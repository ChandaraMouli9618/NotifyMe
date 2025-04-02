package org.lld.notifications;

public class SMSNotification extends Notification{

    public SMSNotification(String recipient, String message){
        super(recipient, message);
    }

    @Override
    public void send(){
        System.out.println("SMS Notification Sent to : " + super.recipient + " , with message content as : " + super.message);
    }
}
