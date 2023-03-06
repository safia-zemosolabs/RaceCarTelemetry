package tddmicroexercises.telemetrysystem;

public class TelemetryDiagnosticControls implements TelemetryDiagnosticService
{
    private final String DiagnosticChannelConnectionString = "*111#";

    private final TelemetryClientService telemetryClient;

    private final TelemetryConnectionService telemetryClientConnection;
    private String diagnosticInfo = "";

    public TelemetryDiagnosticControls(TelemetryClientService telemetryClient, TelemetryConnectionService telemetryClientConnection) {

        this.telemetryClient = telemetryClient;
        this.telemetryClientConnection = telemetryClientConnection;
    }
    public String getDiagnosticInfo(){
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(String diagnosticInfo){
        this.diagnosticInfo = diagnosticInfo;
    }

    @Override
    public void checkTransmission() throws Exception
    {
        diagnosticInfo = "";

        telemetryClientConnection.disconnect();

        int retryLeft = 3;
        while (telemetryClientConnection.getOnlineStatus() == false && retryLeft > 0)
        {
            telemetryClientConnection.connect(DiagnosticChannelConnectionString);
            retryLeft -= 1;
        }

        if(telemetryClientConnection.getOnlineStatus() == false)
        {
            throw new Exception("Unable to connect.");
        }

        System.out.println("Connection Successful");

        telemetryClient.send(TelemetryClient.DIAGNOSTIC_MESSAGE);
        diagnosticInfo = telemetryClient.receive();

        System.out.println("Received Diagnostic Info : \n" + diagnosticInfo);
    }
}
