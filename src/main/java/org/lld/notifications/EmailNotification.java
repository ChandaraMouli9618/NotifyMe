package org.lld.notifications;

public class EmailNotification extends Notification{

    public EmailNotification(String recipient, String message){
        super(recipient, message);
    }

    @Override
    public void send(){
        System.out.println("Email Notification Sent to : " + super.recipient + " , with message content as : " + super.message);
    }
}
