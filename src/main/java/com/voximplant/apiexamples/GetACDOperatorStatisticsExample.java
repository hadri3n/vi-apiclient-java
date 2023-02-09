package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetACDOperatorStatisticsRequest;
import com.voximplant.apiclient.response.GetACDOperatorStatisticsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get AC and TT statistics for two operators and the queue from the
* specified date.
*/
public class GetACDOperatorStatisticsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2021, 4, 8, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2021, 4, 10, 0, 0, 0);

            GetACDOperatorStatisticsResponse res = client.getACDOperatorStatistics(new GetACDOperatorStatisticsRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setAcdQueueId(MultiArgument.forSingleValue(54L))
                .setUserId(MultiArgument.forSingleValue(1768L))
                .setReport(MultiArgument.forSingleValue("AC"))
                .setAggregation("day")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}