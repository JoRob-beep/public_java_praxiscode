package Model;

public class Cats extends Animal{
    private Boolean taskToilette;
    private String colorOfFur;
    private Boolean likeStraw;

    public Cats(String nameAnimal, Integer ageAnimal, String ownerAnimal, Boolean taskToilette, String colorOfFur, Boolean likeStraw) {
        super(nameAnimal, ageAnimal, ownerAnimal);
        this.taskToilette = taskToilette;
        this.colorOfFur = colorOfFur;
        this.likeStraw = likeStraw;
    }

    public Boolean getTaskToilette() {
        return taskToilette;
    }

    public void setTaskToilette(Boolean taskToilette) {
        this.taskToilette = taskToilette;
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public void setColorOfFur(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    public Boolean getLikeStraw() {
        return likeStraw;
    }

    public void setLikeStraw(Boolean likeStraw) {
        this.likeStraw = likeStraw;
    }
}
