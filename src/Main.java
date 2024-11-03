import singleton.Airport;


public class Main {
    public static void main(String[] args) {


        Airport airport1=Airport.getAirport();
        Airport airport2=Airport.getAirport();

        System.out.println("hashCode of airport1 : "+airport1.hashCode());
        System.out.println("hashCode of airport2 : "+airport2.hashCode());
    }
}