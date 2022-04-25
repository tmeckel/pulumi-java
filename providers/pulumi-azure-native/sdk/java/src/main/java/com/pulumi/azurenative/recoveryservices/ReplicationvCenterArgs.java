// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.recoveryservices.inputs.AddVCenterRequestPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationvCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationvCenterArgs Empty = new ReplicationvCenterArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
    private Output<String> fabricName;

    /**
     * @return Fabric name.
     * 
     */
    public Output<String> fabricName() {
        return this.fabricName;
    }

    /**
     * The properties of an add vCenter request.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<AddVCenterRequestPropertiesArgs> properties;

    /**
     * @return The properties of an add vCenter request.
     * 
     */
    public Optional<Output<AddVCenterRequestPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * vCenter name.
     * 
     */
    @Import(name="vCenterName")
    private @Nullable Output<String> vCenterName;

    /**
     * @return vCenter name.
     * 
     */
    public Optional<Output<String>> vCenterName() {
        return Optional.ofNullable(this.vCenterName);
    }

    private ReplicationvCenterArgs() {}

    private ReplicationvCenterArgs(ReplicationvCenterArgs $) {
        this.fabricName = $.fabricName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.vCenterName = $.vCenterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationvCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationvCenterArgs $;

        public Builder() {
            $ = new ReplicationvCenterArgs();
        }

        public Builder(ReplicationvCenterArgs defaults) {
            $ = new ReplicationvCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(Output<String> fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            return fabricName(Output.of(fabricName));
        }

        /**
         * @param properties The properties of an add vCenter request.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<AddVCenterRequestPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties of an add vCenter request.
         * 
         * @return builder
         * 
         */
        public Builder properties(AddVCenterRequestPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param vCenterName vCenter name.
         * 
         * @return builder
         * 
         */
        public Builder vCenterName(@Nullable Output<String> vCenterName) {
            $.vCenterName = vCenterName;
            return this;
        }

        /**
         * @param vCenterName vCenter name.
         * 
         * @return builder
         * 
         */
        public Builder vCenterName(String vCenterName) {
            return vCenterName(Output.of(vCenterName));
        }

        public ReplicationvCenterArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
