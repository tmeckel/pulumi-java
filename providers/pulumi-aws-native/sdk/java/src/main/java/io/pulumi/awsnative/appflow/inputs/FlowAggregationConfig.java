// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowAggregationType;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowAggregationConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowAggregationConfig Empty = new FlowAggregationConfig();

    @InputImport(name="aggregationType")
      private final @Nullable FlowAggregationType aggregationType;

    public Optional<FlowAggregationType> getAggregationType() {
        return this.aggregationType == null ? Optional.empty() : Optional.ofNullable(this.aggregationType);
    }

    public FlowAggregationConfig(@Nullable FlowAggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    private FlowAggregationConfig() {
        this.aggregationType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAggregationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAggregationType aggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAggregationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationType = defaults.aggregationType;
        }

        public Builder aggregationType(@Nullable FlowAggregationType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }
        public FlowAggregationConfig build() {
            return new FlowAggregationConfig(aggregationType);
        }
    }
}
