package ufcspring.ufc.data.dto.GDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameDto {

    private String title;
    private String description;
    private String winner;
    private String loser;

    public GameDto(String title, String description, String winner, String loser){
        this.title = title;
        this.description=description;
        this.winner=winner;
        this.loser=loser;
    }

}
