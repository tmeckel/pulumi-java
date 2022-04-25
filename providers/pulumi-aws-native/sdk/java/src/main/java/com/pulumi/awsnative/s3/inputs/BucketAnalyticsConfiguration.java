// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketStorageClassAnalysis;
import com.pulumi.awsnative.s3.inputs.BucketTagFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
 * 
 */
public final class BucketAnalyticsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketAnalyticsConfiguration Empty = new BucketAnalyticsConfiguration();

    /**
     * The ID that identifies the analytics configuration.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID that identifies the analytics configuration.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The prefix that an object must have to be included in the analytics results.
     * 
     */
    @Import(name="prefix")
    private @Nullable String prefix;

    /**
     * @return The prefix that an object must have to be included in the analytics results.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="storageClassAnalysis", required=true)
    private BucketStorageClassAnalysis storageClassAnalysis;

    public BucketStorageClassAnalysis storageClassAnalysis() {
        return this.storageClassAnalysis;
    }

    @Import(name="tagFilters")
    private @Nullable List<BucketTagFilter> tagFilters;

    public Optional<List<BucketTagFilter>> tagFilters() {
        return Optional.ofNullable(this.tagFilters);
    }

    private BucketAnalyticsConfiguration() {}

    private BucketAnalyticsConfiguration(BucketAnalyticsConfiguration $) {
        this.id = $.id;
        this.prefix = $.prefix;
        this.storageClassAnalysis = $.storageClassAnalysis;
        this.tagFilters = $.tagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAnalyticsConfiguration $;

        public Builder() {
            $ = new BucketAnalyticsConfiguration();
        }

        public Builder(BucketAnalyticsConfiguration defaults) {
            $ = new BucketAnalyticsConfiguration(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID that identifies the analytics configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param prefix The prefix that an object must have to be included in the analytics results.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder storageClassAnalysis(BucketStorageClassAnalysis storageClassAnalysis) {
            $.storageClassAnalysis = storageClassAnalysis;
            return this;
        }

        public Builder tagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            $.tagFilters = tagFilters;
            return this;
        }

        public Builder tagFilters(BucketTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }

        public BucketAnalyticsConfiguration build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.storageClassAnalysis = Objects.requireNonNull($.storageClassAnalysis, "expected parameter 'storageClassAnalysis' to be non-null");
            return $;
        }
    }

}
