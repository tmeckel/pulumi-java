// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListBatchEndpointKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListBatchEndpointKeysArgs Empty = new ListBatchEndpointKeysArgs();

    /**
     * Inference Endpoint name.
     * 
     */
    @Import(name="endpointName", required=true)
    private String endpointName;

    /**
     * @return Inference Endpoint name.
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

    private ListBatchEndpointKeysArgs() {}

    private ListBatchEndpointKeysArgs(ListBatchEndpointKeysArgs $) {
        this.endpointName = $.endpointName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListBatchEndpointKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListBatchEndpointKeysArgs $;

        public Builder() {
            $ = new ListBatchEndpointKeysArgs();
        }

        public Builder(ListBatchEndpointKeysArgs defaults) {
            $ = new ListBatchEndpointKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointName Inference Endpoint name.
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

        public ListBatchEndpointKeysArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
