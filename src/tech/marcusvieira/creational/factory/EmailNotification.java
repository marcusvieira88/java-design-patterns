package tech.marcusvieira.creational.factory;

public class EmailNotification implements Notification{

    public void sendNotification() {
        System.out.println("Email Notification sent!");
    }
}
