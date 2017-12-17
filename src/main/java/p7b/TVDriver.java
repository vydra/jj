package p7b;

import java.util.ArrayList;

public class TVDriver {
    public static void main(String[] args) {
        ArrayList<Television> tvList = new ArrayList<>();
        tvList.add( new Plasma());
        tvList.add( new DLP());
        tvList.add( new LCD());
        tvList.add( new LED());

        System.out.println("TVs in the store...");
        for( Television each : tvList) {
            System.out.println( each );
        }

    }
}
