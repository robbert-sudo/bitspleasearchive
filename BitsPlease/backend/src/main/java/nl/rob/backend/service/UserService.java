package nl.rob.backend.service;

import nl.rob.backend.model.User;
import nl.rob.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(String username) {
        Optional<User> user = userRepository.findById(username);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException();
        }
    }
}
