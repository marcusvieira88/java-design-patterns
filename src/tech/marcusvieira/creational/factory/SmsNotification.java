package tech.marcusvieira.creational.factory;

public class SmsNotification implements Notification{

    public void sendNotification() {
        System.out.println("SMS Notification sent!");
    }
}
