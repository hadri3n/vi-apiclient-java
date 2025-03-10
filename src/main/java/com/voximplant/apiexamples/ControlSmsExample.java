package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.ControlSmsRequest;
import com.voximplant.apiclient.response.ControlSmsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;
import java.io.InputStream;

/**
* Disable work with SMS for phone number 447443332211.
*/
public class ControlSmsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            ControlSmsResponse res = client.controlSms(new ControlSmsRequest()
                .setPhoneNumber("447443332211")
                .setCommand("disable")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}