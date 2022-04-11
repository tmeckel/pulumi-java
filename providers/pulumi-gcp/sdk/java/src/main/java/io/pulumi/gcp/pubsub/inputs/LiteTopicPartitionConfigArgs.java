// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicPartitionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicPartitionConfigArgs Empty = new LiteTopicPartitionConfigArgs();

    /**
     * The capacity configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<LiteTopicPartitionConfigCapacityArgs> capacity;

    public Output<LiteTopicPartitionConfigCapacityArgs> getCapacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * The number of partitions in the topic. Must be at least 1.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    public LiteTopicPartitionConfigArgs(
        @Nullable Output<LiteTopicPartitionConfigCapacityArgs> capacity,
        Output<Integer> count) {
        this.capacity = capacity;
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
    }

    private LiteTopicPartitionConfigArgs() {
        this.capacity = Codegen.empty();
        this.count = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LiteTopicPartitionConfigCapacityArgs> capacity;
        private Output<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder capacity(@Nullable Output<LiteTopicPartitionConfigCapacityArgs> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable LiteTopicPartitionConfigCapacityArgs capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }        public LiteTopicPartitionConfigArgs build() {
            return new LiteTopicPartitionConfigArgs(capacity, count);
        }
    }
}
