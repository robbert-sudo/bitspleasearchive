package nl.rob.backend.repository;

import nl.rob.backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface LoggedInRepository extends CrudRepository<User, String> {

}
