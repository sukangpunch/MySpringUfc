package ufcspring.ufc.data.games;

import lombok.*;
import ufcspring.ufc.common.BaseTimeEntity;

import javax.persistence.*;

@Table(name="games_td")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String winner;

    @Column(nullable = false)
    private String loser;

}
