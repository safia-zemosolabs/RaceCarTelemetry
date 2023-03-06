package tddmicroexercises.telemetrysystem;
public class Main {
    public static void main(String args[]){
        TelemetryClientService telemetryClient = new TelemetryClient();
        TelemetryConnectionService telemetryClientConnection = new TelemetryClientConnection();

        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(telemetryClient, telemetryClientConnection);

        try {
            telemetryDiagnosticControls.checkTransmission();
        }catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}
