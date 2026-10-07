package Model;

public class Birds extends Animal{
    private Boolean taskCleanCage;
    private String typeBird;
    private Boolean ableToTalk;

    public Birds(String nameAnimal, Integer ageAnimal, String ownerAnimal, Boolean taskCleanCage, String typeBird, Boolean ableToTalk) {
        super(nameAnimal, ageAnimal, ownerAnimal);
        this.taskCleanCage = taskCleanCage;
        this.typeBird = typeBird;
        this.ableToTalk = ableToTalk;
    }

    public Boolean getTaskCleanCage() {
        return taskCleanCage;
    }

    public void setTaskCleanCage(Boolean taskCleanCage) {
        this.taskCleanCage = taskCleanCage;
    }

    public String getTypeBird() {
        return typeBird;
    }

    public void setTypeBird(String typeBird) {
        this.typeBird = typeBird;
    }

    public Boolean getAbleToTalk() {
        return ableToTalk;
    }

    public void setAbleToTalk(Boolean ableToTalk) {
        this.ableToTalk = ableToTalk;
    }
}
