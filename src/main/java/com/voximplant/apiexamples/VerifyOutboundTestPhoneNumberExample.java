package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.VerifyOutboundTestPhoneNumberRequest;
import com.voximplant.apiclient.response.VerifyOutboundTestPhoneNumberResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the verification code.
*/
public class VerifyOutboundTestPhoneNumberExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            VerifyOutboundTestPhoneNumberResponse res = client.verifyOutboundTestPhoneNumber(new VerifyOutboundTestPhoneNumberRequest()
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}