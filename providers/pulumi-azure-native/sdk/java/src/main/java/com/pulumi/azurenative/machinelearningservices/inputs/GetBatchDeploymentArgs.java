// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBatchDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBatchDeploymentArgs Empty = new GetBatchDeploymentArgs();

    /**
     * The identifier for the Batch deployments.
     * 
     */
    @Import(name="deploymentName", required=true)
    private String deploymentName;

    /**
     * @return The identifier for the Batch deployments.
     * 
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Endpoint name
     * 
     */
    @Import(name="endpointName", required=true)
    private String endpointName;

    /**
     * @return Endpoint name
     * 
     */
    public String endpointName() {
        return this.endpointName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetBatchDeploymentArgs() {}

    private GetBatchDeploymentArgs(GetBatchDeploymentArgs $) {
        this.deploymentName = $.deploymentName;
        this.endpointName = $.endpointName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBatchDeploymentArgs $;

        public Builder() {
            $ = new GetBatchDeploymentArgs();
        }

        public Builder(GetBatchDeploymentArgs defaults) {
            $ = new GetBatchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentName The identifier for the Batch deployments.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param endpointName Endpoint name
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetBatchDeploymentArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
