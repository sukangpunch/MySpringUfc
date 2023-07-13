package ufcspring.ufc.service.GService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufcspring.ufc.data.dao.GDao.GameDAO;
import ufcspring.ufc.data.dto.GDto.GameDto;
import ufcspring.ufc.data.dto.GDto.GameResponseDto;
import ufcspring.ufc.data.games.Game;
import ufcspring.ufc.service.GService.GameService;

import java.time.LocalDateTime;

@Service
public class GameServiceImpl implements GameService {

    private final GameDAO gameDAO;

    @Autowired
    public GameServiceImpl(GameDAO gameDAO){
        this.gameDAO = gameDAO;
    }


    @Override
    public GameResponseDto getGame(Long gameId) {
        Game game = gameDAO.selectGame(gameId);

        GameResponseDto gameResponseDto = new GameResponseDto();
        gameResponseDto.setGameId(game.getGameId());
        gameResponseDto.setTitle(game.getTitle());
        gameResponseDto.setDescription(game.getDescription());
        gameResponseDto.setWinner(game.getWinner());
        gameResponseDto.setLoser(game.getLoser());

        return gameResponseDto;
    }

    @Override
    public GameResponseDto saveGame(GameDto gameDto) {
        Game game = new Game();
        game.setTitle(gameDto.getTitle());
        game.setDescription(gameDto.getDescription());
        game.setWinner(gameDto.getWinner());
        game.setLoser(gameDto.getLoser());
        game.setCreatedAt(LocalDateTime.now());
        game.setUpdatedAt(LocalDateTime.now());

        Game saveGame = gameDAO.insertGame(game);

        GameResponseDto gameResponseDto = new GameResponseDto();
        gameResponseDto.setGameId(saveGame.getGameId());
        gameResponseDto.setTitle(saveGame.getTitle());
        gameResponseDto.setDescription(saveGame.getDescription());
        gameResponseDto.setWinner(saveGame.getWinner());
        gameResponseDto.setLoser(saveGame.getLoser());

        return gameResponseDto;
    }

    @Override
    public GameResponseDto changeGameInfo(Long gameId, String title, String description, String winner, String loser) throws Exception {

        Game changeGame = gameDAO.updateGameInfo(gameId,title,description,winner,loser);

        GameResponseDto gameResponseDto = new GameResponseDto();
        gameResponseDto.setGameId(changeGame.getGameId());
        gameResponseDto.setTitle(changeGame.getTitle());
        gameResponseDto.setDescription(changeGame.getDescription());
        gameResponseDto.setWinner(changeGame.getWinner());
        gameResponseDto.setLoser(changeGame.getLoser());

        return gameResponseDto;
    }

    @Override
    public void deleteGame(Long gameId) throws Exception {
        gameDAO.deleteGame(gameId);
    }
}
