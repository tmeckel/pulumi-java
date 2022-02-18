// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.inputs.LabelSelectorResponse;
import io.pulumi.googlenative.gameservices_v1.inputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Autoscaling config for an Agones fleet.
 * 
 */
public final class ScalingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScalingConfigResponse Empty = new ScalingConfigResponse();

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    @InputImport(name="fleetAutoscalerSpec", required=true)
    private final String fleetAutoscalerSpec;

    public String getFleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }

    /**
     * The name of the Scaling Config
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    @InputImport(name="schedules", required=true)
    private final List<ScheduleResponse> schedules;

    public List<ScheduleResponse> getSchedules() {
        return this.schedules;
    }

    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    @InputImport(name="selectors", required=true)
    private final List<LabelSelectorResponse> selectors;

    public List<LabelSelectorResponse> getSelectors() {
        return this.selectors;
    }

    public ScalingConfigResponse(
        String fleetAutoscalerSpec,
        String name,
        List<ScheduleResponse> schedules,
        List<LabelSelectorResponse> selectors) {
        this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec, "expected parameter 'fleetAutoscalerSpec' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedules = Objects.requireNonNull(schedules, "expected parameter 'schedules' to be non-null");
        this.selectors = Objects.requireNonNull(selectors, "expected parameter 'selectors' to be non-null");
    }

    private ScalingConfigResponse() {
        this.fleetAutoscalerSpec = null;
        this.name = null;
        this.schedules = List.of();
        this.selectors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetAutoscalerSpec;
        private String name;
        private List<ScheduleResponse> schedules;
        private List<LabelSelectorResponse> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder setFleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchedules(List<ScheduleResponse> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }

        public Builder setSelectors(List<LabelSelectorResponse> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }

        public ScalingConfigResponse build() {
            return new ScalingConfigResponse(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
