import singleton.Airport;
import singleton.SeaPort;
import singleton.break_singelton_pattern.TrainStation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;


public class Main {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {


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

        System.out.println("-------------Approch 1--------------");

        // Break Singleton Class By Reflection Api

        TrainStation trainStation1=TrainStation.getTrainStation();
        System.out.println("hasCode of trainStation1 :" +trainStation1.hashCode());
        Constructor<TrainStation> constructor=TrainStation.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TrainStation trainStation2=constructor.newInstance();
        System.out.println("hasCode of trainStation2 :" +trainStation2.hashCode());

        System.out.println("-------------Approch 2--------------");
        // Break Singleton By Deserialization

        // serialize the obj
        TrainStation trainStation3=TrainStation.getTrainStation();
        System.out.println("hasCode of tranStation3 :"+trainStation3.hashCode());
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("dummy.ob"));
        objectOutputStream.writeObject(trainStation3);

        // deSerialize the obj
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("dummy.ob"));
        TrainStation trainStation4=(TrainStation) objectInputStream.readObject();
        System.out.println("hasCode of tranStation4 :"+trainStation4.hashCode());

        System.out.println("---------------Approch 3---------------");

        TrainStation trainStation5=TrainStation.getTrainStation();
        System.out.println("hasCode of tranStation5 :"+trainStation5.hashCode());
        TrainStation trainStation6=trainStation5.clone();
        System.out.println("hasCode of tranStation6 :"+trainStation6.hashCode());


     }
}