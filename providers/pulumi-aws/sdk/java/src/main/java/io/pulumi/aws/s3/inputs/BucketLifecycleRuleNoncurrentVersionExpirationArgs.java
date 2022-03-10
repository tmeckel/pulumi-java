// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleNoncurrentVersionExpirationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleNoncurrentVersionExpirationArgs Empty = new BucketLifecycleRuleNoncurrentVersionExpirationArgs();

    /**
     * Specifies the number of days noncurrent object versions expire.
     * 
     */
    @InputImport(name="days")
      private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    public BucketLifecycleRuleNoncurrentVersionExpirationArgs(@Nullable Input<Integer> days) {
        this.days = days;
    }

    private BucketLifecycleRuleNoncurrentVersionExpirationArgs() {
        this.days = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleNoncurrentVersionExpirationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        public Builder days(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }
        public BucketLifecycleRuleNoncurrentVersionExpirationArgs build() {
            return new BucketLifecycleRuleNoncurrentVersionExpirationArgs(days);
        }
    }
}
