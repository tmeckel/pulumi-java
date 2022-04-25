// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics;

import com.pulumi.azurenative.streamanalytics.inputs.PrivateEndpointPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName")
    private @Nullable Output<String> privateEndpointName;

    /**
     * @return The name of the private endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpointName() {
        return Optional.ofNullable(this.privateEndpointName);
    }

    /**
     * The properties associated with a private endpoint.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<PrivateEndpointPropertiesArgs> properties;

    /**
     * @return The properties associated with a private endpoint.
     * 
     */
    public Optional<Output<PrivateEndpointPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
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

    private PrivateEndpointArgs() {}

    private PrivateEndpointArgs(PrivateEndpointArgs $) {
        this.clusterName = $.clusterName;
        this.privateEndpointName = $.privateEndpointName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointArgs $;

        public Builder() {
            $ = new PrivateEndpointArgs();
        }

        public Builder(PrivateEndpointArgs defaults) {
            $ = new PrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(@Nullable Output<String> privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(String privateEndpointName) {
            return privateEndpointName(Output.of(privateEndpointName));
        }

        /**
         * @param properties The properties associated with a private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<PrivateEndpointPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties associated with a private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder properties(PrivateEndpointPropertiesArgs properties) {
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

        public PrivateEndpointArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
