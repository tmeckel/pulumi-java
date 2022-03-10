// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryDefinitionState extends io.pulumi.resources.ResourceArgs {

    public static final QueryDefinitionState Empty = new QueryDefinitionState();

    /**
     * Specific log groups to use with the query.
     * 
     */
    @InputImport(name="logGroupNames")
      private final @Nullable Input<List<String>> logGroupNames;

    public Input<List<String>> getLogGroupNames() {
        return this.logGroupNames == null ? Input.empty() : this.logGroupNames;
    }

    /**
     * The name of the query.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The query definition ID.
     * 
     */
    @InputImport(name="queryDefinitionId")
      private final @Nullable Input<String> queryDefinitionId;

    public Input<String> getQueryDefinitionId() {
        return this.queryDefinitionId == null ? Input.empty() : this.queryDefinitionId;
    }

    /**
     * The query to save. You can read more about CloudWatch Logs Query Syntax in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html).
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<String> queryString;

    public Input<String> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    public QueryDefinitionState(
        @Nullable Input<List<String>> logGroupNames,
        @Nullable Input<String> name,
        @Nullable Input<String> queryDefinitionId,
        @Nullable Input<String> queryString) {
        this.logGroupNames = logGroupNames;
        this.name = name;
        this.queryDefinitionId = queryDefinitionId;
        this.queryString = queryString;
    }

    private QueryDefinitionState() {
        this.logGroupNames = Input.empty();
        this.name = Input.empty();
        this.queryDefinitionId = Input.empty();
        this.queryString = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> logGroupNames;
        private @Nullable Input<String> name;
        private @Nullable Input<String> queryDefinitionId;
        private @Nullable Input<String> queryString;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryDefinitionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupNames = defaults.logGroupNames;
    	      this.name = defaults.name;
    	      this.queryDefinitionId = defaults.queryDefinitionId;
    	      this.queryString = defaults.queryString;
        }

        public Builder logGroupNames(@Nullable Input<List<String>> logGroupNames) {
            this.logGroupNames = logGroupNames;
            return this;
        }

        public Builder logGroupNames(@Nullable List<String> logGroupNames) {
            this.logGroupNames = Input.ofNullable(logGroupNames);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder queryDefinitionId(@Nullable Input<String> queryDefinitionId) {
            this.queryDefinitionId = queryDefinitionId;
            return this;
        }

        public Builder queryDefinitionId(@Nullable String queryDefinitionId) {
            this.queryDefinitionId = Input.ofNullable(queryDefinitionId);
            return this;
        }

        public Builder queryString(@Nullable Input<String> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable String queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }
        public QueryDefinitionState build() {
            return new QueryDefinitionState(logGroupNames, name, queryDefinitionId, queryString);
        }
    }
}
