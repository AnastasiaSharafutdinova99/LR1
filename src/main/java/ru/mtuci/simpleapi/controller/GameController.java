package ru.mtuci.simpleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleapi.model.Game;
import ru.mtuci.simpleapi.service.GameService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = GameController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class GameController {
    public static final String REST_URL = "/api/v1/games";

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(value = "/{id}")
    public Game get(@PathVariable("id") long id) {
        log.info("get " + id);
        return gameService.get(id);
    }

    @GetMapping
    public List<Game> getAll() {
        log.info("getAll");
        return gameService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Game save(@RequestBody Game game) {
        log.info("save " + game);
        return gameService.save(game);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        log.info("delete " + id);
        gameService.delete(id);
    }
}
