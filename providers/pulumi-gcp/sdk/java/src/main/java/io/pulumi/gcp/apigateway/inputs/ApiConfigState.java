// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigGetArgs;
import io.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigState Empty = new ApiConfigState();

    /**
     * The API to attach the config to.
     * 
     */
    @Import(name="api")
      private final @Nullable Output<String> api;

    public Output<String> getApi() {
        return this.api == null ? Codegen.empty() : this.api;
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
      private final @Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig;

    public Output<ApiConfigGatewayConfigGetArgs> getGatewayConfig() {
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
     * The resource name of the API Config.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    @Import(name="openapiDocuments")
      private final @Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments;

    public Output<List<ApiConfigOpenapiDocumentGetArgs>> getOpenapiDocuments() {
        return this.openapiDocuments == null ? Codegen.empty() : this.openapiDocuments;
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

    /**
     * The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @Import(name="serviceConfigId")
      private final @Nullable Output<String> serviceConfigId;

    public Output<String> getServiceConfigId() {
        return this.serviceConfigId == null ? Codegen.empty() : this.serviceConfigId;
    }

    public ApiConfigState(
        @Nullable Output<String> api,
        @Nullable Output<String> apiConfigId,
        @Nullable Output<String> apiConfigIdPrefix,
        @Nullable Output<String> displayName,
        @Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceConfigId) {
        this.api = api;
        this.apiConfigId = apiConfigId;
        this.apiConfigIdPrefix = apiConfigIdPrefix;
        this.displayName = displayName;
        this.gatewayConfig = gatewayConfig;
        this.labels = labels;
        this.name = name;
        this.openapiDocuments = openapiDocuments;
        this.project = project;
        this.serviceConfigId = serviceConfigId;
    }

    private ApiConfigState() {
        this.api = Codegen.empty();
        this.apiConfigId = Codegen.empty();
        this.apiConfigIdPrefix = Codegen.empty();
        this.displayName = Codegen.empty();
        this.gatewayConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.openapiDocuments = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceConfigId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> api;
        private @Nullable Output<String> apiConfigId;
        private @Nullable Output<String> apiConfigIdPrefix;
        private @Nullable Output<String> displayName;
        private @Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceConfigId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfigId = defaults.apiConfigId;
    	      this.apiConfigIdPrefix = defaults.apiConfigIdPrefix;
    	      this.displayName = defaults.displayName;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.project = defaults.project;
    	      this.serviceConfigId = defaults.serviceConfigId;
        }

        public Builder api(@Nullable Output<String> api) {
            this.api = api;
            return this;
        }
        public Builder api(@Nullable String api) {
            this.api = Codegen.ofNullable(api);
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
        public Builder gatewayConfig(@Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }
        public Builder gatewayConfig(@Nullable ApiConfigGatewayConfigGetArgs gatewayConfig) {
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder openapiDocuments(@Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments) {
            this.openapiDocuments = openapiDocuments;
            return this;
        }
        public Builder openapiDocuments(@Nullable List<ApiConfigOpenapiDocumentGetArgs> openapiDocuments) {
            this.openapiDocuments = Codegen.ofNullable(openapiDocuments);
            return this;
        }
        public Builder openapiDocuments(ApiConfigOpenapiDocumentGetArgs... openapiDocuments) {
            return openapiDocuments(List.of(openapiDocuments));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serviceConfigId(@Nullable Output<String> serviceConfigId) {
            this.serviceConfigId = serviceConfigId;
            return this;
        }
        public Builder serviceConfigId(@Nullable String serviceConfigId) {
            this.serviceConfigId = Codegen.ofNullable(serviceConfigId);
            return this;
        }        public ApiConfigState build() {
            return new ApiConfigState(api, apiConfigId, apiConfigIdPrefix, displayName, gatewayConfig, labels, name, openapiDocuments, project, serviceConfigId);
        }
    }
}
