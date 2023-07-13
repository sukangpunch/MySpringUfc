package ufcspring.ufc.data.dao.GDao;

import ufcspring.ufc.data.games.Game;

public interface GameDAO {

    Game insertGame(Game game);

    Game selectGame(Long gameId);

    Game updateGameInfo(Long gameId,String title, String description, String winner, String loser) throws Exception;

    void deleteGame(Long gameId) throws Exception;
}
