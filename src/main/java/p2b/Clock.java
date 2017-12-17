package p2b;

public class Clock {
    int hour ;
    int minute ;
    int seconds ;

    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.seconds = 0;
    }

    public Clock(final int hour,final int minute,final int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "The time is " + hour + ":" + minute + ":"  + seconds;
    }
}
