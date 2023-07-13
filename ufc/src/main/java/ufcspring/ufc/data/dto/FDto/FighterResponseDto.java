package ufcspring.ufc.data.dto.FDto;

public class FighterResponseDto {

    private Long fighterId;
    private String name;
    private String weight;
    private int ranking;
    private String record;
    private int knockout;
    private int submission;

    public FighterResponseDto(){}

    public FighterResponseDto(Long fighterId,String name, String weight, int ranking, String record, int knockout, int submission){
        this.fighterId=fighterId;
        this.name=name;
        this.weight=weight;
        this.ranking=ranking;
        this.record=record;
        this.knockout=knockout;
        this.submission=submission;
    }

    public  Long getFighterId(){
        return fighterId;
    }

    public void setFighterId(Long fighterId){
        this.fighterId=fighterId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight=weight;
    }

    public int getRanking(){
        return ranking;
    }

    public void setRanking(int ranking){
        this.ranking=ranking;
    }

    public String getRecord(){
        return record;
    }

    public void setRecord(String record){
        this.record=record;
    }

    public int getKnockout(){
        return knockout;
    }

    public void setKnockout(int knockout){
        this.knockout=knockout;
    }

    public int getSubmission(){
        return submission;
    }

    public void setSubmission(int submission){
        this.submission=submission;
    }


}
