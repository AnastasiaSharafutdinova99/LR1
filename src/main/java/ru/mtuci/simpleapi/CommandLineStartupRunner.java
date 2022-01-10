package ru.mtuci.simpleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.GameRepository;

@Component
public class CommandLineStartupRunner implements CommandLineRunner {

    private final GameRepository gameRepository;

    @Autowired
    public CommandLineStartupRunner(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public void run(String...args) throws Exception {
//        System.out.println(gameRepository.findById(1L).get());
    }
}