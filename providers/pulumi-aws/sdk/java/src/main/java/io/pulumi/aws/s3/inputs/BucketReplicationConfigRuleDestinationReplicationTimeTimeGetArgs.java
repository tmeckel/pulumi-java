// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs Empty = new BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs();

    /**
     * Time in minutes. Valid values: `15`.
     * 
     */
    @Import(name="minutes", required=true)
      private final Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes;
    }

    public BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs(Output<Integer> minutes) {
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs() {
        this.minutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder minutes(Output<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Output.of(Objects.requireNonNull(minutes));
            return this;
        }        public BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs build() {
            return new BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs(minutes);
        }
    }
}
