// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.gameservices_v1beta.inputs.LabelSelectorArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.ScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Autoscaling config for an Agones fleet.
 * 
 */
public final class ScalingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingConfigArgs Empty = new ScalingConfigArgs();

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    @Import(name="fleetAutoscalerSpec", required=true)
      private final Output<String> fleetAutoscalerSpec;

    public Output<String> getFleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }

    /**
     * The name of the Scaling Config
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    @Import(name="schedules")
      private final @Nullable Output<List<ScheduleArgs>> schedules;

    public Output<List<ScheduleArgs>> getSchedules() {
        return this.schedules == null ? Codegen.empty() : this.schedules;
    }

    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    @Import(name="selectors")
      private final @Nullable Output<List<LabelSelectorArgs>> selectors;

    public Output<List<LabelSelectorArgs>> getSelectors() {
        return this.selectors == null ? Codegen.empty() : this.selectors;
    }

    public ScalingConfigArgs(
        Output<String> fleetAutoscalerSpec,
        Output<String> name,
        @Nullable Output<List<ScheduleArgs>> schedules,
        @Nullable Output<List<LabelSelectorArgs>> selectors) {
        this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec, "expected parameter 'fleetAutoscalerSpec' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedules = schedules;
        this.selectors = selectors;
    }

    private ScalingConfigArgs() {
        this.fleetAutoscalerSpec = Codegen.empty();
        this.name = Codegen.empty();
        this.schedules = Codegen.empty();
        this.selectors = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fleetAutoscalerSpec;
        private Output<String> name;
        private @Nullable Output<List<ScheduleArgs>> schedules;
        private @Nullable Output<List<LabelSelectorArgs>> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder fleetAutoscalerSpec(Output<String> fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }
        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Output.of(Objects.requireNonNull(fleetAutoscalerSpec));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder schedules(@Nullable Output<List<ScheduleArgs>> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(@Nullable List<ScheduleArgs> schedules) {
            this.schedules = Codegen.ofNullable(schedules);
            return this;
        }
        public Builder schedules(ScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder selectors(@Nullable Output<List<LabelSelectorArgs>> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(@Nullable List<LabelSelectorArgs> selectors) {
            this.selectors = Codegen.ofNullable(selectors);
            return this;
        }
        public Builder selectors(LabelSelectorArgs... selectors) {
            return selectors(List.of(selectors));
        }        public ScalingConfigArgs build() {
            return new ScalingConfigArgs(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
