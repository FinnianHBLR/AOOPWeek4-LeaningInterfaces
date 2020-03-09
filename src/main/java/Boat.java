public class Boat implements Moorable {
    //Properties
    private int weightInTons;
    private String name;

    //Constructors
    public Boat(String name, int weigt) {
        this.weightInTons = weigt;
        this.name = name;
    }


    //Methods


    public int getWeightInTons() {
        return weightInTons;
    }

    public void setWeightInTons(int weightInTons) {
        this.weightInTons = weightInTons;
    }

    @Override//Will specify how many spaces there will be taken. THE PROMISE is that there will be a set amount of spaces
    public int spacesTaken() {
        return weightInTons / 10 ;
    }

    @Override
    public String name() {
        return name;
    }
}
