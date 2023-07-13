package ufcspring.ufc.data.dto.GDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ufcspring.ufc.data.dto.FDto.ChangeFighterInfoDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangeGameInfoDto {

    private Long gameId;
    private String title;
    private String description;
    private String winner;
    private String loser;

}
