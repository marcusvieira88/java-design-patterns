package tech.marcusvieira.creational.factory;

public class FactoryMain {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification sms = notificationFactory.create("SMS");
        sms.sendNotification();

        Notification email = notificationFactory.create("EMAIL");
        email.sendNotification();

        Notification letter = notificationFactory.create("LETTER");
        letter.sendNotification();
    }
}
