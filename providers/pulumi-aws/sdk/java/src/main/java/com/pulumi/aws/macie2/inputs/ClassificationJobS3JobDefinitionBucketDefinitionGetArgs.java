// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClassificationJobS3JobDefinitionBucketDefinitionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionBucketDefinitionGetArgs Empty = new ClassificationJobS3JobDefinitionBucketDefinitionGetArgs();

    /**
     * The unique identifier for the AWS account that owns the buckets.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The unique identifier for the AWS account that owns the buckets.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * An array that lists the names of the buckets.
     * 
     */
    @Import(name="buckets", required=true)
    private Output<List<String>> buckets;

    /**
     * @return An array that lists the names of the buckets.
     * 
     */
    public Output<List<String>> buckets() {
        return this.buckets;
    }

    private ClassificationJobS3JobDefinitionBucketDefinitionGetArgs() {}

    private ClassificationJobS3JobDefinitionBucketDefinitionGetArgs(ClassificationJobS3JobDefinitionBucketDefinitionGetArgs $) {
        this.accountId = $.accountId;
        this.buckets = $.buckets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionBucketDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionBucketDefinitionGetArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionBucketDefinitionGetArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionBucketDefinitionGetArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionBucketDefinitionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The unique identifier for the AWS account that owns the buckets.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The unique identifier for the AWS account that owns the buckets.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param buckets An array that lists the names of the buckets.
         * 
         * @return builder
         * 
         */
        public Builder buckets(Output<List<String>> buckets) {
            $.buckets = buckets;
            return this;
        }

        /**
         * @param buckets An array that lists the names of the buckets.
         * 
         * @return builder
         * 
         */
        public Builder buckets(List<String> buckets) {
            return buckets(Output.of(buckets));
        }

        /**
         * @param buckets An array that lists the names of the buckets.
         * 
         * @return builder
         * 
         */
        public Builder buckets(String... buckets) {
            return buckets(List.of(buckets));
        }

        public ClassificationJobS3JobDefinitionBucketDefinitionGetArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.buckets = Objects.requireNonNull($.buckets, "expected parameter 'buckets' to be non-null");
            return $;
        }
    }

}
