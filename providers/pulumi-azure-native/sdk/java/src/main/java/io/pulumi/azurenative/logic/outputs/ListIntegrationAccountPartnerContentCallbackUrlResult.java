// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.WorkflowTriggerListCallbackUrlQueriesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIntegrationAccountPartnerContentCallbackUrlResult {
    /**
     * Gets the workflow trigger callback URL base path.
     * 
     */
    private final String basePath;
    /**
     * Gets the workflow trigger callback URL HTTP method.
     * 
     */
    private final String method;
    /**
     * Gets the workflow trigger callback URL query parameters.
     * 
     */
    private final @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
    /**
     * Gets the workflow trigger callback URL relative path.
     * 
     */
    private final String relativePath;
    /**
     * Gets the workflow trigger callback URL relative path parameters.
     * 
     */
    private final @Nullable List<String> relativePathParameters;
    /**
     * Gets the workflow trigger callback URL.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private ListIntegrationAccountPartnerContentCallbackUrlResult(
        @OutputCustomType.Parameter("basePath") String basePath,
        @OutputCustomType.Parameter("method") String method,
        @OutputCustomType.Parameter("queries") @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries,
        @OutputCustomType.Parameter("relativePath") String relativePath,
        @OutputCustomType.Parameter("relativePathParameters") @Nullable List<String> relativePathParameters,
        @OutputCustomType.Parameter("value") String value) {
        this.basePath = basePath;
        this.method = method;
        this.queries = queries;
        this.relativePath = relativePath;
        this.relativePathParameters = relativePathParameters;
        this.value = value;
    }

    /**
     * Gets the workflow trigger callback URL base path.
     * 
    */
    public String getBasePath() {
        return this.basePath;
    }
    /**
     * Gets the workflow trigger callback URL HTTP method.
     * 
    */
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the workflow trigger callback URL query parameters.
     * 
    */
    public Optional<WorkflowTriggerListCallbackUrlQueriesResponse> getQueries() {
        return Optional.ofNullable(this.queries);
    }
    /**
     * Gets the workflow trigger callback URL relative path.
     * 
    */
    public String getRelativePath() {
        return this.relativePath;
    }
    /**
     * Gets the workflow trigger callback URL relative path parameters.
     * 
    */
    public List<String> getRelativePathParameters() {
        return this.relativePathParameters == null ? List.of() : this.relativePathParameters;
    }
    /**
     * Gets the workflow trigger callback URL.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountPartnerContentCallbackUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String basePath;
        private String method;
        private @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
        private String relativePath;
        private @Nullable List<String> relativePathParameters;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountPartnerContentCallbackUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePath = defaults.basePath;
    	      this.method = defaults.method;
    	      this.queries = defaults.queries;
    	      this.relativePath = defaults.relativePath;
    	      this.relativePathParameters = defaults.relativePathParameters;
    	      this.value = defaults.value;
        }

        public Builder basePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }

        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder queries(@Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries) {
            this.queries = queries;
            return this;
        }

        public Builder relativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }

        public Builder relativePathParameters(@Nullable List<String> relativePathParameters) {
            this.relativePathParameters = relativePathParameters;
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListIntegrationAccountPartnerContentCallbackUrlResult build() {
            return new ListIntegrationAccountPartnerContentCallbackUrlResult(basePath, method, queries, relativePath, relativePathParameters, value);
        }
    }
}
