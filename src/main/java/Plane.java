public class Plane {
    //Properties
    private int speedInKph;
    private String name;

    //Constructors
   public Plane(int speed, String name) {//This is refrenenced with super(); in Seaplane
       this.speedInKph = speed;
       this.name = name;
   }

    //Methods

    public int getSpeedInKph() {
        return speedInKph;
    }

    public void setSpeedInKph(int speedInKph) {
        this.speedInKph = speedInKph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
