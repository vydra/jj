
package practice4;

import java.util.ArrayList;

public class Mothership {

    private Alien[] cockpitCrew;
    private ArrayList<Alien> flightCrew;

    public Mothership() {
        cockpitCrew = new Alien[4];
        cockpitCrew[0] = new Alien(100, "Attacker");
        cockpitCrew[1] = new Alien(250, "Defender");
        cockpitCrew[2] = new Alien(350, "Defender");
        cockpitCrew[3] = new Alien(500, "Attacker");

        flightCrew = new ArrayList<Alien>();
        flightCrew.add(new Alien(700, "Attacker"));
        flightCrew.add(new Alien(250, "Defender"));
        flightCrew.add(new Alien(350, "Defender"));
        flightCrew.add(new Alien(500, "Attacker"));
    }
    public int jettisonDefenders() {
        int totalJettisoned= 0;

        for (int i = 0; i < cockpitCrew.length; i++) {
            if( cockpitCrew[i].getFirepower()>200 && cockpitCrew[i].getType().equals("Defender") )
            {
                cockpitCrew[i]=null;
                totalJettisoned++;
            }
        }

        for (int i = 0; i < flightCrew.size(); i++)
        {
            if(flightCrew.get(i).getFirepower()>200 && flightCrew.get(i).getType().equals("Defender"))
            {
                flightCrew.remove(i);
                totalJettisoned++;
            }
        }
        return totalJettisoned;
    }

    public void consolidate()
    {
      for(int i=cockpitCrew.length-1; i>0; i--)
      {
         if(cockpitCrew[i-1]==null) {
             cockpitCrew[i - 1] = cockpitCrew[i];
             cockpitCrew[i] = null;
         }
      }
    }

    public String toString() {
        String output = "Members of the cockpit crew:\n";
        for (int i = 0; i < cockpitCrew.length; i++) {
            output = output + "Alien " + cockpitCrew[i] + "\n";

        }
        output = output + "\nMembers of the flight crew:\n";
        for(int i=0; i<flightCrew.size();i++)
        {
            output= output + "Alien " + flightCrew.get(i)+ "\n";
        }
        return output;
    }



}
