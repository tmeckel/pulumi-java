// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyInventoryFilterArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource groups provide a mechanism to group OS policy resources. Resource groups enable OS policy authors to create a single OS policy to be applied to VMs running different operating Systems. When the OS policy is applied to a target VM, the appropriate resource group within the OS policy is selected based on the `OSFilter` specified within the resource group.
 * 
 */
public final class OSPolicyResourceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceGroupArgs Empty = new OSPolicyResourceGroupArgs();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @Import(name="inventoryFilters")
    private @Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters;

    /**
     * @return List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    public Optional<Output<List<OSPolicyInventoryFilterArgs>>> inventoryFilters() {
        return Optional.ofNullable(this.inventoryFilters);
    }

    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @Import(name="resources", required=true)
    private Output<List<OSPolicyResourceArgs>> resources;

    /**
     * @return List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    public Output<List<OSPolicyResourceArgs>> resources() {
        return this.resources;
    }

    private OSPolicyResourceGroupArgs() {}

    private OSPolicyResourceGroupArgs(OSPolicyResourceGroupArgs $) {
        this.inventoryFilters = $.inventoryFilters;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceGroupArgs $;

        public Builder() {
            $ = new OSPolicyResourceGroupArgs();
        }

        public Builder(OSPolicyResourceGroupArgs defaults) {
            $ = new OSPolicyResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inventoryFilters List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
         * 
         * @return builder
         * 
         */
        public Builder inventoryFilters(@Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters) {
            $.inventoryFilters = inventoryFilters;
            return this;
        }

        /**
         * @param inventoryFilters List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
         * 
         * @return builder
         * 
         */
        public Builder inventoryFilters(List<OSPolicyInventoryFilterArgs> inventoryFilters) {
            return inventoryFilters(Output.of(inventoryFilters));
        }

        /**
         * @param inventoryFilters List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
         * 
         * @return builder
         * 
         */
        public Builder inventoryFilters(OSPolicyInventoryFilterArgs... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }

        /**
         * @param resources List of resources configured for this resource group. The resources are executed in the exact order specified here.
         * 
         * @return builder
         * 
         */
        public Builder resources(Output<List<OSPolicyResourceArgs>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources List of resources configured for this resource group. The resources are executed in the exact order specified here.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<OSPolicyResourceArgs> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources List of resources configured for this resource group. The resources are executed in the exact order specified here.
         * 
         * @return builder
         * 
         */
        public Builder resources(OSPolicyResourceArgs... resources) {
            return resources(List.of(resources));
        }

        public OSPolicyResourceGroupArgs build() {
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
