package nl.rob.backend.controller;

import nl.rob.backend.model.Game;
import nl.rob.backend.service.interfaces.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private IGameService iGameService;

    @GetMapping("all")
    public ResponseEntity<Object> getGames() {
        Iterable<Game> games = iGameService.getAll();
        return ResponseEntity.ok(games);
    }



}
