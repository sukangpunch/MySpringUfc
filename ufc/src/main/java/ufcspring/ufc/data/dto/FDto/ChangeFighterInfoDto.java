package ufcspring.ufc.data.dto.FDto;

public class ChangeFighterInfoDto {

    private Long fighterId;
    private int ranking;
    private String record;
    private int knockout;
    private int submission;

    public ChangeFighterInfoDto(Long fighterId,int ranking, String record, int knockout, int submission){
        this.fighterId=fighterId;
        this.ranking=ranking;
        this.record=record;
        this.knockout=knockout;
        this.submission=submission;
    }

    public ChangeFighterInfoDto(){}

    public Long getFighterId(){
        return this.fighterId;
    }

    public void setFighterId(Long fighterId){
        this.fighterId=fighterId;
    }
    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int ranking){
        this.ranking=ranking;
    }

    public String getRecord(){
        return this.record;
    }

    public void setRecord(String record){
        this.record=record;
    }

    public int getKnockout(){
        return this.knockout;
    }

    public void setKnockout(int knockout){
        this.knockout=knockout;
    }

    public int getSubmission(){
        return this.submission;
    }

    public void setSubmission(int submission)
    {
        this.submission=submission;
    }



}
