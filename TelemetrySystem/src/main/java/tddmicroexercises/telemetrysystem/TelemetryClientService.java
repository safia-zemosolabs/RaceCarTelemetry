package tddmicroexercises.telemetrysystem;

public interface TelemetryClientService {
    void send(String message);
    String receive();
}
