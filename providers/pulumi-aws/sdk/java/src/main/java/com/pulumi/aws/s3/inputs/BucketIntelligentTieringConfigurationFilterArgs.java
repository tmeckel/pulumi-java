// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationFilterArgs Empty = new BucketIntelligentTieringConfigurationFilterArgs();

    /**
     * An object key name prefix that identifies the subset of objects to which the configuration applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An object key name prefix that identifies the subset of objects to which the configuration applies.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * All of these tags must exist in the object&#39;s tag set in order for the configuration to apply.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return All of these tags must exist in the object&#39;s tag set in order for the configuration to apply.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BucketIntelligentTieringConfigurationFilterArgs() {}

    private BucketIntelligentTieringConfigurationFilterArgs(BucketIntelligentTieringConfigurationFilterArgs $) {
        this.prefix = $.prefix;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketIntelligentTieringConfigurationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIntelligentTieringConfigurationFilterArgs $;

        public Builder() {
            $ = new BucketIntelligentTieringConfigurationFilterArgs();
        }

        public Builder(BucketIntelligentTieringConfigurationFilterArgs defaults) {
            $ = new BucketIntelligentTieringConfigurationFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix An object key name prefix that identifies the subset of objects to which the configuration applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An object key name prefix that identifies the subset of objects to which the configuration applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tags All of these tags must exist in the object&#39;s tag set in order for the configuration to apply.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags All of these tags must exist in the object&#39;s tag set in order for the configuration to apply.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BucketIntelligentTieringConfigurationFilterArgs build() {
            return $;
        }
    }

}
