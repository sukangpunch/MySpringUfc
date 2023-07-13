package ufcspring.ufc.service.GService;

import ufcspring.ufc.data.dto.GDto.GameDto;
import ufcspring.ufc.data.dto.GDto.GameResponseDto;

public interface GameService {
    GameResponseDto getGame(Long gameId);

    GameResponseDto saveGame(GameDto gameDto);

    GameResponseDto changeGameInfo(Long gameId,String title,String description, String winner, String loser ) throws Exception;

    void deleteGame(Long gameId) throws Exception;
}

