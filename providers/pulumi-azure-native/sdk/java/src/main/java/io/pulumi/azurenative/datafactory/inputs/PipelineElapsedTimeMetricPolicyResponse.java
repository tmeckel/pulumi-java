// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pipeline ElapsedTime Metric Policy.
 * 
 */
public final class PipelineElapsedTimeMetricPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineElapsedTimeMetricPolicyResponse Empty = new PipelineElapsedTimeMetricPolicyResponse();

    /**
     * TimeSpan value, after which an Azure Monitoring Metric is fired.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Object duration;

    public Optional<Object> getDuration() {
        return this.duration == null ? Optional.empty() : Optional.ofNullable(this.duration);
    }

    public PipelineElapsedTimeMetricPolicyResponse(@Nullable Object duration) {
        this.duration = duration;
    }

    private PipelineElapsedTimeMetricPolicyResponse() {
        this.duration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object duration;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder duration(@Nullable Object duration) {
            this.duration = duration;
            return this;
        }
        public PipelineElapsedTimeMetricPolicyResponse build() {
            return new PipelineElapsedTimeMetricPolicyResponse(duration);
        }
    }
}
