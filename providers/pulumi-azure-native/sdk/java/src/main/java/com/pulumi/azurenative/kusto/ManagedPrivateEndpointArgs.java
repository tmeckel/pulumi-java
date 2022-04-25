// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The groupId in which the managed private endpoint is created.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The groupId in which the managed private endpoint is created.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The name of the managed private endpoint.
     * 
     */
    @Import(name="managedPrivateEndpointName")
    private @Nullable Output<String> managedPrivateEndpointName;

    /**
     * @return The name of the managed private endpoint.
     * 
     */
    public Optional<Output<String>> managedPrivateEndpointName() {
        return Optional.ofNullable(this.managedPrivateEndpointName);
    }

    /**
     * The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    @Import(name="privateLinkResourceId", required=true)
    private Output<String> privateLinkResourceId;

    /**
     * @return The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * The region of the resource to which the managed private endpoint is created.
     * 
     */
    @Import(name="privateLinkResourceRegion")
    private @Nullable Output<String> privateLinkResourceRegion;

    /**
     * @return The region of the resource to which the managed private endpoint is created.
     * 
     */
    public Optional<Output<String>> privateLinkResourceRegion() {
        return Optional.ofNullable(this.privateLinkResourceRegion);
    }

    /**
     * The user request message.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    /**
     * @return The user request message.
     * 
     */
    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ManagedPrivateEndpointArgs() {}

    private ManagedPrivateEndpointArgs(ManagedPrivateEndpointArgs $) {
        this.clusterName = $.clusterName;
        this.groupId = $.groupId;
        this.managedPrivateEndpointName = $.managedPrivateEndpointName;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.privateLinkResourceRegion = $.privateLinkResourceRegion;
        this.requestMessage = $.requestMessage;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new ManagedPrivateEndpointArgs();
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
            $ = new ManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param groupId The groupId in which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The groupId in which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param managedPrivateEndpointName The name of the managed private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managedPrivateEndpointName(@Nullable Output<String> managedPrivateEndpointName) {
            $.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        /**
         * @param managedPrivateEndpointName The name of the managed private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managedPrivateEndpointName(String managedPrivateEndpointName) {
            return managedPrivateEndpointName(Output.of(managedPrivateEndpointName));
        }

        /**
         * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceRegion(@Nullable Output<String> privateLinkResourceRegion) {
            $.privateLinkResourceRegion = privateLinkResourceRegion;
            return this;
        }

        /**
         * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceRegion(String privateLinkResourceRegion) {
            return privateLinkResourceRegion(Output.of(privateLinkResourceRegion));
        }

        /**
         * @param requestMessage The user request message.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        /**
         * @param requestMessage The user request message.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ManagedPrivateEndpointArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.privateLinkResourceId = Objects.requireNonNull($.privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
