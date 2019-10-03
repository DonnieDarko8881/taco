package springtaco.taco.repository;

import org.springframework.data.repository.CrudRepository;
import springtaco.taco.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
