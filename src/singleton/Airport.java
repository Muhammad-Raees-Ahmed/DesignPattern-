package singleton;

/* Singleton means one object
 this is lazy initialization way of singleton (this is not thread safe) if we have multiple threads and you want thread safety should use synchronized keyword
 best approach is "should use  synchronized block"*/
public class Airport {

    private static Airport airport = null;

    // make private constructor
    private Airport() {

    }

    // make static method that return object/instance of Airport Class this is not thread safe if multiple thread access it , so thread make multiple objects
/*    public static Airport getAirport() {

        if (airport == null) {
            airport = new Airport();
        }

        return airport;
    }*/




    // this is thread safe but not good approach because it block whole method but our requirement is to synchronized only object creation statement
/*    public synchronized static Airport getAirport() {

        if (airport == null) {
            airport = new Airport();
        }

        return airport;
    }*/

    // ths is good approach because this code only synchronize object creation statement and we want this type of thread safety
    public  static Airport getAirport() {

        synchronized (Airport.class){
            if (airport == null) {
                airport = new Airport();
            }
        }
        return airport;
    }
}
