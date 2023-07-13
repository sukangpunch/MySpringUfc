package ufcspring.ufc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufcspring.ufc.data.dto.GDto.ChangeGameInfoDto;
import ufcspring.ufc.data.dto.GDto.GameDto;
import ufcspring.ufc.data.dto.GDto.GameResponseDto;
import ufcspring.ufc.service.GService.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping()
    public ResponseEntity<GameResponseDto> getGame(Long gameId){
        GameResponseDto gameResponseDto = gameService.getGame(gameId);

        return ResponseEntity.status(HttpStatus.OK).body(gameResponseDto);
    }

    @PostMapping()
    public ResponseEntity<GameResponseDto> createGame(@RequestBody GameDto gameDto){
        GameResponseDto gameResponseDto = gameService.saveGame(gameDto);

        return ResponseEntity.status(HttpStatus.OK).body(gameResponseDto);
    }

    @PutMapping()
    public ResponseEntity<GameResponseDto> changeGameInfo(
            @RequestBody ChangeGameInfoDto changeGameInfoDto) throws Exception{
        GameResponseDto gameResponseDto = gameService.changeGameInfo(
                changeGameInfoDto.getGameId(),
                changeGameInfoDto.getTitle(),
                changeGameInfoDto.getDescription(),
                changeGameInfoDto.getWinner(),
                changeGameInfoDto.getLoser());

                return ResponseEntity.status(HttpStatus.OK).body(gameResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteGame(Long gameId) throws Exception{
        gameService.deleteGame(gameId);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }



}
