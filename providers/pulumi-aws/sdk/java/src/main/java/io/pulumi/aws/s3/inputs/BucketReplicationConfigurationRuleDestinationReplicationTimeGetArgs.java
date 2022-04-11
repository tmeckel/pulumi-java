// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs Empty = new BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs();

    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    @Import(name="minutes")
      private final @Nullable Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes == null ? Codegen.empty() : this.minutes;
    }

    /**
     * The status of RTC. Either `Enabled` or `Disabled`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs(
        @Nullable Output<Integer> minutes,
        @Nullable Output<String> status) {
        this.minutes = minutes;
        this.status = status;
    }

    private BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs() {
        this.minutes = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minutes;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.status = defaults.status;
        }

        public Builder minutes(@Nullable Output<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = Codegen.ofNullable(minutes);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs build() {
            return new BucketReplicationConfigurationRuleDestinationReplicationTimeGetArgs(minutes, status);
        }
    }
}
