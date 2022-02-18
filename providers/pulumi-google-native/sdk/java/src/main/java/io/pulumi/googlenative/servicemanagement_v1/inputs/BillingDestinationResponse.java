// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration of a specific billing destination (Currently only support bill against consumer project).
 * 
 */
public final class BillingDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BillingDestinationResponse Empty = new BillingDestinationResponse();

    /**
     * Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    @InputImport(name="metrics", required=true)
    private final List<String> metrics;

    public List<String> getMetrics() {
        return this.metrics;
    }

    /**
     * The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    @InputImport(name="monitoredResource", required=true)
    private final String monitoredResource;

    public String getMonitoredResource() {
        return this.monitoredResource;
    }

    public BillingDestinationResponse(
        List<String> metrics,
        String monitoredResource) {
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.monitoredResource = Objects.requireNonNull(monitoredResource, "expected parameter 'monitoredResource' to be non-null");
    }

    private BillingDestinationResponse() {
        this.metrics = List.of();
        this.monitoredResource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> metrics;
        private String monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder setMetrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setMonitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }

        public BillingDestinationResponse build() {
            return new BillingDestinationResponse(metrics, monitoredResource);
        }
    }
}
