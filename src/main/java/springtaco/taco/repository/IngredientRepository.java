package springtaco.taco.repository;

import org.springframework.data.repository.CrudRepository;
import springtaco.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
