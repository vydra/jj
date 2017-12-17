package practice4;

public class MothershipDriver {
    public static void main(String[]args)
    {
        Mothership m1 = new Mothership();
        System.out.println(m1);

        m1.jettisonDefenders();
        System.out.println("=== after jettison ===");
        System.out.println(m1);

        m1.consolidate();
        System.out.println("===after consolidate===");
        System.out.println(m1);
    }


}
