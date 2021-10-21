package completableFeature;

public class Network {

    private boolean active;
    private String imei;

    @Override
    public String toString() {
        return "Network{" +
                "active=" + active +
                ", imei='" + imei + '\'' +
                '}';
    }

    public boolean isActive() {
        return active;
    }

    public Network(String imei) {
        this.imei = imei;
    }
}
