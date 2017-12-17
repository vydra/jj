package p2a;

public class Song  {
    //instance vars
    String title;
    String author;
    Double length; //in minutes

    public Song() {
        this.title = "";
        this.author = "";
        this.length = 0.0;
    }

    public Song(final String title, final String author, final Double length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", length=" + length +
                '}';
    }
}
