// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for a topic's message retention.
 * 
 */
public final class RetentionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionConfigArgs Empty = new RetentionConfigArgs();

    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic's partitions grows beyond this value, older messages will be dropped to make room for newer ones, regardless of the value of `period`.
     * 
     */
    @Import(name="perPartitionBytes")
      private final @Nullable Output<String> perPartitionBytes;

    public Output<String> getPerPartitionBytes() {
        return this.perPartitionBytes == null ? Codegen.empty() : this.perPartitionBytes;
    }

    /**
     * How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> getPeriod() {
        return this.period == null ? Codegen.empty() : this.period;
    }

    public RetentionConfigArgs(
        @Nullable Output<String> perPartitionBytes,
        @Nullable Output<String> period) {
        this.perPartitionBytes = perPartitionBytes;
        this.period = period;
    }

    private RetentionConfigArgs() {
        this.perPartitionBytes = Codegen.empty();
        this.period = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> perPartitionBytes;
        private @Nullable Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder perPartitionBytes(@Nullable Output<String> perPartitionBytes) {
            this.perPartitionBytes = perPartitionBytes;
            return this;
        }
        public Builder perPartitionBytes(@Nullable String perPartitionBytes) {
            this.perPartitionBytes = Codegen.ofNullable(perPartitionBytes);
            return this;
        }
        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = Codegen.ofNullable(period);
            return this;
        }        public RetentionConfigArgs build() {
            return new RetentionConfigArgs(perPartitionBytes, period);
        }
    }
}
