package ufcspring.ufc.data.fighters;

import lombok.*;
import ufcspring.ufc.common.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fighters_db")
public class Fighter extends BaseTimeEntity {

    //파이터 식별자
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fighterId;

    @Column(nullable = false)
    //파이터 이름
    private String name;

    @Column(nullable = false)
    //파이터 체급
    private String weight;

    @Column(nullable = false)
    //파이터 랭킹
    private int ranking;

    @Column(nullable = false)
    //파이터 전적
    private String record;

    @Column(nullable = false)
    //파이터 녹아웃 승리
    private int knockout;

    @Column(nullable = false)
    //파이터 서브미션 승리
    private int submission;

}