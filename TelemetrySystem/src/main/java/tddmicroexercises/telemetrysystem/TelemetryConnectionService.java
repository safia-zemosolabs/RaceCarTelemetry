package tddmicroexercises.telemetrysystem;

public interface TelemetryConnectionService {
    boolean getOnlineStatus();
    void connect(String conn);
    void disconnect();
}
