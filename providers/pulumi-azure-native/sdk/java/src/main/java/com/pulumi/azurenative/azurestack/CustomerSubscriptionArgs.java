// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomerSubscriptionArgs Empty = new CustomerSubscriptionArgs();

    /**
     * Name of the product.
     * 
     */
    @Import(name="customerSubscriptionName")
    private @Nullable Output<String> customerSubscriptionName;

    /**
     * @return Name of the product.
     * 
     */
    public Optional<Output<String>> customerSubscriptionName() {
        return Optional.ofNullable(this.customerSubscriptionName);
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
    private Output<String> registrationName;

    /**
     * @return Name of the Azure Stack registration.
     * 
     */
    public Output<String> registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    /**
     * @return Name of the resource group.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Tenant Id.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant Id.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private CustomerSubscriptionArgs() {}

    private CustomerSubscriptionArgs(CustomerSubscriptionArgs $) {
        this.customerSubscriptionName = $.customerSubscriptionName;
        this.registrationName = $.registrationName;
        this.resourceGroup = $.resourceGroup;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerSubscriptionArgs $;

        public Builder() {
            $ = new CustomerSubscriptionArgs();
        }

        public Builder(CustomerSubscriptionArgs defaults) {
            $ = new CustomerSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerSubscriptionName Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder customerSubscriptionName(@Nullable Output<String> customerSubscriptionName) {
            $.customerSubscriptionName = customerSubscriptionName;
            return this;
        }

        /**
         * @param customerSubscriptionName Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder customerSubscriptionName(String customerSubscriptionName) {
            return customerSubscriptionName(Output.of(customerSubscriptionName));
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(Output<String> registrationName) {
            $.registrationName = registrationName;
            return this;
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(String registrationName) {
            return registrationName(Output.of(registrationName));
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param tenantId Tenant Id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant Id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public CustomerSubscriptionArgs build() {
            $.registrationName = Objects.requireNonNull($.registrationName, "expected parameter 'registrationName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
