package p5;

import java.util.Random;

public class Jukebox {

    static class MySong {

        private String title;

        public int getRating() {
            return rating;
        }

        private int rating;

        public MySong(String title, int rating) {
            this.title = title;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return title + " " + rating;
        }
    }

    MySong[][] songList = new MySong[3][4];

    public Jukebox() {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );
    }

    MySong randomSong() {
        Random rand = new Random();

        int row = rand.nextInt(3);
        int col = rand.nextInt(4);

        return songList[row][col];
    }

    void playSongofRating(int rating) {
        for(int row = 0; row < songList.length; row++) {
            for (int col = 0; col < songList[0].length; col++) {
                MySong song = songList[row][col];
                if (song.getRating() == rating) {
                    System.out.println(song);
                }
            }
        }
    }

    public String toString() {
        String res = "";
        for(int row = 0; row < songList.length; row++) {
            for (int col = 0; col < songList[0].length; col++) {
                res += songList[row][col] + " ";
            }
            res += "\n";
        }
        return  res;
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
       // System.out.print(jukebox);
        System.out.println("Random song: " + jukebox.randomSong());
        System.out.println("Song of rating 2");
        jukebox.playSongofRating(2);
    }

}
