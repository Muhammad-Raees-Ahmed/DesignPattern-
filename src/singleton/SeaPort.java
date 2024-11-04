package singleton;

public class SeaPort {

    // eager way of singleton object creation / early instantiation
    private static SeaPort seaPort=new SeaPort();

    public static SeaPort getSeaPort(){
        return seaPort;
    }
}
