// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs;
import io.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigArgs Empty = new ApiConfigArgs();

    /**
     * The API to attach the config to.
     * 
     */
    @Import(name="api", required=true)
      private final Output<String> api;

    public Output<String> getApi() {
        return this.api;
    }

    /**
     * Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    @Import(name="apiConfigId")
      private final @Nullable Output<String> apiConfigId;

    public Output<String> getApiConfigId() {
        return this.apiConfigId == null ? Codegen.empty() : this.apiConfigId;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    @Import(name="apiConfigIdPrefix")
      private final @Nullable Output<String> apiConfigIdPrefix;

    public Output<String> getApiConfigIdPrefix() {
        return this.apiConfigIdPrefix == null ? Codegen.empty() : this.apiConfigIdPrefix;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    @Import(name="gatewayConfig")
      private final @Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig;

    public Output<ApiConfigGatewayConfigArgs> getGatewayConfig() {
        return this.gatewayConfig == null ? Codegen.empty() : this.gatewayConfig;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    @Import(name="openapiDocuments", required=true)
      private final Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments;

    public Output<List<ApiConfigOpenapiDocumentArgs>> getOpenapiDocuments() {
        return this.openapiDocuments;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ApiConfigArgs(
        Output<String> api,
        @Nullable Output<String> apiConfigId,
        @Nullable Output<String> apiConfigIdPrefix,
        @Nullable Output<String> displayName,
        @Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig,
        @Nullable Output<Map<String,String>> labels,
        Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments,
        @Nullable Output<String> project) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.apiConfigId = apiConfigId;
        this.apiConfigIdPrefix = apiConfigIdPrefix;
        this.displayName = displayName;
        this.gatewayConfig = gatewayConfig;
        this.labels = labels;
        this.openapiDocuments = Objects.requireNonNull(openapiDocuments, "expected parameter 'openapiDocuments' to be non-null");
        this.project = project;
    }

    private ApiConfigArgs() {
        this.api = Codegen.empty();
        this.apiConfigId = Codegen.empty();
        this.apiConfigIdPrefix = Codegen.empty();
        this.displayName = Codegen.empty();
        this.gatewayConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.openapiDocuments = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> api;
        private @Nullable Output<String> apiConfigId;
        private @Nullable Output<String> apiConfigIdPrefix;
        private @Nullable Output<String> displayName;
        private @Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig;
        private @Nullable Output<Map<String,String>> labels;
        private Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfigId = defaults.apiConfigId;
    	      this.apiConfigIdPrefix = defaults.apiConfigIdPrefix;
    	      this.displayName = defaults.displayName;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.labels = defaults.labels;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.project = defaults.project;
        }

        public Builder api(Output<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }
        public Builder api(String api) {
            this.api = Output.of(Objects.requireNonNull(api));
            return this;
        }
        public Builder apiConfigId(@Nullable Output<String> apiConfigId) {
            this.apiConfigId = apiConfigId;
            return this;
        }
        public Builder apiConfigId(@Nullable String apiConfigId) {
            this.apiConfigId = Codegen.ofNullable(apiConfigId);
            return this;
        }
        public Builder apiConfigIdPrefix(@Nullable Output<String> apiConfigIdPrefix) {
            this.apiConfigIdPrefix = apiConfigIdPrefix;
            return this;
        }
        public Builder apiConfigIdPrefix(@Nullable String apiConfigIdPrefix) {
            this.apiConfigIdPrefix = Codegen.ofNullable(apiConfigIdPrefix);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder gatewayConfig(@Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }
        public Builder gatewayConfig(@Nullable ApiConfigGatewayConfigArgs gatewayConfig) {
            this.gatewayConfig = Codegen.ofNullable(gatewayConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder openapiDocuments(Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments) {
            this.openapiDocuments = Objects.requireNonNull(openapiDocuments);
            return this;
        }
        public Builder openapiDocuments(List<ApiConfigOpenapiDocumentArgs> openapiDocuments) {
            this.openapiDocuments = Output.of(Objects.requireNonNull(openapiDocuments));
            return this;
        }
        public Builder openapiDocuments(ApiConfigOpenapiDocumentArgs... openapiDocuments) {
            return openapiDocuments(List.of(openapiDocuments));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ApiConfigArgs build() {
            return new ApiConfigArgs(api, apiConfigId, apiConfigIdPrefix, displayName, gatewayConfig, labels, openapiDocuments, project);
        }
    }
}
