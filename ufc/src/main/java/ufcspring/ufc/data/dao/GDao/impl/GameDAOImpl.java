package ufcspring.ufc.data.dao.GDao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufcspring.ufc.data.dao.GDao.GameDAO;
import ufcspring.ufc.data.games.Game;
import ufcspring.ufc.data.games.GameRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class GameDAOImpl implements GameDAO {

    private final GameRepository gameRepository;

    @Autowired
    public GameDAOImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }


    @Override
    public Game insertGame(Game game) {
        Game saveGame = gameRepository.save(game);

        return saveGame;
    }

    @Override
    public Game selectGame(Long gameId) {
        Game seletedGame = gameRepository.getById(gameId);

        return seletedGame;
    }

    @Override
    public Game updateGameInfo(Long gameId, String title, String description, String winner, String loser) throws Exception {
        Optional<Game> selectedGame = gameRepository.findById(gameId);

        Game updatedGame;
        if(selectedGame.isPresent()){
            Game game = selectedGame.get();

            game.setTitle(title);
            game.setDescription(description);
            game.setWinner(winner);
            game.setLoser(loser);

            game.setUpdatedAt(LocalDateTime.now());

            updatedGame = gameRepository.save(game);

        }else{
            throw new Exception();
        }

        return updatedGame;
    }

    @Override
    public void deleteGame(Long gameId) throws Exception {
        Optional<Game> selectedGame = gameRepository.findById(gameId);

        if(selectedGame.isPresent()){
            Game game = selectedGame.get();

            gameRepository.delete(game);
        }else {
            throw new Exception();
        }
    }
}
