// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogDestinationType;
import com.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


public final class LoggingConfigurationLogDestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationLogDestinationConfigArgs Empty = new LoggingConfigurationLogDestinationConfigArgs();

    /**
     * A key-value pair to configure the logDestinations.
     * 
     */
    @Import(name="logDestination", required=true)
    private Output<Object> logDestination;

    /**
     * @return A key-value pair to configure the logDestinations.
     * 
     */
    public Output<Object> logDestination() {
        return this.logDestination;
    }

    @Import(name="logDestinationType", required=true)
    private Output<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType;

    public Output<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType() {
        return this.logDestinationType;
    }

    @Import(name="logType", required=true)
    private Output<LoggingConfigurationLogDestinationConfigLogType> logType;

    public Output<LoggingConfigurationLogDestinationConfigLogType> logType() {
        return this.logType;
    }

    private LoggingConfigurationLogDestinationConfigArgs() {}

    private LoggingConfigurationLogDestinationConfigArgs(LoggingConfigurationLogDestinationConfigArgs $) {
        this.logDestination = $.logDestination;
        this.logDestinationType = $.logDestinationType;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationLogDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationLogDestinationConfigArgs $;

        public Builder() {
            $ = new LoggingConfigurationLogDestinationConfigArgs();
        }

        public Builder(LoggingConfigurationLogDestinationConfigArgs defaults) {
            $ = new LoggingConfigurationLogDestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logDestination A key-value pair to configure the logDestinations.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(Output<Object> logDestination) {
            $.logDestination = logDestination;
            return this;
        }

        /**
         * @param logDestination A key-value pair to configure the logDestinations.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(Object logDestination) {
            return logDestination(Output.of(logDestination));
        }

        public Builder logDestinationType(Output<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType) {
            $.logDestinationType = logDestinationType;
            return this;
        }

        public Builder logDestinationType(LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType) {
            return logDestinationType(Output.of(logDestinationType));
        }

        public Builder logType(Output<LoggingConfigurationLogDestinationConfigLogType> logType) {
            $.logType = logType;
            return this;
        }

        public Builder logType(LoggingConfigurationLogDestinationConfigLogType logType) {
            return logType(Output.of(logType));
        }

        public LoggingConfigurationLogDestinationConfigArgs build() {
            $.logDestination = Objects.requireNonNull($.logDestination, "expected parameter 'logDestination' to be non-null");
            $.logDestinationType = Objects.requireNonNull($.logDestinationType, "expected parameter 'logDestinationType' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}
