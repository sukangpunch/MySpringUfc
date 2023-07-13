package ufcspring.ufc.service.FService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufcspring.ufc.data.dao.FDao.FighterDAO;
import ufcspring.ufc.data.dto.FDto.FighterDto;
import ufcspring.ufc.data.dto.FDto.FighterResponseDto;
import ufcspring.ufc.data.fighters.Fighter;
import ufcspring.ufc.service.FService.FighterService;

import java.time.LocalDateTime;

@Service
public class FighterServiceImpl implements FighterService {

    private final FighterDAO fighterDAO;

    @Autowired
    public FighterServiceImpl(FighterDAO fighterDAO){
        this.fighterDAO=fighterDAO;
    }


    @Override
    public FighterResponseDto getFighter(Long fighterId) {
        Fighter fighter = fighterDAO.selectFighter(fighterId);

        FighterResponseDto fighterResponseDto = new FighterResponseDto();
        fighterResponseDto.setFighterId(fighter.getFighterId());
        fighterResponseDto.setName(fighter.getName());
        fighterResponseDto.setWeight(fighter.getWeight());
        fighterResponseDto.setRanking(fighter.getRanking());
        fighterResponseDto.setRecord(fighter.getRecord());
        fighterResponseDto.setKnockout(fighter.getKnockout());
        fighterResponseDto.setSubmission(fighter.getSubmission());

        return fighterResponseDto;
    }

    @Override
    public FighterResponseDto saveFighter(FighterDto fighterDto) {
        Fighter fighter = new Fighter();
        fighter.setName(fighterDto.getName());
        fighter.setWeight(fighterDto.getWeight());
        fighter.setRanking(fighterDto.getRanking());
        fighter.setRecord(fighterDto.getRecord());
        fighter.setKnockout(fighterDto.getKnockout());
        fighter.setSubmission(fighterDto.getSubmission());
        fighter.setCreatedAt(LocalDateTime.now());
        fighter.setUpdatedAt(LocalDateTime.now());

        Fighter saveFighter = fighterDAO.insertFighter(fighter);

        FighterResponseDto fighterResponseDto = new FighterResponseDto();
        fighterResponseDto.setFighterId(saveFighter.getFighterId());
        fighterResponseDto.setName(saveFighter.getName());
        fighterResponseDto.setWeight(saveFighter.getWeight());
        fighterResponseDto.setRanking(saveFighter.getRanking());
        fighterResponseDto.setRecord(saveFighter.getRecord());
        fighterResponseDto.setKnockout(saveFighter.getKnockout());
        fighterResponseDto.setSubmission(saveFighter.getSubmission());

        return fighterResponseDto;
    }



    @Override
    public FighterResponseDto changeFighterInfo(Long fighterId, int ranking, String record, int knockout, int submission) throws Exception {
        Fighter changeFighter = fighterDAO.updateFighterInfo(fighterId,ranking,record,knockout,submission);

        FighterResponseDto fighterResponseDto = new FighterResponseDto();
        fighterResponseDto.setFighterId(changeFighter.getFighterId());
        fighterResponseDto.setRanking(changeFighter.getRanking());
        fighterResponseDto.setRecord(changeFighter.getRecord());
        fighterResponseDto.setKnockout(changeFighter.getKnockout());
        fighterResponseDto.setSubmission(changeFighter.getSubmission());

        return fighterResponseDto;
    }

    @Override
    public void deleteFighter(Long fighterId) throws Exception {
        fighterDAO.deleteFighter(fighterId);
    }
}
