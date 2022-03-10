// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketOwnershipControlsRule extends io.pulumi.resources.InvokeArgs {

    public static final BucketOwnershipControlsRule Empty = new BucketOwnershipControlsRule();

    /**
     * Specifies an object ownership rule.
     * 
     */
    @InputImport(name="objectOwnership")
      private final @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

    public Optional<BucketOwnershipControlsRuleObjectOwnership> getObjectOwnership() {
        return this.objectOwnership == null ? Optional.empty() : Optional.ofNullable(this.objectOwnership);
    }

    public BucketOwnershipControlsRule(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    private BucketOwnershipControlsRule() {
        this.objectOwnership = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder objectOwnership(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }
        public BucketOwnershipControlsRule build() {
            return new BucketOwnershipControlsRule(objectOwnership);
        }
    }
}
