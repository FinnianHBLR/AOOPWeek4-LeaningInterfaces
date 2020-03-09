public class Pier {

    //Properties
    private int mooringBollards;

    //Constructors. Amount of spaces available.
    public Pier (int spaces) {
        this.mooringBollards = spaces;
    }


    //Methods

    public String host(Moorable moorable){ //As this Seaplane inherits Moorable this is possible
        if(mooringBollards >= moorable.spacesTaken()) {
            //Sets bollards - the amount of spaces a plane/boat takes up
            this.mooringBollards -= moorable.spacesTaken();
            return "Amount of bollards left " + mooringBollards + " " + moorable.name();
        } else {
            return "Not Enough bollards left! Cannot dock";
        }

    }



}
