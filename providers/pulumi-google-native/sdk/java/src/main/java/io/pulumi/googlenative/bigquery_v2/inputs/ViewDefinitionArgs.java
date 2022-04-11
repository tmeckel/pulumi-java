// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.bigquery_v2.inputs.UserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ViewDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ViewDefinitionArgs Empty = new ViewDefinitionArgs();

    /**
     * [Required] A query that BigQuery executes when the view is referenced.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    /**
     * True if the column names are explicitly specified. For example by using the 'CREATE VIEW v(c1, c2) AS ...' syntax. Can only be set using BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/
     * 
     */
    @Import(name="useExplicitColumnNames")
      private final @Nullable Output<Boolean> useExplicitColumnNames;

    public Output<Boolean> getUseExplicitColumnNames() {
        return this.useExplicitColumnNames == null ? Codegen.empty() : this.useExplicitColumnNames;
    }

    /**
     * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
     * 
     */
    @Import(name="useLegacySql")
      private final @Nullable Output<Boolean> useLegacySql;

    public Output<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Codegen.empty() : this.useLegacySql;
    }

    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    @Import(name="userDefinedFunctionResources")
      private final @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    public Output<List<UserDefinedFunctionResourceArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Codegen.empty() : this.userDefinedFunctionResources;
    }

    public ViewDefinitionArgs(
        @Nullable Output<String> query,
        @Nullable Output<Boolean> useExplicitColumnNames,
        @Nullable Output<Boolean> useLegacySql,
        @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
        this.query = query;
        this.useExplicitColumnNames = useExplicitColumnNames;
        this.useLegacySql = useLegacySql;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
    }

    private ViewDefinitionArgs() {
        this.query = Codegen.empty();
        this.useExplicitColumnNames = Codegen.empty();
        this.useLegacySql = Codegen.empty();
        this.userDefinedFunctionResources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> query;
        private @Nullable Output<Boolean> useExplicitColumnNames;
        private @Nullable Output<Boolean> useLegacySql;
        private @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ViewDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.useExplicitColumnNames = defaults.useExplicitColumnNames;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder useExplicitColumnNames(@Nullable Output<Boolean> useExplicitColumnNames) {
            this.useExplicitColumnNames = useExplicitColumnNames;
            return this;
        }
        public Builder useExplicitColumnNames(@Nullable Boolean useExplicitColumnNames) {
            this.useExplicitColumnNames = Codegen.ofNullable(useExplicitColumnNames);
            return this;
        }
        public Builder useLegacySql(@Nullable Output<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }
        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Codegen.ofNullable(useLegacySql);
            return this;
        }
        public Builder userDefinedFunctionResources(@Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }
        public Builder userDefinedFunctionResources(@Nullable List<UserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Codegen.ofNullable(userDefinedFunctionResources);
            return this;
        }
        public Builder userDefinedFunctionResources(UserDefinedFunctionResourceArgs... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }        public ViewDefinitionArgs build() {
            return new ViewDefinitionArgs(query, useExplicitColumnNames, useLegacySql, userDefinedFunctionResources);
        }
    }
}
