package p7;

public class MyPod extends MyDevice {
    private double memoryCapacity;

    public MyPod(String serialNo, double memoryCapacity) {
        super(serialNo);
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public String toString() {
        return  "MyPod{" +
                super.toString() + ", " +
                "memoryCapacity=" + memoryCapacity +
                '}';
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }
}
