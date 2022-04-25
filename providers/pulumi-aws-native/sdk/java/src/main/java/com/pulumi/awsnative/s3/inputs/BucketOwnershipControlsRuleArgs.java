// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketOwnershipControlsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsRuleArgs Empty = new BucketOwnershipControlsRuleArgs();

    /**
     * Specifies an object ownership rule.
     * 
     */
    @Import(name="objectOwnership")
    private @Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership;

    /**
     * @return Specifies an object ownership rule.
     * 
     */
    public Optional<Output<BucketOwnershipControlsRuleObjectOwnership>> objectOwnership() {
        return Optional.ofNullable(this.objectOwnership);
    }

    private BucketOwnershipControlsRuleArgs() {}

    private BucketOwnershipControlsRuleArgs(BucketOwnershipControlsRuleArgs $) {
        this.objectOwnership = $.objectOwnership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketOwnershipControlsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketOwnershipControlsRuleArgs $;

        public Builder() {
            $ = new BucketOwnershipControlsRuleArgs();
        }

        public Builder(BucketOwnershipControlsRuleArgs defaults) {
            $ = new BucketOwnershipControlsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectOwnership Specifies an object ownership rule.
         * 
         * @return builder
         * 
         */
        public Builder objectOwnership(@Nullable Output<BucketOwnershipControlsRuleObjectOwnership> objectOwnership) {
            $.objectOwnership = objectOwnership;
            return this;
        }

        /**
         * @param objectOwnership Specifies an object ownership rule.
         * 
         * @return builder
         * 
         */
        public Builder objectOwnership(BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            return objectOwnership(Output.of(objectOwnership));
        }

        public BucketOwnershipControlsRuleArgs build() {
            return $;
        }
    }

}
