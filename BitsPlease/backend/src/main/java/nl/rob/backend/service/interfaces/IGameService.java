package nl.rob.backend.service.interfaces;

import nl.rob.backend.model.Game;

public interface IGameService {

    Iterable<Game> getAll();

}
