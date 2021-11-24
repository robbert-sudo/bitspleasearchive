package nl.rob.backend.service;

import nl.rob.backend.model.Game;
import nl.rob.backend.repository.GameRepository;
import nl.rob.backend.service.interfaces.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService implements IGameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Iterable<Game> getAll() {
        Iterable<Game> result = gameRepository.findAll();
        return result;
    }
}

