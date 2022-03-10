// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.outputs;

import io.pulumi.awsnative.autoscaling.outputs.WarmPoolInstanceReusePolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWarmPoolResult {
    private final @Nullable WarmPoolInstanceReusePolicy instanceReusePolicy;
    private final @Nullable Integer maxGroupPreparedCapacity;
    private final @Nullable Integer minSize;
    private final @Nullable String poolState;

    @OutputCustomType.Constructor
    private GetWarmPoolResult(
        @OutputCustomType.Parameter("instanceReusePolicy") @Nullable WarmPoolInstanceReusePolicy instanceReusePolicy,
        @OutputCustomType.Parameter("maxGroupPreparedCapacity") @Nullable Integer maxGroupPreparedCapacity,
        @OutputCustomType.Parameter("minSize") @Nullable Integer minSize,
        @OutputCustomType.Parameter("poolState") @Nullable String poolState) {
        this.instanceReusePolicy = instanceReusePolicy;
        this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
        this.minSize = minSize;
        this.poolState = poolState;
    }

    public Optional<WarmPoolInstanceReusePolicy> getInstanceReusePolicy() {
        return Optional.ofNullable(this.instanceReusePolicy);
    }
    public Optional<Integer> getMaxGroupPreparedCapacity() {
        return Optional.ofNullable(this.maxGroupPreparedCapacity);
    }
    public Optional<Integer> getMinSize() {
        return Optional.ofNullable(this.minSize);
    }
    public Optional<String> getPoolState() {
        return Optional.ofNullable(this.poolState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWarmPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WarmPoolInstanceReusePolicy instanceReusePolicy;
        private @Nullable Integer maxGroupPreparedCapacity;
        private @Nullable Integer minSize;
        private @Nullable String poolState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWarmPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceReusePolicy = defaults.instanceReusePolicy;
    	      this.maxGroupPreparedCapacity = defaults.maxGroupPreparedCapacity;
    	      this.minSize = defaults.minSize;
    	      this.poolState = defaults.poolState;
        }

        public Builder instanceReusePolicy(@Nullable WarmPoolInstanceReusePolicy instanceReusePolicy) {
            this.instanceReusePolicy = instanceReusePolicy;
            return this;
        }

        public Builder maxGroupPreparedCapacity(@Nullable Integer maxGroupPreparedCapacity) {
            this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }

        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder poolState(@Nullable String poolState) {
            this.poolState = poolState;
            return this;
        }
        public GetWarmPoolResult build() {
            return new GetWarmPoolResult(instanceReusePolicy, maxGroupPreparedCapacity, minSize, poolState);
        }
    }
}
