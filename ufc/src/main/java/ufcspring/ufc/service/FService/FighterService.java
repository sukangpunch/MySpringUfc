package ufcspring.ufc.service.FService;

import ufcspring.ufc.data.dto.FDto.FighterDto;
import ufcspring.ufc.data.dto.FDto.FighterResponseDto;
import ufcspring.ufc.data.fighters.Fighter;

public interface FighterService {

    FighterResponseDto getFighter(Long fighterId);

    FighterResponseDto saveFighter(FighterDto fighterDto);

    FighterResponseDto changeFighterInfo(Long fighterId, int ranking, String record , int knockout, int submission) throws Exception;

    void deleteFighter(Long fighterId) throws Exception;
}
