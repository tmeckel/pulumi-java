// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This structure defines the metrics that will be streamed.
 * 
 */
public final class MetricStreamFilter extends io.pulumi.resources.InvokeArgs {

    public static final MetricStreamFilter Empty = new MetricStreamFilter();

    /**
     * Only metrics with Namespace matching this value will be streamed.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public MetricStreamFilter(String namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private MetricStreamFilter() {
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public MetricStreamFilter build() {
            return new MetricStreamFilter(namespace);
        }
    }
}
