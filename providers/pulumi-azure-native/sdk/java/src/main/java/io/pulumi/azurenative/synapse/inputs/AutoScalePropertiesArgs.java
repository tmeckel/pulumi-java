// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Auto-scaling properties of a Big Data pool powered by Apache Spark
 * 
 */
public final class AutoScalePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoScalePropertiesArgs Empty = new AutoScalePropertiesArgs();

    /**
     * Whether automatic scaling is enabled for the Big Data pool.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The maximum number of nodes the Big Data pool can support.
     * 
     */
    @InputImport(name="maxNodeCount")
      private final @Nullable Input<Integer> maxNodeCount;

    public Input<Integer> getMaxNodeCount() {
        return this.maxNodeCount == null ? Input.empty() : this.maxNodeCount;
    }

    /**
     * The minimum number of nodes the Big Data pool can support.
     * 
     */
    @InputImport(name="minNodeCount")
      private final @Nullable Input<Integer> minNodeCount;

    public Input<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Input.empty() : this.minNodeCount;
    }

    public AutoScalePropertiesArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> maxNodeCount,
        @Nullable Input<Integer> minNodeCount) {
        this.enabled = enabled;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    private AutoScalePropertiesArgs() {
        this.enabled = Input.empty();
        this.maxNodeCount = Input.empty();
        this.minNodeCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> maxNodeCount;
        private @Nullable Input<Integer> minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder maxNodeCount(@Nullable Input<Integer> maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }

        public Builder maxNodeCount(@Nullable Integer maxNodeCount) {
            this.maxNodeCount = Input.ofNullable(maxNodeCount);
            return this;
        }

        public Builder minNodeCount(@Nullable Input<Integer> minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public Builder minNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = Input.ofNullable(minNodeCount);
            return this;
        }
        public AutoScalePropertiesArgs build() {
            return new AutoScalePropertiesArgs(enabled, maxNodeCount, minNodeCount);
        }
    }
}
