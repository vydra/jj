package p7b;

public class LED extends Television {
    public LED() {
        super("LED",555.99);
    }

    public LED(String initialModel, double initialPrice) {
        super(initialModel, initialPrice);
    }
}
