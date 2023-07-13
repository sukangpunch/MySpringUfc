package ufcspring.ufc.matchings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ufcspring.ufc.common.BaseTimeEntity;
import ufcspring.ufc.fighters.Fighter;
import ufcspring.ufc.games.Game;

import javax.persistence.*;

@Table(name = "matchings_db")
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Matching extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchingId;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name ="fighterid", foreignKey = @ForeignKey(name="fighterId"))
    private Fighter fighter;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name ="gameId", foreignKey = @ForeignKey(name="gameId"))
    private Game game;


    // relational method
    private void setFighter(Fighter fighter)
    {
        this.fighter = fighter;
    }

    private void setGame(Game game)
    {
        this.game = game;
    }




}
