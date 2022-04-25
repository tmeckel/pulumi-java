// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.inputs.ResourceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchDeploymentArgs Empty = new BatchDeploymentArgs();

    /**
     * The identifier for the Batch inference deployment.
     * 
     */
    @Import(name="deploymentName")
    private @Nullable Output<String> deploymentName;

    /**
     * @return The identifier for the Batch inference deployment.
     * 
     */
    public Optional<Output<String>> deploymentName() {
        return Optional.ofNullable(this.deploymentName);
    }

    /**
     * Inference endpoint name
     * 
     */
    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    /**
     * @return Inference endpoint name
     * 
     */
    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * Service identity associated with a resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ResourceIdentityArgs> identity;

    /**
     * @return Service identity associated with a resource.
     * 
     */
    public Optional<Output<ResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
    private Output<com.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties;

    /**
     * @return Additional attributes of the entity.
     * 
     */
    public Output<com.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties() {
        return this.properties;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private BatchDeploymentArgs() {}

    private BatchDeploymentArgs(BatchDeploymentArgs $) {
        this.deploymentName = $.deploymentName;
        this.endpointName = $.endpointName;
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchDeploymentArgs $;

        public Builder() {
            $ = new BatchDeploymentArgs();
        }

        public Builder(BatchDeploymentArgs defaults) {
            $ = new BatchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentName The identifier for the Batch inference deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName The identifier for the Batch inference deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        /**
         * @param endpointName Inference endpoint name
         * 
         * @return builder
         * 
         */
        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName Inference endpoint name
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param identity Service identity associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Service identity associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(ResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<com.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(com.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs properties) {
            return properties(Output.of(properties));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public BatchDeploymentArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
