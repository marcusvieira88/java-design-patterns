package tech.marcusvieira.creational.factory;

public class NotificationFactory {

    public Notification create(String notificationType) {
        Notification notification = null;
        switch (notificationType){
            case "SMS" -> notification = new SmsNotification();
            case "EMAIL" -> notification = new EmailNotification();
            case "LETTER" -> notification = new LetterNotification();
        }
        return notification;
    }
}
