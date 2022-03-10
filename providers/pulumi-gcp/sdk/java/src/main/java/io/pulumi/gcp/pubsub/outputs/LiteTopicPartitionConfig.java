// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.pubsub.outputs.LiteTopicPartitionConfigCapacity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiteTopicPartitionConfig {
    /**
     * The capacity configuration.
     * Structure is documented below.
     * 
     */
    private final @Nullable LiteTopicPartitionConfigCapacity capacity;
    /**
     * The number of partitions in the topic. Must be at least 1.
     * 
     */
    private final Integer count;

    @OutputCustomType.Constructor
    private LiteTopicPartitionConfig(
        @OutputCustomType.Parameter("capacity") @Nullable LiteTopicPartitionConfigCapacity capacity,
        @OutputCustomType.Parameter("count") Integer count) {
        this.capacity = capacity;
        this.count = count;
    }

    /**
     * The capacity configuration.
     * Structure is documented below.
     * 
    */
    public Optional<LiteTopicPartitionConfigCapacity> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The number of partitions in the topic. Must be at least 1.
     * 
    */
    public Integer getCount() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiteTopicPartitionConfigCapacity capacity;
        private Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder capacity(@Nullable LiteTopicPartitionConfigCapacity capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public LiteTopicPartitionConfig build() {
            return new LiteTopicPartitionConfig(capacity, count);
        }
    }
}
