// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Holds the available configuration options for an Azure ML web service endpoint.
 * 
 */
public final class RealtimeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeConfigurationArgs Empty = new RealtimeConfigurationArgs();

    /**
     * Specifies the maximum concurrent calls that can be made to the web service. Minimum value: 4, Maximum value: 200.
     * 
     */
    @Import(name="maxConcurrentCalls")
      private final @Nullable Output<Integer> maxConcurrentCalls;

    public Output<Integer> getMaxConcurrentCalls() {
        return this.maxConcurrentCalls == null ? Codegen.empty() : this.maxConcurrentCalls;
    }

    public RealtimeConfigurationArgs(@Nullable Output<Integer> maxConcurrentCalls) {
        this.maxConcurrentCalls = maxConcurrentCalls;
    }

    private RealtimeConfigurationArgs() {
        this.maxConcurrentCalls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConcurrentCalls;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentCalls = defaults.maxConcurrentCalls;
        }

        public Builder maxConcurrentCalls(@Nullable Output<Integer> maxConcurrentCalls) {
            this.maxConcurrentCalls = maxConcurrentCalls;
            return this;
        }
        public Builder maxConcurrentCalls(@Nullable Integer maxConcurrentCalls) {
            this.maxConcurrentCalls = Codegen.ofNullable(maxConcurrentCalls);
            return this;
        }        public RealtimeConfigurationArgs build() {
            return new RealtimeConfigurationArgs(maxConcurrentCalls);
        }
    }
}
