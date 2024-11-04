import singleton.Airport;
import singleton.SeaPort;


public class Main {
    public static void main(String[] args) {


        // lazy instantiation
        Airport airport1=Airport.getAirport();
        Airport airport2=Airport.getAirport();

        System.out.println("hashCode of airport1 : "+airport1.hashCode());
        System.out.println("hashCode of airport2 : "+airport2.hashCode());


//        early instantiation
        SeaPort seaPort1=SeaPort.getSeaPort();
        SeaPort seaPort2=SeaPort.getSeaPort();

        System.out.println("hashCode of seaPort1 : "+seaPort1.hashCode());
        System.out.println("hashCode of seaPort2 : "+seaPort2.hashCode());
    }
}