public class SeaPlane extends Plane implements Moorable {

    //Properties


    // Constructors
    public SeaPlane(int speed, String name) {
        super(speed, name);//Refrencing a class upper
    }

    @Override
    public String getName() {
        return super.getName();
    }

    //Methods
    @Override
    public int spacesTaken() {
        return 1;
    }

    @Override
    public String name() {
        return getName();
    }


}
