package p7;

public abstract class MyDevice {

    private String serialNo;

    public MyDevice(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "serialNo=" + serialNo ;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
}
