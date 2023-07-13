package ufcspring.ufc.data.dao.FDao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufcspring.ufc.data.dao.FDao.FighterDAO;
import ufcspring.ufc.data.fighters.Fighter;
import ufcspring.ufc.data.fighters.FighterRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class FighterDAOImpl implements FighterDAO {

    private final FighterRepository fighterRepository;

    @Autowired
    public FighterDAOImpl(FighterRepository fighterRepository){
        this.fighterRepository = fighterRepository;
    }


    @Override
    public Fighter insertFighter(Fighter fighter) {
        Fighter savedFighter = fighterRepository.save(fighter);

        return savedFighter;
    }

    @Override
    public Fighter selectFighter(Long fighterId) {
        Fighter selectedFighter = fighterRepository.getById(fighterId);

        return selectedFighter;
    }

    @Override
    public Fighter updateFighterInfo(Long fighterId, int ranking, String record, int knockout, int submission) throws Exception {
        Optional<Fighter> selectedFighter = fighterRepository.findById(fighterId);

        Fighter updatedFighter;
        if(selectedFighter.isPresent()){
            Fighter fighter = selectedFighter.get();

            fighter.setRanking(ranking);
            fighter.setRecord(record);
            fighter.setKnockout(knockout);
            fighter.setSubmission(submission);
            fighter.setUpdatedAt(LocalDateTime.now());

            updatedFighter = fighterRepository.save(fighter);
        }else{
            throw new Exception();
        }

        return updatedFighter;
    }

    @Override
    public void deleteFighter(Long fighterId) throws Exception {
        Optional<Fighter> selectedFighter = fighterRepository.findById(fighterId);

        if(selectedFighter.isPresent()){
            Fighter fighter = selectedFighter.get();

            fighterRepository.delete(fighter);
        }else{
            throw new Exception();
        }
    }
}
