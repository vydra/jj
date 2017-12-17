package p7;

public class MyAlarm extends MyDevice {
    private String wakeUpTime;

    public String getWakeUpTime() {
        return wakeUpTime;
    }

    public void setWakeUpTime(String wakeUpTime) {
        this.wakeUpTime = wakeUpTime;
    }

    public MyAlarm(String serialNo, String wakeUpTime) {
        super(serialNo);
        this.wakeUpTime = wakeUpTime;
    }

    @Override
    public String toString() {
        return "MyAlarm{" +
                super.toString() + ", " +
                "wakeUpTime='" + wakeUpTime + '\'' +
                '}';
    }

}
