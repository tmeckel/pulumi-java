// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration details about the monitoring schedule.
 * 
 */
public final class MonitoringScheduleScheduleConfig extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleScheduleConfig Empty = new MonitoringScheduleScheduleConfig();

    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
     */
    @Import(name="scheduleExpression", required=true)
    private String scheduleExpression;

    /**
     * @return A cron expression that describes details about the monitoring schedule.
     * 
     */
    public String scheduleExpression() {
        return this.scheduleExpression;
    }

    private MonitoringScheduleScheduleConfig() {}

    private MonitoringScheduleScheduleConfig(MonitoringScheduleScheduleConfig $) {
        this.scheduleExpression = $.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleScheduleConfig $;

        public Builder() {
            $ = new MonitoringScheduleScheduleConfig();
        }

        public Builder(MonitoringScheduleScheduleConfig defaults) {
            $ = new MonitoringScheduleScheduleConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduleExpression A cron expression that describes details about the monitoring schedule.
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(String scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public MonitoringScheduleScheduleConfig build() {
            $.scheduleExpression = Objects.requireNonNull($.scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
            return $;
        }
    }

}
