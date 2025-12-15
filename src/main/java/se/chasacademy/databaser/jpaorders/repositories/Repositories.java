package se.chasacademy.databaser.jpaorders.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpaorders.models.Customer;
import se.chasacademy.databaser.jpaorders.models.Order;
import se.chasacademy.databaser.jpaorders.models.OrderLine;
import se.chasacademy.databaser.jpaorders.models.Product;

public interface Repositories {

    public interface CustomerRepository extends JpaRepository<Customer, Long> { }
    public interface ProductRepository extends JpaRepository<Product, Long> { }
    public interface OrderRepository extends JpaRepository<Order, Long> { }
    public interface OrderLineRepository extends JpaRepository<OrderLine, Long> { }

}
