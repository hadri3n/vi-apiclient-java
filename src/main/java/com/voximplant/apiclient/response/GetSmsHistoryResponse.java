package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

public class GetSmsHistoryResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private SmsHistoryType[] result;

        public SmsHistoryType[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long totalCount;

    /**
    * Total number of messages matching the query parameters
    */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public boolean hasTotalCount() {
        return this.totalCount != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (result != null) {
            sb.append(aligned)
                .append("\"SmsHistoryType\": ")
                .append(StringHelper.arrayToString(result, alignment + 1))
                .append(System.lineSeparator());
        }
        if (totalCount != null) {
            sb.append(aligned)
                .append("\"totalCount\": \"")
                .append(totalCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}