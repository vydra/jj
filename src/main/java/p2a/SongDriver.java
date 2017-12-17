package p2a;

public class SongDriver {

    public static void main(String[] args) {
        Song song1 = new Song();
        System.out.println("song1: " + song1 ); //automatically call toString()

        Song song2 = new Song("Money, money","ABBA", 4.7);
        System.out.println( "song2: " + song2 );
    }
}
