package p7;

import java.util.ArrayList;

public class MyPodDriver {

    public static void main(String[] args) {
        MyPod myPod = new MyPod("abs123", 12.500);
        System.out.println( myPod );

        MyAlarm myAlarm = new MyAlarm("78654","6:00AM");

        ArrayList<MyDevice> deviceList = new ArrayList<MyDevice>();
        deviceList.add( myPod );
        deviceList.add( myAlarm );

        System.out.println( "Printing list");
        for( MyDevice each : deviceList) {
            System.out.println( each.toString() );
        }
    }

}
