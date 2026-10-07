package Model;

public class Animal {
    private String nameAnimal;
    private Integer ageAnimal;
    private String ownerAnimal;

    public Animal(String nameAnimal, Integer ageAnimal, String ownerAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.ownerAnimal = ownerAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public Integer getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(Integer ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getOwnerAnimal() {
        return ownerAnimal;
    }

    public void setOwnerAnimal(String ownerAnimal) {
        this.ownerAnimal = ownerAnimal;
    }

}
