package singleton;

// this is lazy initialization way of singleton
public class Airport {

    private static Airport airport = null;

    // make private constructor
    private Airport() {

    }

    // make static method that return object/instance of Airport Class
    public static Airport getAirport() {

        if (airport == null) {
            airport = new Airport();
        }

        return airport;
    }
}
