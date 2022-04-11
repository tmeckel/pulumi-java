// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.awsnative.cassandra.enums.TableClusteringKeyColumnOrderBy;
import io.pulumi.awsnative.cassandra.inputs.TableColumnArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableClusteringKeyColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableClusteringKeyColumnArgs Empty = new TableClusteringKeyColumnArgs();

    @Import(name="column", required=true)
      private final Output<TableColumnArgs> column;

    public Output<TableColumnArgs> getColumn() {
        return this.column;
    }

    @Import(name="orderBy")
      private final @Nullable Output<TableClusteringKeyColumnOrderBy> orderBy;

    public Output<TableClusteringKeyColumnOrderBy> getOrderBy() {
        return this.orderBy == null ? Codegen.empty() : this.orderBy;
    }

    public TableClusteringKeyColumnArgs(
        Output<TableColumnArgs> column,
        @Nullable Output<TableClusteringKeyColumnOrderBy> orderBy) {
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.orderBy = orderBy;
    }

    private TableClusteringKeyColumnArgs() {
        this.column = Codegen.empty();
        this.orderBy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableClusteringKeyColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TableColumnArgs> column;
        private @Nullable Output<TableClusteringKeyColumnOrderBy> orderBy;

        public Builder() {
    	      // Empty
        }

        public Builder(TableClusteringKeyColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.orderBy = defaults.orderBy;
        }

        public Builder column(Output<TableColumnArgs> column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        public Builder column(TableColumnArgs column) {
            this.column = Output.of(Objects.requireNonNull(column));
            return this;
        }
        public Builder orderBy(@Nullable Output<TableClusteringKeyColumnOrderBy> orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public Builder orderBy(@Nullable TableClusteringKeyColumnOrderBy orderBy) {
            this.orderBy = Codegen.ofNullable(orderBy);
            return this;
        }        public TableClusteringKeyColumnArgs build() {
            return new TableClusteringKeyColumnArgs(column, orderBy);
        }
    }
}
