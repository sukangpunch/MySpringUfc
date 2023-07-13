package ufcspring.ufc.data.dto.FDto;

public class FighterDto {

    private String name;
    private String weight;
    private int ranking;
    private String record;
    private int knockout;
    private int submission;

    public FighterDto(String name, String weight, int ranking, String record, int knockout, int submission){
        this.name = name;
        this.weight=weight;
        this.ranking=ranking;
        this.record= record;
        this.knockout=knockout;
        this.submission=submission;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(){
        this.weight=weight;
    }

    public void getWeight(String weight){
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

    public int getKnockout() {
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
