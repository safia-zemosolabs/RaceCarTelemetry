package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelemetryDiagnosticControlsTest
{
    TelemetryClientService telemetryClient = new TelemetryClient();
    TelemetryConnectionService telemetryClientConnection = new TelemetryClientConnection();
    final String expectedInfo = "LAST TX rate................ 100 MBPS\r\n"
            + "HIGHEST TX rate............. 100 MBPS\r\n"
            + "LAST RX rate................ 100 MBPS\r\n"
            + "HIGHEST RX rate............. 100 MBPS\r\n"
            + "BIT RATE.................... 100000000\r\n"
            + "WORD LEN.................... 16\r\n"
            + "WORD/FRAME.................. 511\r\n"
            + "BITS/FRAME.................. 8192\r\n"
            + "MODULATION TYPE............. PCM/FM\r\n"
            + "TX Digital Los.............. 0.75\r\n"
            + "RX Digital Los.............. 0.10\r\n"
            + "BEP Test.................... -5\r\n"
            + "Local Rtrn Count............ 00\r\n"
            + "Remote Rtrn Count........... 00";

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response()
    {

        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(telemetryClient, telemetryClientConnection);

        try {
            telemetryDiagnosticControls.checkTransmission();
            assertEquals(telemetryDiagnosticControls.getDiagnosticInfo(),expectedInfo);
        }catch (Exception e){
            System.out.println("Exception " + e);
        }
    }

    @Test
    public void CheckTransmission_should_throw_exception() {
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(telemetryClient, telemetryClientConnection);
        TelemetryClientConnection telemetryClientConnection = new TelemetryClientConnection();

        String ExpectedErrorMessage ="Unable to connect.";

        try {
            telemetryClientConnection.disconnect();
            telemetryDiagnosticControls.checkTransmission();

        }catch (Exception e){
            System.out.println("Exception " + e);
            assertEquals(e.getMessage(), ExpectedErrorMessage);
        }
    }

}

