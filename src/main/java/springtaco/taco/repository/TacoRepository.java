package springtaco.taco.repository;

import org.springframework.data.repository.CrudRepository;
import springtaco.taco.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {
}
