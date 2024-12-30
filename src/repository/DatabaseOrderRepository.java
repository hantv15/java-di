package repository;

public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void save(String orderDetails) {
        System.out.println("Saving order to the database: " + orderDetails);
    }
}
