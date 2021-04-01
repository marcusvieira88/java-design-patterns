package tech.marcusvieira.creational.factory;

public class FactoryMain {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification sms = notificationFactory.createNotification("SMS");
        sms.sendNotification();

        Notification email = notificationFactory.createNotification("EMAIL");
        email.sendNotification();

        Notification letter = notificationFactory.createNotification("LETTER");
        letter.sendNotification();
    }
}
