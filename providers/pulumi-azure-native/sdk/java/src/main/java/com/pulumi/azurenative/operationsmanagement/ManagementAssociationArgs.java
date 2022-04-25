// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement;

import com.pulumi.azurenative.operationsmanagement.inputs.ManagementAssociationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementAssociationArgs Empty = new ManagementAssociationArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * User ManagementAssociation Name.
     * 
     */
    @Import(name="managementAssociationName")
    private @Nullable Output<String> managementAssociationName;

    /**
     * @return User ManagementAssociation Name.
     * 
     */
    public Optional<Output<String>> managementAssociationName() {
        return Optional.ofNullable(this.managementAssociationName);
    }

    /**
     * Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ManagementAssociationPropertiesArgs> properties;

    /**
     * @return Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     * 
     */
    public Optional<Output<ManagementAssociationPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Provider name for the parent resource.
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Provider name for the parent resource.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to get. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Parent resource name.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return Parent resource name.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Resource type for the parent resource
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return Resource type for the parent resource
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    private ManagementAssociationArgs() {}

    private ManagementAssociationArgs(ManagementAssociationArgs $) {
        this.location = $.location;
        this.managementAssociationName = $.managementAssociationName;
        this.properties = $.properties;
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementAssociationArgs $;

        public Builder() {
            $ = new ManagementAssociationArgs();
        }

        public Builder(ManagementAssociationArgs defaults) {
            $ = new ManagementAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementAssociationName User ManagementAssociation Name.
         * 
         * @return builder
         * 
         */
        public Builder managementAssociationName(@Nullable Output<String> managementAssociationName) {
            $.managementAssociationName = managementAssociationName;
            return this;
        }

        /**
         * @param managementAssociationName User ManagementAssociation Name.
         * 
         * @return builder
         * 
         */
        public Builder managementAssociationName(String managementAssociationName) {
            return managementAssociationName(Output.of(managementAssociationName));
        }

        /**
         * @param properties Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ManagementAssociationPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(ManagementAssociationPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param providerName Provider name for the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Provider name for the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName Parent resource name.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Parent resource name.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType Resource type for the parent resource
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Resource type for the parent resource
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public ManagementAssociationArgs build() {
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
