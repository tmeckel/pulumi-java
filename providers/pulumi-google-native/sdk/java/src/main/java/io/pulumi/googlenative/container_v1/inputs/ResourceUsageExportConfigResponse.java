// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.BigQueryDestinationResponse;
import io.pulumi.googlenative.container_v1.inputs.ConsumptionMeteringConfigResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for exporting cluster resource usages.
 * 
 */
public final class ResourceUsageExportConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceUsageExportConfigResponse Empty = new ResourceUsageExportConfigResponse();

    /**
     * Configuration to use BigQuery as usage export destination.
     * 
     */
    @InputImport(name="bigqueryDestination", required=true)
    private final BigQueryDestinationResponse bigqueryDestination;

    public BigQueryDestinationResponse getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Configuration to enable resource consumption metering.
     * 
     */
    @InputImport(name="consumptionMeteringConfig", required=true)
    private final ConsumptionMeteringConfigResponse consumptionMeteringConfig;

    public ConsumptionMeteringConfigResponse getConsumptionMeteringConfig() {
        return this.consumptionMeteringConfig;
    }

    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    @InputImport(name="enableNetworkEgressMetering", required=true)
    private final Boolean enableNetworkEgressMetering;

    public Boolean getEnableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering;
    }

    public ResourceUsageExportConfigResponse(
        BigQueryDestinationResponse bigqueryDestination,
        ConsumptionMeteringConfigResponse consumptionMeteringConfig,
        Boolean enableNetworkEgressMetering) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
        this.consumptionMeteringConfig = Objects.requireNonNull(consumptionMeteringConfig, "expected parameter 'consumptionMeteringConfig' to be non-null");
        this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering, "expected parameter 'enableNetworkEgressMetering' to be non-null");
    }

    private ResourceUsageExportConfigResponse() {
        this.bigqueryDestination = null;
        this.consumptionMeteringConfig = null;
        this.enableNetworkEgressMetering = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceUsageExportConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigQueryDestinationResponse bigqueryDestination;
        private ConsumptionMeteringConfigResponse consumptionMeteringConfig;
        private Boolean enableNetworkEgressMetering;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceUsageExportConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.consumptionMeteringConfig = defaults.consumptionMeteringConfig;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
        }

        public Builder setBigqueryDestination(BigQueryDestinationResponse bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setConsumptionMeteringConfig(ConsumptionMeteringConfigResponse consumptionMeteringConfig) {
            this.consumptionMeteringConfig = Objects.requireNonNull(consumptionMeteringConfig);
            return this;
        }

        public Builder setEnableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering);
            return this;
        }

        public ResourceUsageExportConfigResponse build() {
            return new ResourceUsageExportConfigResponse(bigqueryDestination, consumptionMeteringConfig, enableNetworkEgressMetering);
        }
    }
}
