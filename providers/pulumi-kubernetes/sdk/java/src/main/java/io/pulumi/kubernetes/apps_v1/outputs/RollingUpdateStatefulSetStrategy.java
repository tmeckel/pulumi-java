// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RollingUpdateStatefulSetStrategy {
    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
     * 
     */
    private final @Nullable Integer partition;

    @OutputCustomType.Constructor
    private RollingUpdateStatefulSetStrategy(@OutputCustomType.Parameter("partition") @Nullable Integer partition) {
        this.partition = partition;
    }

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
     * 
    */
    public Optional<Integer> getPartition() {
        return Optional.ofNullable(this.partition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateStatefulSetStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer partition;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateStatefulSetStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
        }

        public Builder partition(@Nullable Integer partition) {
            this.partition = partition;
            return this;
        }
        public RollingUpdateStatefulSetStrategy build() {
            return new RollingUpdateStatefulSetStrategy(partition);
        }
    }
}
