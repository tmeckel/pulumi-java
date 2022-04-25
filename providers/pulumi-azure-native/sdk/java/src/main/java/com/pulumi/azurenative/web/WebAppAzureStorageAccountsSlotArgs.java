// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.AzureStorageInfoValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppAzureStorageAccountsSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAzureStorageAccountsSlotArgs Empty = new WebAppAzureStorageAccountsSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Azure storage accounts.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties;

    /**
     * @return Azure storage accounts.
     * 
     */
    public Optional<Output<Map<String,AzureStorageInfoValueArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the Azure storage account configurations for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will update the Azure storage account configurations for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    private WebAppAzureStorageAccountsSlotArgs() {}

    private WebAppAzureStorageAccountsSlotArgs(WebAppAzureStorageAccountsSlotArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAzureStorageAccountsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAzureStorageAccountsSlotArgs $;

        public Builder() {
            $ = new WebAppAzureStorageAccountsSlotArgs();
        }

        public Builder(WebAppAzureStorageAccountsSlotArgs defaults) {
            $ = new WebAppAzureStorageAccountsSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Azure storage accounts.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Azure storage accounts.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,AzureStorageInfoValueArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will update the Azure storage account configurations for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will update the Azure storage account configurations for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public WebAppAzureStorageAccountsSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
