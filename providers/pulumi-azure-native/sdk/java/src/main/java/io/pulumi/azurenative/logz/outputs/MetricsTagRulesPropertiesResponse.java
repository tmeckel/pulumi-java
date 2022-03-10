// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.MetricRulesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricsTagRulesPropertiesResponse {
    private final @Nullable List<MetricRulesResponse> metricRules;
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    private final String provisioningState;
    /**
     * Flag specifying if metrics from Azure resources should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendMetrics;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;

    @OutputCustomType.Constructor
    private MetricsTagRulesPropertiesResponse(
        @OutputCustomType.Parameter("metricRules") @Nullable List<MetricRulesResponse> metricRules,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sendMetrics") @Nullable Boolean sendMetrics,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData) {
        this.metricRules = metricRules;
        this.provisioningState = provisioningState;
        this.sendMetrics = sendMetrics;
        this.systemData = systemData;
    }

    public List<MetricRulesResponse> getMetricRules() {
        return this.metricRules == null ? List.of() : this.metricRules;
    }
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Flag specifying if metrics from Azure resources should be sent for the Monitor resource.
     * 
    */
    public Optional<Boolean> getSendMetrics() {
        return Optional.ofNullable(this.sendMetrics);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricRulesResponse> metricRules;
        private String provisioningState;
        private @Nullable Boolean sendMetrics;
        private SystemDataResponse systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricsTagRulesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricRules = defaults.metricRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sendMetrics = defaults.sendMetrics;
    	      this.systemData = defaults.systemData;
        }

        public Builder metricRules(@Nullable List<MetricRulesResponse> metricRules) {
            this.metricRules = metricRules;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sendMetrics(@Nullable Boolean sendMetrics) {
            this.sendMetrics = sendMetrics;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public MetricsTagRulesPropertiesResponse build() {
            return new MetricsTagRulesPropertiesResponse(metricRules, provisioningState, sendMetrics, systemData);
        }
    }
}
