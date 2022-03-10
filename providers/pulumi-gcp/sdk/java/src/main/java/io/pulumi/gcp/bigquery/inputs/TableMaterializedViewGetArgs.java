// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMaterializedViewGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMaterializedViewGetArgs Empty = new TableMaterializedViewGetArgs();

    /**
     * Specifies whether to use BigQuery's automatic refresh for this materialized view when the base table is updated.
     * The default value is true.
     * 
     */
    @InputImport(name="enableRefresh")
      private final @Nullable Input<Boolean> enableRefresh;

    public Input<Boolean> getEnableRefresh() {
        return this.enableRefresh == null ? Input.empty() : this.enableRefresh;
    }

    /**
     * A query whose result is persisted.
     * 
     */
    @InputImport(name="query", required=true)
      private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    /**
     * The maximum frequency at which this materialized view will be refreshed.
     * The default value is 1800000
     * 
     */
    @InputImport(name="refreshIntervalMs")
      private final @Nullable Input<Integer> refreshIntervalMs;

    public Input<Integer> getRefreshIntervalMs() {
        return this.refreshIntervalMs == null ? Input.empty() : this.refreshIntervalMs;
    }

    public TableMaterializedViewGetArgs(
        @Nullable Input<Boolean> enableRefresh,
        Input<String> query,
        @Nullable Input<Integer> refreshIntervalMs) {
        this.enableRefresh = enableRefresh;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.refreshIntervalMs = refreshIntervalMs;
    }

    private TableMaterializedViewGetArgs() {
        this.enableRefresh = Input.empty();
        this.query = Input.empty();
        this.refreshIntervalMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMaterializedViewGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableRefresh;
        private Input<String> query;
        private @Nullable Input<Integer> refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMaterializedViewGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder enableRefresh(@Nullable Input<Boolean> enableRefresh) {
            this.enableRefresh = enableRefresh;
            return this;
        }

        public Builder enableRefresh(@Nullable Boolean enableRefresh) {
            this.enableRefresh = Input.ofNullable(enableRefresh);
            return this;
        }

        public Builder query(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder refreshIntervalMs(@Nullable Input<Integer> refreshIntervalMs) {
            this.refreshIntervalMs = refreshIntervalMs;
            return this;
        }

        public Builder refreshIntervalMs(@Nullable Integer refreshIntervalMs) {
            this.refreshIntervalMs = Input.ofNullable(refreshIntervalMs);
            return this;
        }
        public TableMaterializedViewGetArgs build() {
            return new TableMaterializedViewGetArgs(enableRefresh, query, refreshIntervalMs);
        }
    }
}
