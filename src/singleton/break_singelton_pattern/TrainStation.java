package singleton.break_singelton_pattern;


import java.io.Serializable;

/*we can break the singleton class by following techniques

1) Problem : By Using Reflection API
   Solution (Use Enum, check if obj is created and try to make another obj so return runtime exception)
2) Problem : By Using Deserialization
   Solution : Implementing readResolve() method
3) By Cloning the object.

All these techniques break the singleton class/rule
*/
public class TrainStation implements Serializable,Cloneable {

    private static TrainStation trainStation=null;

    private TrainStation() {

    }

    public static TrainStation getTrainStation(){
        if(trainStation==null){
            trainStation = new TrainStation();
        }

        return trainStation;
    }

    @Override
    public TrainStation clone() {
        try {
            TrainStation clone = (TrainStation) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
