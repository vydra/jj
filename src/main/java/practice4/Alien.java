package practice4;

public class Alien {
    private int firepower;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFirepower() {

        return firepower;
    }

    public void setFirepower(int firepower) {
        this.firepower = firepower;
    }

    public Alien(int firepower, String type)
    {
     this.firepower= firepower;
     this.type=type;

    }

public String toString()
{
    return "firepower: "+ firepower + ", type: " + type;
}
}
