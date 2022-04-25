// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.inputs;

import com.pulumi.awsnative.s3outposts.inputs.BucketFilterAndOperator;
import com.pulumi.awsnative.s3outposts.inputs.BucketFilterTag;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container for the filter of the lifecycle rule.
 * 
 */
public final class BucketRuleFilterProperties extends com.pulumi.resources.InvokeArgs {

    public static final BucketRuleFilterProperties Empty = new BucketRuleFilterProperties();

    /**
     * The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
     * 
     */
    @Import(name="andOperator")
    private @Nullable BucketFilterAndOperator andOperator;

    /**
     * @return The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
     * 
     */
    public Optional<BucketFilterAndOperator> andOperator() {
        return Optional.ofNullable(this.andOperator);
    }

    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable String prefix;

    /**
     * @return Object key prefix that identifies one or more objects to which this rule applies.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
     * 
     */
    @Import(name="tag")
    private @Nullable BucketFilterTag tag;

    /**
     * @return Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
     * 
     */
    public Optional<BucketFilterTag> tag() {
        return Optional.ofNullable(this.tag);
    }

    private BucketRuleFilterProperties() {}

    private BucketRuleFilterProperties(BucketRuleFilterProperties $) {
        this.andOperator = $.andOperator;
        this.prefix = $.prefix;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketRuleFilterProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRuleFilterProperties $;

        public Builder() {
            $ = new BucketRuleFilterProperties();
        }

        public Builder(BucketRuleFilterProperties defaults) {
            $ = new BucketRuleFilterProperties(Objects.requireNonNull(defaults));
        }

        /**
         * @param andOperator The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
         * 
         * @return builder
         * 
         */
        public Builder andOperator(@Nullable BucketFilterAndOperator andOperator) {
            $.andOperator = andOperator;
            return this;
        }

        /**
         * @param prefix Object key prefix that identifies one or more objects to which this rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param tag Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable BucketFilterTag tag) {
            $.tag = tag;
            return this;
        }

        public BucketRuleFilterProperties build() {
            return $;
        }
    }

}
