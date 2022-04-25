// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork;

import com.pulumi.azurenative.delegatednetwork.enums.OrchestratorKind;
import com.pulumi.azurenative.delegatednetwork.inputs.ControllerDetailsArgs;
import com.pulumi.azurenative.delegatednetwork.inputs.OrchestratorIdentityArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratorInstanceServiceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratorInstanceServiceDetailsArgs Empty = new OrchestratorInstanceServiceDetailsArgs();

    /**
     * K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    @Import(name="apiServerEndpoint")
    private @Nullable Output<String> apiServerEndpoint;

    /**
     * @return K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    public Optional<Output<String>> apiServerEndpoint() {
        return Optional.ofNullable(this.apiServerEndpoint);
    }

    /**
     * RootCA certificate of kubernetes cluster base64 encoded
     * 
     */
    @Import(name="clusterRootCA")
    private @Nullable Output<String> clusterRootCA;

    /**
     * @return RootCA certificate of kubernetes cluster base64 encoded
     * 
     */
    public Optional<Output<String>> clusterRootCA() {
        return Optional.ofNullable(this.clusterRootCA);
    }

    /**
     * Properties of the controller.
     * 
     */
    @Import(name="controllerDetails", required=true)
    private Output<ControllerDetailsArgs> controllerDetails;

    /**
     * @return Properties of the controller.
     * 
     */
    public Output<ControllerDetailsArgs> controllerDetails() {
        return this.controllerDetails;
    }

    /**
     * The identity of the orchestrator
     * 
     */
    @Import(name="identity")
    private @Nullable Output<OrchestratorIdentityArgs> identity;

    /**
     * @return The identity of the orchestrator
     * 
     */
    public Optional<Output<OrchestratorIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,OrchestratorKind>> kind;

    /**
     * @return The kind of workbook. Choices are user and shared.
     * 
     */
    public Output<Either<String,OrchestratorKind>> kind() {
        return this.kind;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * AAD ID used with apiserver
     * 
     */
    @Import(name="orchestratorAppId")
    private @Nullable Output<String> orchestratorAppId;

    /**
     * @return AAD ID used with apiserver
     * 
     */
    public Optional<Output<String>> orchestratorAppId() {
        return Optional.ofNullable(this.orchestratorAppId);
    }

    /**
     * TenantID of server App ID
     * 
     */
    @Import(name="orchestratorTenantId")
    private @Nullable Output<String> orchestratorTenantId;

    /**
     * @return TenantID of server App ID
     * 
     */
    public Optional<Output<String>> orchestratorTenantId() {
        return Optional.ofNullable(this.orchestratorTenantId);
    }

    /**
     * private link arm resource id. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    @Import(name="privateLinkResourceId")
    private @Nullable Output<String> privateLinkResourceId;

    /**
     * @return private link arm resource id. Either one of apiServerEndpoint or privateLinkResourceId can be specified
     * 
     */
    public Optional<Output<String>> privateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private OrchestratorInstanceServiceDetailsArgs() {}

    private OrchestratorInstanceServiceDetailsArgs(OrchestratorInstanceServiceDetailsArgs $) {
        this.apiServerEndpoint = $.apiServerEndpoint;
        this.clusterRootCA = $.clusterRootCA;
        this.controllerDetails = $.controllerDetails;
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.orchestratorAppId = $.orchestratorAppId;
        this.orchestratorTenantId = $.orchestratorTenantId;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratorInstanceServiceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratorInstanceServiceDetailsArgs $;

        public Builder() {
            $ = new OrchestratorInstanceServiceDetailsArgs();
        }

        public Builder(OrchestratorInstanceServiceDetailsArgs defaults) {
            $ = new OrchestratorInstanceServiceDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiServerEndpoint K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId can be specified
         * 
         * @return builder
         * 
         */
        public Builder apiServerEndpoint(@Nullable Output<String> apiServerEndpoint) {
            $.apiServerEndpoint = apiServerEndpoint;
            return this;
        }

        /**
         * @param apiServerEndpoint K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId can be specified
         * 
         * @return builder
         * 
         */
        public Builder apiServerEndpoint(String apiServerEndpoint) {
            return apiServerEndpoint(Output.of(apiServerEndpoint));
        }

        /**
         * @param clusterRootCA RootCA certificate of kubernetes cluster base64 encoded
         * 
         * @return builder
         * 
         */
        public Builder clusterRootCA(@Nullable Output<String> clusterRootCA) {
            $.clusterRootCA = clusterRootCA;
            return this;
        }

        /**
         * @param clusterRootCA RootCA certificate of kubernetes cluster base64 encoded
         * 
         * @return builder
         * 
         */
        public Builder clusterRootCA(String clusterRootCA) {
            return clusterRootCA(Output.of(clusterRootCA));
        }

        /**
         * @param controllerDetails Properties of the controller.
         * 
         * @return builder
         * 
         */
        public Builder controllerDetails(Output<ControllerDetailsArgs> controllerDetails) {
            $.controllerDetails = controllerDetails;
            return this;
        }

        /**
         * @param controllerDetails Properties of the controller.
         * 
         * @return builder
         * 
         */
        public Builder controllerDetails(ControllerDetailsArgs controllerDetails) {
            return controllerDetails(Output.of(controllerDetails));
        }

        /**
         * @param identity The identity of the orchestrator
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<OrchestratorIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the orchestrator
         * 
         * @return builder
         * 
         */
        public Builder identity(OrchestratorIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kind The kind of workbook. Choices are user and shared.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Either<String,OrchestratorKind>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of workbook. Choices are user and shared.
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,OrchestratorKind> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind The kind of workbook. Choices are user and shared.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind The kind of workbook. Choices are user and shared.
         * 
         * @return builder
         * 
         */
        public Builder kind(OrchestratorKind kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param orchestratorAppId AAD ID used with apiserver
         * 
         * @return builder
         * 
         */
        public Builder orchestratorAppId(@Nullable Output<String> orchestratorAppId) {
            $.orchestratorAppId = orchestratorAppId;
            return this;
        }

        /**
         * @param orchestratorAppId AAD ID used with apiserver
         * 
         * @return builder
         * 
         */
        public Builder orchestratorAppId(String orchestratorAppId) {
            return orchestratorAppId(Output.of(orchestratorAppId));
        }

        /**
         * @param orchestratorTenantId TenantID of server App ID
         * 
         * @return builder
         * 
         */
        public Builder orchestratorTenantId(@Nullable Output<String> orchestratorTenantId) {
            $.orchestratorTenantId = orchestratorTenantId;
            return this;
        }

        /**
         * @param orchestratorTenantId TenantID of server App ID
         * 
         * @return builder
         * 
         */
        public Builder orchestratorTenantId(String orchestratorTenantId) {
            return orchestratorTenantId(Output.of(orchestratorTenantId));
        }

        /**
         * @param privateLinkResourceId private link arm resource id. Either one of apiServerEndpoint or privateLinkResourceId can be specified
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(@Nullable Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId private link arm resource id. Either one of apiServerEndpoint or privateLinkResourceId can be specified
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public OrchestratorInstanceServiceDetailsArgs build() {
            $.controllerDetails = Objects.requireNonNull($.controllerDetails, "expected parameter 'controllerDetails' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
