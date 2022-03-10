// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.delegatednetwork.enums.OrchestratorKind;
import io.pulumi.azurenative.delegatednetwork.inputs.ControllerDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.inputs.OrchestratorIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrchestratorInstanceServiceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrchestratorInstanceServiceDetailsArgs Empty = new OrchestratorInstanceServiceDetailsArgs();

    /**
     * K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    @InputImport(name="apiServerEndpoint")
      private final @Nullable Input<String> apiServerEndpoint;

    public Input<String> getApiServerEndpoint() {
        return this.apiServerEndpoint == null ? Input.empty() : this.apiServerEndpoint;
    }

    /**
     * RootCA certificate of kubernetes cluster base64 encoded
     * 
     */
    @InputImport(name="clusterRootCA")
      private final @Nullable Input<String> clusterRootCA;

    public Input<String> getClusterRootCA() {
        return this.clusterRootCA == null ? Input.empty() : this.clusterRootCA;
    }

    /**
     * Properties of the controller.
     * 
     */
    @InputImport(name="controllerDetails", required=true)
      private final Input<ControllerDetailsArgs> controllerDetails;

    public Input<ControllerDetailsArgs> getControllerDetails() {
        return this.controllerDetails;
    }

    /**
     * The identity of the orchestrator
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<OrchestratorIdentityArgs> identity;

    public Input<OrchestratorIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,OrchestratorKind>> kind;

    public Input<Either<String,OrchestratorKind>> getKind() {
        return this.kind;
    }

    /**
     * Location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * AAD ID used with apiserver
     * 
     */
    @InputImport(name="orchestratorAppId")
      private final @Nullable Input<String> orchestratorAppId;

    public Input<String> getOrchestratorAppId() {
        return this.orchestratorAppId == null ? Input.empty() : this.orchestratorAppId;
    }

    /**
     * TenantID of server App ID
     * 
     */
    @InputImport(name="orchestratorTenantId")
      private final @Nullable Input<String> orchestratorTenantId;

    public Input<String> getOrchestratorTenantId() {
        return this.orchestratorTenantId == null ? Input.empty() : this.orchestratorTenantId;
    }

    /**
     * private link arm resource id. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    @InputImport(name="privateLinkResourceId")
      private final @Nullable Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Input.empty() : this.privateLinkResourceId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public OrchestratorInstanceServiceDetailsArgs(
        @Nullable Input<String> apiServerEndpoint,
        @Nullable Input<String> clusterRootCA,
        Input<ControllerDetailsArgs> controllerDetails,
        @Nullable Input<OrchestratorIdentityArgs> identity,
        Input<Either<String,OrchestratorKind>> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> orchestratorAppId,
        @Nullable Input<String> orchestratorTenantId,
        @Nullable Input<String> privateLinkResourceId,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags) {
        this.apiServerEndpoint = apiServerEndpoint;
        this.clusterRootCA = clusterRootCA;
        this.controllerDetails = Objects.requireNonNull(controllerDetails, "expected parameter 'controllerDetails' to be non-null");
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.orchestratorAppId = orchestratorAppId;
        this.orchestratorTenantId = orchestratorTenantId;
        this.privateLinkResourceId = privateLinkResourceId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private OrchestratorInstanceServiceDetailsArgs() {
        this.apiServerEndpoint = Input.empty();
        this.clusterRootCA = Input.empty();
        this.controllerDetails = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.orchestratorAppId = Input.empty();
        this.orchestratorTenantId = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratorInstanceServiceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiServerEndpoint;
        private @Nullable Input<String> clusterRootCA;
        private Input<ControllerDetailsArgs> controllerDetails;
        private @Nullable Input<OrchestratorIdentityArgs> identity;
        private Input<Either<String,OrchestratorKind>> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> orchestratorAppId;
        private @Nullable Input<String> orchestratorTenantId;
        private @Nullable Input<String> privateLinkResourceId;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratorInstanceServiceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerEndpoint = defaults.apiServerEndpoint;
    	      this.clusterRootCA = defaults.clusterRootCA;
    	      this.controllerDetails = defaults.controllerDetails;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.orchestratorAppId = defaults.orchestratorAppId;
    	      this.orchestratorTenantId = defaults.orchestratorTenantId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder apiServerEndpoint(@Nullable Input<String> apiServerEndpoint) {
            this.apiServerEndpoint = apiServerEndpoint;
            return this;
        }

        public Builder apiServerEndpoint(@Nullable String apiServerEndpoint) {
            this.apiServerEndpoint = Input.ofNullable(apiServerEndpoint);
            return this;
        }

        public Builder clusterRootCA(@Nullable Input<String> clusterRootCA) {
            this.clusterRootCA = clusterRootCA;
            return this;
        }

        public Builder clusterRootCA(@Nullable String clusterRootCA) {
            this.clusterRootCA = Input.ofNullable(clusterRootCA);
            return this;
        }

        public Builder controllerDetails(Input<ControllerDetailsArgs> controllerDetails) {
            this.controllerDetails = Objects.requireNonNull(controllerDetails);
            return this;
        }

        public Builder controllerDetails(ControllerDetailsArgs controllerDetails) {
            this.controllerDetails = Input.of(Objects.requireNonNull(controllerDetails));
            return this;
        }

        public Builder identity(@Nullable Input<OrchestratorIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable OrchestratorIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder kind(Input<Either<String,OrchestratorKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,OrchestratorKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder orchestratorAppId(@Nullable Input<String> orchestratorAppId) {
            this.orchestratorAppId = orchestratorAppId;
            return this;
        }

        public Builder orchestratorAppId(@Nullable String orchestratorAppId) {
            this.orchestratorAppId = Input.ofNullable(orchestratorAppId);
            return this;
        }

        public Builder orchestratorTenantId(@Nullable Input<String> orchestratorTenantId) {
            this.orchestratorTenantId = orchestratorTenantId;
            return this;
        }

        public Builder orchestratorTenantId(@Nullable String orchestratorTenantId) {
            this.orchestratorTenantId = Input.ofNullable(orchestratorTenantId);
            return this;
        }

        public Builder privateLinkResourceId(@Nullable Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Input.ofNullable(privateLinkResourceId);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public OrchestratorInstanceServiceDetailsArgs build() {
            return new OrchestratorInstanceServiceDetailsArgs(apiServerEndpoint, clusterRootCA, controllerDetails, identity, kind, location, orchestratorAppId, orchestratorTenantId, privateLinkResourceId, resourceGroupName, resourceName, tags);
        }
    }
}
