abstract class Notification{
    public abstract void send();
}
class EmailNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SmsNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class NotificationService{
    public void notifyUser(Notification notification){
        notification.send();
    }
}
public class EncapsulationPolymorphismDemo {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification n1 = new EmailNotification();
        Notification n2 = new SmsNotification();

        service.notifyUser(n1);
        service.notifyUser(n2);
    }
}
