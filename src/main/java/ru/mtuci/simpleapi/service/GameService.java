package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.Game;

import java.util.List;

public interface GameService {

    Game get(Long id);

    List<Game> getAll();

    Game save(Game game);

    void delete(long id);
}
