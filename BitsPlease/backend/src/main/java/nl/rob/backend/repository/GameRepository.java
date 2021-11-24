package nl.rob.backend.repository;

import nl.rob.backend.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

}
