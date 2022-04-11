// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableTimePartitioningGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableTimePartitioningGetArgs Empty = new TableTimePartitioningGetArgs();

    /**
     * Number of milliseconds for which to keep the
     * storage for a partition.
     * 
     */
    @Import(name="expirationMs")
      private final @Nullable Output<Integer> expirationMs;

    public Output<Integer> getExpirationMs() {
        return this.expirationMs == null ? Codegen.empty() : this.expirationMs;
    }

    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> getField() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @Import(name="requirePartitionFilter")
      private final @Nullable Output<Boolean> requirePartitionFilter;

    public Output<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Codegen.empty() : this.requirePartitionFilter;
    }

    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TableTimePartitioningGetArgs(
        @Nullable Output<Integer> expirationMs,
        @Nullable Output<String> field,
        @Nullable Output<Boolean> requirePartitionFilter,
        Output<String> type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.requirePartitionFilter = requirePartitionFilter;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableTimePartitioningGetArgs() {
        this.expirationMs = Codegen.empty();
        this.field = Codegen.empty();
        this.requirePartitionFilter = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTimePartitioningGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> expirationMs;
        private @Nullable Output<String> field;
        private @Nullable Output<Boolean> requirePartitionFilter;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableTimePartitioningGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder expirationMs(@Nullable Output<Integer> expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }
        public Builder expirationMs(@Nullable Integer expirationMs) {
            this.expirationMs = Codegen.ofNullable(expirationMs);
            return this;
        }
        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Codegen.ofNullable(requirePartitionFilter);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TableTimePartitioningGetArgs build() {
            return new TableTimePartitioningGetArgs(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
