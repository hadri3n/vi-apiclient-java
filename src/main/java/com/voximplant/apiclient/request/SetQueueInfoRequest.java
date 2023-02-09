package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SetQueueInfoRequest implements Alignable {
    private Long acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID
    */
    public SetQueueInfoRequest setAcdQueueId(long d) {
        this.acdQueueId = Long.valueOf(d);
        return this;
    }

    private String acdQueueName;

    @RequestField(name="acd_queue_name")
    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>
    */
    public SetQueueInfoRequest setAcdQueueName(String d) {
        this.acdQueueName = d;
        return this;
    }

    private String newAcdQueueName;

    @RequestField(name="new_acd_queue_name")
    /**
    * The new queue name. The length must be less than 100
    */
    public String getNewAcdQueueName() {
        return this.newAcdQueueName;
    }

    public boolean hasNewAcdQueueName() {
        return this.newAcdQueueName != null;
    }

    /**
    * The new queue name. The length must be less than 100
    */
    public SetQueueInfoRequest setNewAcdQueueName(String d) {
        this.newAcdQueueName = d;
        return this;
    }

    private Long acdQueuePriority;

    @RequestField(name="acd_queue_priority")
    /**
    * The integer queue priority. The highest priority is 0
    */
    public Long getAcdQueuePriority() {
        return this.acdQueuePriority;
    }

    public boolean hasAcdQueuePriority() {
        return this.acdQueuePriority != null;
    }

    /**
    * The integer queue priority. The highest priority is 0
    */
    public SetQueueInfoRequest setAcdQueuePriority(long d) {
        this.acdQueuePriority = Long.valueOf(d);
        return this;
    }

    private Boolean autoBinding;

    @RequestField(name="auto_binding")
    /**
    * Set false to disable the auto binding of operators to a queue by
    * skills comparing
    */
    public Boolean getAutoBinding() {
        return this.autoBinding;
    }

    public boolean hasAutoBinding() {
        return this.autoBinding != null;
    }

    /**
    * Set false to disable the auto binding of operators to a queue by
    * skills comparing
    */
    public SetQueueInfoRequest setAutoBinding(boolean d) {
        this.autoBinding = Boolean.valueOf(d);
        return this;
    }

    private Long serviceProbability;

    @RequestField(name="service_probability")
    /**
    * The value in the range of [0.5 ... 1.0]. The value 1.0 means the
    * service probability 100% in challenge with a lower priority queue
    */
    public Long getServiceProbability() {
        return this.serviceProbability;
    }

    public boolean hasServiceProbability() {
        return this.serviceProbability != null;
    }

    /**
    * The value in the range of [0.5 ... 1.0]. The value 1.0 means the
    * service probability 100% in challenge with a lower priority queue
    */
    public SetQueueInfoRequest setServiceProbability(long d) {
        this.serviceProbability = Long.valueOf(d);
        return this;
    }

    private Long maxQueueSize;

    @RequestField(name="max_queue_size")
    /**
    * The max queue size
    */
    public Long getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public boolean hasMaxQueueSize() {
        return this.maxQueueSize != null;
    }

    /**
    * The max queue size
    */
    public SetQueueInfoRequest setMaxQueueSize(long d) {
        this.maxQueueSize = Long.valueOf(d);
        return this;
    }

    private Long maxWaitingTime;

    @RequestField(name="max_waiting_time")
    /**
    * The max predicted waiting time in minutes. The client is rejected if
    * the predicted waiting time is greater than the max predicted waiting
    * time
    */
    public Long getMaxWaitingTime() {
        return this.maxWaitingTime;
    }

    public boolean hasMaxWaitingTime() {
        return this.maxWaitingTime != null;
    }

    /**
    * The max predicted waiting time in minutes. The client is rejected if
    * the predicted waiting time is greater than the max predicted waiting
    * time
    */
    public SetQueueInfoRequest setMaxWaitingTime(long d) {
        this.maxWaitingTime = Long.valueOf(d);
        return this;
    }

    private Long averageServiceTime;

    @RequestField(name="average_service_time")
    /**
    * The average service time in seconds. Specify the parameter to correct
    * or initialize the waiting time prediction
    */
    public Long getAverageServiceTime() {
        return this.averageServiceTime;
    }

    public boolean hasAverageServiceTime() {
        return this.averageServiceTime != null;
    }

    /**
    * The average service time in seconds. Specify the parameter to correct
    * or initialize the waiting time prediction
    */
    public SetQueueInfoRequest setAverageServiceTime(long d) {
        this.averageServiceTime = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The new application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The new application ID
    */
    public SetQueueInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
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
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueName != null) {
            sb.append(aligned)
                .append("\"acdQueueName\": \"")
                .append(acdQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newAcdQueueName != null) {
            sb.append(aligned)
                .append("\"newAcdQueueName\": \"")
                .append(newAcdQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueuePriority != null) {
            sb.append(aligned)
                .append("\"acdQueuePriority\": \"")
                .append(acdQueuePriority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoBinding != null) {
            sb.append(aligned)
                .append("\"autoBinding\": \"")
                .append(autoBinding)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serviceProbability != null) {
            sb.append(aligned)
                .append("\"serviceProbability\": \"")
                .append(serviceProbability)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxQueueSize != null) {
            sb.append(aligned)
                .append("\"maxQueueSize\": \"")
                .append(maxQueueSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxWaitingTime != null) {
            sb.append(aligned)
                .append("\"maxWaitingTime\": \"")
                .append(maxWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (averageServiceTime != null) {
            sb.append(aligned)
                .append("\"averageServiceTime\": \"")
                .append(averageServiceTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
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