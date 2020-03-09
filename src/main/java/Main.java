public class Main {
    public static void main(String[] args) {
        Pier pier = new Pier(80);


        SeaPlane sparrow = new SeaPlane(350, "IOID4");
        System.out.println(pier.host(sparrow));


        Boat ALEXIND7 = new Boat("ALEXIND7",300);
        System.out.println(pier.host(ALEXIND7));
    }
}
