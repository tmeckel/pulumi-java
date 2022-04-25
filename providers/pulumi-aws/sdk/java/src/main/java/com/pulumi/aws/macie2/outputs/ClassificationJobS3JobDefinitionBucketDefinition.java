// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClassificationJobS3JobDefinitionBucketDefinition {
    /**
     * @return The unique identifier for the AWS account that owns the buckets.
     * 
     */
    private final String accountId;
    /**
     * @return An array that lists the names of the buckets.
     * 
     */
    private final List<String> buckets;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionBucketDefinition(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("buckets") List<String> buckets) {
        this.accountId = accountId;
        this.buckets = buckets;
    }

    /**
     * @return The unique identifier for the AWS account that owns the buckets.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return An array that lists the names of the buckets.
     * 
     */
    public List<String> buckets() {
        return this.buckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private List<String> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.buckets = defaults.buckets;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder buckets(List<String> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public Builder buckets(String... buckets) {
            return buckets(List.of(buckets));
        }        public ClassificationJobS3JobDefinitionBucketDefinition build() {
            return new ClassificationJobS3JobDefinitionBucketDefinition(accountId, buckets);
        }
    }
}
