// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlarmArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlarmArgs Empty = new GetAlarmArgs();

    /**
     * The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    @Import(name="alarmName", required=true)
    private String alarmName;

    /**
     * @return The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    public String alarmName() {
        return this.alarmName;
    }

    private GetAlarmArgs() {}

    private GetAlarmArgs(GetAlarmArgs $) {
        this.alarmName = $.alarmName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlarmArgs $;

        public Builder() {
            $ = new GetAlarmArgs();
        }

        public Builder(GetAlarmArgs defaults) {
            $ = new GetAlarmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alarmName The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
         * 
         * @return builder
         * 
         */
        public Builder alarmName(String alarmName) {
            $.alarmName = alarmName;
            return this;
        }

        public GetAlarmArgs build() {
            $.alarmName = Objects.requireNonNull($.alarmName, "expected parameter 'alarmName' to be non-null");
            return $;
        }
    }

}
