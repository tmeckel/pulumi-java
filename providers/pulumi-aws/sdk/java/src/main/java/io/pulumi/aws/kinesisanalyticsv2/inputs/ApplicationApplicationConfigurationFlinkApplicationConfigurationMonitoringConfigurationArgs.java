// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs();

    /**
     * Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `log_level` or `metrics_level` attribute values to be effective.
     * 
     */
    @Import(name="configurationType", required=true)
      private final Output<String> configurationType;

    public Output<String> getConfigurationType() {
        return this.configurationType;
    }

    /**
     * Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> getLogLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
     * 
     */
    @Import(name="metricsLevel")
      private final @Nullable Output<String> metricsLevel;

    public Output<String> getMetricsLevel() {
        return this.metricsLevel == null ? Codegen.empty() : this.metricsLevel;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs(
        Output<String> configurationType,
        @Nullable Output<String> logLevel,
        @Nullable Output<String> metricsLevel) {
        this.configurationType = Objects.requireNonNull(configurationType, "expected parameter 'configurationType' to be non-null");
        this.logLevel = logLevel;
        this.metricsLevel = metricsLevel;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs() {
        this.configurationType = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.metricsLevel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configurationType;
        private @Nullable Output<String> logLevel;
        private @Nullable Output<String> metricsLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationType = defaults.configurationType;
    	      this.logLevel = defaults.logLevel;
    	      this.metricsLevel = defaults.metricsLevel;
        }

        public Builder configurationType(Output<String> configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }
        public Builder configurationType(String configurationType) {
            this.configurationType = Output.of(Objects.requireNonNull(configurationType));
            return this;
        }
        public Builder logLevel(@Nullable Output<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Codegen.ofNullable(logLevel);
            return this;
        }
        public Builder metricsLevel(@Nullable Output<String> metricsLevel) {
            this.metricsLevel = metricsLevel;
            return this;
        }
        public Builder metricsLevel(@Nullable String metricsLevel) {
            this.metricsLevel = Codegen.ofNullable(metricsLevel);
            return this;
        }        public ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs(configurationType, logLevel, metricsLevel);
        }
    }
}
