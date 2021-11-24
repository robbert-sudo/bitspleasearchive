package nl.rob.backend.service;

import nl.rob.backend.model.User;
import nl.rob.backend.repository.LoggedInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoggedInService {

    private static LoggedInRepository loggedInRepository;


    @Autowired
    public LoggedInService(LoggedInRepository loggedInRepository){
        this.loggedInRepository = loggedInRepository;
    }

    public static Optional<User> getUser(String username) { return loggedInRepository.findById(username);}

}
