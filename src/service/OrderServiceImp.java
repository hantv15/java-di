package service;

import notification.NotificationService;
import repository.OrderRepository;

public class OrderServiceImp implements OrderService {
    private final OrderRepository orderRepository;
    private final NotificationService notificationService;

    // inject cac phu thuoc qua constructor
    public OrderServiceImp(OrderRepository orderRepository, NotificationService notificationService) {
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }

    @Override
    public void createOrder(String orderDetails) {
        orderRepository.save(orderDetails);
        notificationService.sendNotification("Order created: " + orderDetails);
    }
}
