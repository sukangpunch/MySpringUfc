package ufcspring.ufc.data.dao.FDao;

import ufcspring.ufc.data.fighters.Fighter;

public interface FighterDAO {
    Fighter insertFighter(Fighter fighter);

    Fighter selectFighter(Long fighterId);

    Fighter updateFighterInfo(Long fighterId, int ranking, String record , int knockout, int submission ) throws Exception;

    void deleteFighter(Long fighterId) throws Exception;


}
