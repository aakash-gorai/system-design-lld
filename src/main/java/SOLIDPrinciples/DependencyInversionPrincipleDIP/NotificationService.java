package SOLIDPrinciples.DependencyInversionPrincipleDIP;

public class NotificationService {
    NotificationChannel notificationChannel;

    NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String message) {
        notificationChannel.send(message);
    }
}
