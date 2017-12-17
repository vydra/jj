package p2b;

import javax.swing.*;

public class ClockDriver {
    public static void main(String[] args) {
        Clock kitchenClock = new Clock();
        System.out.println("kitchenClock: " + kitchenClock.toString());

        String hoursStr = JOptionPane.showInputDialog("Hours?");
        String minutesStr = JOptionPane.showInputDialog("Minutes?");
        String secondsStr = JOptionPane.showInputDialog("Seconds?");

        Clock bedroomClock = new Clock(
                Integer.parseInt(hoursStr),
                Integer.parseInt(minutesStr),
                Integer.parseInt(secondsStr));

        System.out.println("bedroomClock: " + bedroomClock.toString());
    }
}
