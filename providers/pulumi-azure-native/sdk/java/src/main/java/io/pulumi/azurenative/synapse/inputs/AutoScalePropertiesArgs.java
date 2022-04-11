// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The maximum number of nodes the Big Data pool can support.
     * 
     */
    @Import(name="maxNodeCount")
      private final @Nullable Output<Integer> maxNodeCount;

    public Output<Integer> getMaxNodeCount() {
        return this.maxNodeCount == null ? Codegen.empty() : this.maxNodeCount;
    }

    /**
     * The minimum number of nodes the Big Data pool can support.
     * 
     */
    @Import(name="minNodeCount")
      private final @Nullable Output<Integer> minNodeCount;

    public Output<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Codegen.empty() : this.minNodeCount;
    }

    public AutoScalePropertiesArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> maxNodeCount,
        @Nullable Output<Integer> minNodeCount) {
        this.enabled = enabled;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    private AutoScalePropertiesArgs() {
        this.enabled = Codegen.empty();
        this.maxNodeCount = Codegen.empty();
        this.minNodeCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> maxNodeCount;
        private @Nullable Output<Integer> minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder maxNodeCount(@Nullable Output<Integer> maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }
        public Builder maxNodeCount(@Nullable Integer maxNodeCount) {
            this.maxNodeCount = Codegen.ofNullable(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(@Nullable Output<Integer> minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }
        public Builder minNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = Codegen.ofNullable(minNodeCount);
            return this;
        }        public AutoScalePropertiesArgs build() {
            return new AutoScalePropertiesArgs(enabled, maxNodeCount, minNodeCount);
        }
    }
}
