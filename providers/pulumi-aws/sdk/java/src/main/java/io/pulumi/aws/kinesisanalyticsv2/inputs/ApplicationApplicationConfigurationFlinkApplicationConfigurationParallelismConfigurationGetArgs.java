// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs();

    /**
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
     * 
     */
    @Import(name="autoScalingEnabled")
      private final @Nullable Output<Boolean> autoScalingEnabled;

    public Output<Boolean> getAutoScalingEnabled() {
        return this.autoScalingEnabled == null ? Codegen.empty() : this.autoScalingEnabled;
    }

    /**
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `auto_scaling_enabled`, `parallelism`, or `parallelism_per_kpu` attribute values to be effective.
     * 
     */
    @Import(name="configurationType", required=true)
      private final Output<String> configurationType;

    public Output<String> getConfigurationType() {
        return this.configurationType;
    }

    /**
     * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
     * 
     */
    @Import(name="parallelism")
      private final @Nullable Output<Integer> parallelism;

    public Output<Integer> getParallelism() {
        return this.parallelism == null ? Codegen.empty() : this.parallelism;
    }

    /**
     * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
     * 
     */
    @Import(name="parallelismPerKpu")
      private final @Nullable Output<Integer> parallelismPerKpu;

    public Output<Integer> getParallelismPerKpu() {
        return this.parallelismPerKpu == null ? Codegen.empty() : this.parallelismPerKpu;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs(
        @Nullable Output<Boolean> autoScalingEnabled,
        Output<String> configurationType,
        @Nullable Output<Integer> parallelism,
        @Nullable Output<Integer> parallelismPerKpu) {
        this.autoScalingEnabled = autoScalingEnabled;
        this.configurationType = Objects.requireNonNull(configurationType, "expected parameter 'configurationType' to be non-null");
        this.parallelism = parallelism;
        this.parallelismPerKpu = parallelismPerKpu;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs() {
        this.autoScalingEnabled = Codegen.empty();
        this.configurationType = Codegen.empty();
        this.parallelism = Codegen.empty();
        this.parallelismPerKpu = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoScalingEnabled;
        private Output<String> configurationType;
        private @Nullable Output<Integer> parallelism;
        private @Nullable Output<Integer> parallelismPerKpu;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingEnabled = defaults.autoScalingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.parallelism = defaults.parallelism;
    	      this.parallelismPerKpu = defaults.parallelismPerKpu;
        }

        public Builder autoScalingEnabled(@Nullable Output<Boolean> autoScalingEnabled) {
            this.autoScalingEnabled = autoScalingEnabled;
            return this;
        }
        public Builder autoScalingEnabled(@Nullable Boolean autoScalingEnabled) {
            this.autoScalingEnabled = Codegen.ofNullable(autoScalingEnabled);
            return this;
        }
        public Builder configurationType(Output<String> configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }
        public Builder configurationType(String configurationType) {
            this.configurationType = Output.of(Objects.requireNonNull(configurationType));
            return this;
        }
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = Codegen.ofNullable(parallelism);
            return this;
        }
        public Builder parallelismPerKpu(@Nullable Output<Integer> parallelismPerKpu) {
            this.parallelismPerKpu = parallelismPerKpu;
            return this;
        }
        public Builder parallelismPerKpu(@Nullable Integer parallelismPerKpu) {
            this.parallelismPerKpu = Codegen.ofNullable(parallelismPerKpu);
            return this;
        }        public ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs(autoScalingEnabled, configurationType, parallelism, parallelismPerKpu);
        }
    }
}
