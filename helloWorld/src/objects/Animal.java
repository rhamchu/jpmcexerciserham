package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Animal {


    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isMansBestFriend() {
        return mansBestFriend;
    }

    public void setMansBestFriend(boolean mansBestFriend) {
        this.mansBestFriend = mansBestFriend;
    }

    private String petType;
    private int population;
    private boolean mansBestFriend;



}
