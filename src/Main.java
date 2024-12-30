import notification.EmailNotificationService;
import notification.SMSNotificationService;
import repository.DatabaseOrderRepository;
import service.OrderService;
import service.OrderServiceImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseOrderRepository orderRepository = new DatabaseOrderRepository();
        // EmailNotificationService emailNotificationService = new EmailNotificationService();
        SMSNotificationService smsNotificationService = new SMSNotificationService();

        OrderService orderService = new OrderServiceImp(orderRepository, smsNotificationService);

        orderService.createOrder("Order #1212");
    }
}