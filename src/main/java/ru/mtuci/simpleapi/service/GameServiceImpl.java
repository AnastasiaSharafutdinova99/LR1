package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.GameRepository;
import ru.mtuci.simpleapi.model.Game;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game get(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    @Override
    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public void delete(long id) {
        gameRepository.delete(id);
    }
}
