package ufcspring.ufc.data.dto.GDto;

import lombok.Getter;
import lombok.Setter;
import ufcspring.ufc.data.games.GameRepository;

@Getter
@Setter
public class GameResponseDto {

    private Long gameId;
    private String title;
    private String description;
    private String winner;
    private String loser;

    public GameResponseDto(){}

    public GameResponseDto(Long gameId,String title,String description, String winner, String loser){
        this.gameId=gameId;
        this.title=title;
        this.description=description;
        this.winner=winner;
        this.loser=loser;
    }
}
