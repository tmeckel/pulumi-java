// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for Sql source partitioning.
 * 
 */
public final class SqlPartitionSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlPartitionSettingsArgs Empty = new SqlPartitionSettingsArgs();

    /**
     * The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionColumnName")
    private @Nullable Output<Object> partitionColumnName;

    /**
     * @return The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> partitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }

    /**
     * The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionLowerBound")
    private @Nullable Output<Object> partitionLowerBound;

    /**
     * @return The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> partitionLowerBound() {
        return Optional.ofNullable(this.partitionLowerBound);
    }

    /**
     * The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionUpperBound")
    private @Nullable Output<Object> partitionUpperBound;

    /**
     * @return The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> partitionUpperBound() {
        return Optional.ofNullable(this.partitionUpperBound);
    }

    private SqlPartitionSettingsArgs() {}

    private SqlPartitionSettingsArgs(SqlPartitionSettingsArgs $) {
        this.partitionColumnName = $.partitionColumnName;
        this.partitionLowerBound = $.partitionLowerBound;
        this.partitionUpperBound = $.partitionUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlPartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlPartitionSettingsArgs $;

        public Builder() {
            $ = new SqlPartitionSettingsArgs();
        }

        public Builder(SqlPartitionSettingsArgs defaults) {
            $ = new SqlPartitionSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionColumnName The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionColumnName(@Nullable Output<Object> partitionColumnName) {
            $.partitionColumnName = partitionColumnName;
            return this;
        }

        /**
         * @param partitionColumnName The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionColumnName(Object partitionColumnName) {
            return partitionColumnName(Output.of(partitionColumnName));
        }

        /**
         * @param partitionLowerBound The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionLowerBound(@Nullable Output<Object> partitionLowerBound) {
            $.partitionLowerBound = partitionLowerBound;
            return this;
        }

        /**
         * @param partitionLowerBound The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionLowerBound(Object partitionLowerBound) {
            return partitionLowerBound(Output.of(partitionLowerBound));
        }

        /**
         * @param partitionUpperBound The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionUpperBound(@Nullable Output<Object> partitionUpperBound) {
            $.partitionUpperBound = partitionUpperBound;
            return this;
        }

        /**
         * @param partitionUpperBound The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionUpperBound(Object partitionUpperBound) {
            return partitionUpperBound(Output.of(partitionUpperBound));
        }

        public SqlPartitionSettingsArgs build() {
            return $;
        }
    }

}
