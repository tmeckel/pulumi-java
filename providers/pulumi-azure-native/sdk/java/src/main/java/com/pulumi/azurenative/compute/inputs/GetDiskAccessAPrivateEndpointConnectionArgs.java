// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskAccessAPrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskAccessAPrivateEndpointConnectionArgs Empty = new GetDiskAccessAPrivateEndpointConnectionArgs();

    /**
     * The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskAccessName", required=true)
    private String diskAccessName;

    /**
     * @return The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    public String diskAccessName() {
        return this.diskAccessName;
    }

    /**
     * The name of the private endpoint connection
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDiskAccessAPrivateEndpointConnectionArgs() {}

    private GetDiskAccessAPrivateEndpointConnectionArgs(GetDiskAccessAPrivateEndpointConnectionArgs $) {
        this.diskAccessName = $.diskAccessName;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskAccessAPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskAccessAPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetDiskAccessAPrivateEndpointConnectionArgs();
        }

        public Builder(GetDiskAccessAPrivateEndpointConnectionArgs defaults) {
            $ = new GetDiskAccessAPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskAccessName The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder diskAccessName(String diskAccessName) {
            $.diskAccessName = diskAccessName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDiskAccessAPrivateEndpointConnectionArgs build() {
            $.diskAccessName = Objects.requireNonNull($.diskAccessName, "expected parameter 'diskAccessName' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
