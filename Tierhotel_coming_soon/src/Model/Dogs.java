package Model;

public class Dogs extends Animal{
    private Boolean taskWalk;
    private String raceDog;
    private Boolean isTrained;

    public Dogs(String nameAnimal, Integer ageAnimal, String ownerAnimal, Boolean taskWalk, String raceDog, Boolean isTrained) {
        super(nameAnimal, ageAnimal, ownerAnimal);
        this.taskWalk = taskWalk;
        this.raceDog = raceDog;
        this.isTrained = isTrained;
    }

    public Boolean getTaskWalk() {
        return taskWalk;
    }

    public void setTaskWalk(Boolean taskWalk) {
        this.taskWalk = taskWalk;
    }

    public String getRaceDog() {
        return raceDog;
    }

    public void setRaceDog(String raceDog) {
        this.raceDog = raceDog;
    }

    public Boolean getTrained() {
        return isTrained;
    }

    public void setTrained(Boolean trained) {
        isTrained = trained;
    }
}
