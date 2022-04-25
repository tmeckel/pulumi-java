// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeradataPartitionSettingsResponse {
    /**
     * @return The name of the column that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionColumnName;
    /**
     * @return The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionLowerBound;
    /**
     * @return The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionUpperBound;

    @CustomType.Constructor
    private TeradataPartitionSettingsResponse(
        @CustomType.Parameter("partitionColumnName") @Nullable Object partitionColumnName,
        @CustomType.Parameter("partitionLowerBound") @Nullable Object partitionLowerBound,
        @CustomType.Parameter("partitionUpperBound") @Nullable Object partitionUpperBound) {
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    /**
     * @return The name of the column that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }
    /**
     * @return The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionLowerBound() {
        return Optional.ofNullable(this.partitionLowerBound);
    }
    /**
     * @return The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionUpperBound() {
        return Optional.ofNullable(this.partitionUpperBound);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeradataPartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object partitionColumnName;
        private @Nullable Object partitionLowerBound;
        private @Nullable Object partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(TeradataPartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder partitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }
        public Builder partitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }
        public Builder partitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }        public TeradataPartitionSettingsResponse build() {
            return new TeradataPartitionSettingsResponse(partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
