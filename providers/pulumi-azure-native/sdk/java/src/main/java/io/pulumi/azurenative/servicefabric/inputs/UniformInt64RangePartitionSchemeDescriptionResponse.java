// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions.
 * 
 */
public final class UniformInt64RangePartitionSchemeDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final UniformInt64RangePartitionSchemeDescriptionResponse Empty = new UniformInt64RangePartitionSchemeDescriptionResponse();

    /**
     * The number of partitions.
     * 
     */
    @InputImport(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @InputImport(name="highKey", required=true)
      private final String highKey;

    public String getHighKey() {
        return this.highKey;
    }

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @InputImport(name="lowKey", required=true)
      private final String lowKey;

    public String getLowKey() {
        return this.lowKey;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'UniformInt64Range'.
     * 
     */
    @InputImport(name="partitionScheme", required=true)
      private final String partitionScheme;

    public String getPartitionScheme() {
        return this.partitionScheme;
    }

    public UniformInt64RangePartitionSchemeDescriptionResponse(
        Integer count,
        String highKey,
        String lowKey,
        String partitionScheme) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.highKey = Objects.requireNonNull(highKey, "expected parameter 'highKey' to be non-null");
        this.lowKey = Objects.requireNonNull(lowKey, "expected parameter 'lowKey' to be non-null");
        this.partitionScheme = Objects.requireNonNull(partitionScheme, "expected parameter 'partitionScheme' to be non-null");
    }

    private UniformInt64RangePartitionSchemeDescriptionResponse() {
        this.count = null;
        this.highKey = null;
        this.lowKey = null;
        this.partitionScheme = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String highKey;
        private String lowKey;
        private String partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.highKey = defaults.highKey;
    	      this.lowKey = defaults.lowKey;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder highKey(String highKey) {
            this.highKey = Objects.requireNonNull(highKey);
            return this;
        }

        public Builder lowKey(String lowKey) {
            this.lowKey = Objects.requireNonNull(lowKey);
            return this;
        }

        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }
        public UniformInt64RangePartitionSchemeDescriptionResponse build() {
            return new UniformInt64RangePartitionSchemeDescriptionResponse(count, highKey, lowKey, partitionScheme);
        }
    }
}
