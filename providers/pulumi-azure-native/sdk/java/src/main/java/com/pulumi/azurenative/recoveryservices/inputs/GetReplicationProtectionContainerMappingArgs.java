// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationProtectionContainerMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationProtectionContainerMappingArgs Empty = new GetReplicationProtectionContainerMappingArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
    private String fabricName;

    /**
     * @return Fabric name.
     * 
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Protection Container mapping name.
     * 
     */
    @Import(name="mappingName", required=true)
    private String mappingName;

    /**
     * @return Protection Container mapping name.
     * 
     */
    public String mappingName() {
        return this.mappingName;
    }

    /**
     * Protection container name.
     * 
     */
    @Import(name="protectionContainerName", required=true)
    private String protectionContainerName;

    /**
     * @return Protection container name.
     * 
     */
    public String protectionContainerName() {
        return this.protectionContainerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetReplicationProtectionContainerMappingArgs() {}

    private GetReplicationProtectionContainerMappingArgs(GetReplicationProtectionContainerMappingArgs $) {
        this.fabricName = $.fabricName;
        this.mappingName = $.mappingName;
        this.protectionContainerName = $.protectionContainerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationProtectionContainerMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationProtectionContainerMappingArgs $;

        public Builder() {
            $ = new GetReplicationProtectionContainerMappingArgs();
        }

        public Builder(GetReplicationProtectionContainerMappingArgs defaults) {
            $ = new GetReplicationProtectionContainerMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param mappingName Protection Container mapping name.
         * 
         * @return builder
         * 
         */
        public Builder mappingName(String mappingName) {
            $.mappingName = mappingName;
            return this;
        }

        /**
         * @param protectionContainerName Protection container name.
         * 
         * @return builder
         * 
         */
        public Builder protectionContainerName(String protectionContainerName) {
            $.protectionContainerName = protectionContainerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetReplicationProtectionContainerMappingArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.mappingName = Objects.requireNonNull($.mappingName, "expected parameter 'mappingName' to be non-null");
            $.protectionContainerName = Objects.requireNonNull($.protectionContainerName, "expected parameter 'protectionContainerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
