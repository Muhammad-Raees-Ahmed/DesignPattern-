package singleton;

public class SeaPort {

    // eager way of singleton object creation / early instantiation  . If the object of this SeaPort don't need to use in entire application so this object creation is useless because we don't need to use this object but it takes memory.
    private static SeaPort seaPort=new SeaPort();

    public static SeaPort getSeaPort(){
        return seaPort;
    }
}
