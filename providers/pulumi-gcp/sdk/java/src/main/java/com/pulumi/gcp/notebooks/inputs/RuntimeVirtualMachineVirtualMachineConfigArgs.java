// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigArgs();

    /**
     * The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="acceleratorConfig")
    private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs> acceleratorConfig;

    /**
     * @return The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs>> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }

    /**
     * Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImages")
    private @Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs>> containerImages;

    /**
     * @return Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs>>> containerImages() {
        return Optional.ofNullable(this.containerImages);
    }

    /**
     * Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    @Import(name="dataDisk", required=true)
    private Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs> dataDisk;

    /**
     * @return Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    public Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs> dataDisk() {
        return this.dataDisk;
    }

    /**
     * Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs> encryptionConfig;

    /**
     * @return Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * - 
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    @Import(name="guestAttributes")
    private @Nullable Output<Map<String,String>> guestAttributes;

    /**
     * @return -
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    public Optional<Output<Map<String,String>>> guestAttributes() {
        return Optional.ofNullable(this.guestAttributes);
    }

    /**
     * If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    @Import(name="internalIpOnly")
    private @Nullable Output<Boolean> internalIpOnly;

    /**
     * @return If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    public Optional<Output<Boolean>> internalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }

    /**
     * Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The Compute Engine machine type used for runtimes.
     * 
     */
    @Import(name="machineType", required=true)
    private Output<String> machineType;

    /**
     * @return The Compute Engine machine type used for runtimes.
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the &#34;default&#34; network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network &amp; subnet are empty)
     * * Consumer Project VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the &#34;default&#34; network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network &amp; subnet are empty)
     * * Consumer Project VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<String> nicType;

    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    public Optional<Output<String>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;

    /**
     * @return Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * - 
     * The zone where the virtual machine is located.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return -
     * The zone where the virtual machine is located.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private RuntimeVirtualMachineVirtualMachineConfigArgs() {}

    private RuntimeVirtualMachineVirtualMachineConfigArgs(RuntimeVirtualMachineVirtualMachineConfigArgs $) {
        this.acceleratorConfig = $.acceleratorConfig;
        this.containerImages = $.containerImages;
        this.dataDisk = $.dataDisk;
        this.encryptionConfig = $.encryptionConfig;
        this.guestAttributes = $.guestAttributes;
        this.internalIpOnly = $.internalIpOnly;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.network = $.network;
        this.nicType = $.nicType;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.subnet = $.subnet;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeVirtualMachineVirtualMachineConfigArgs $;

        public Builder() {
            $ = new RuntimeVirtualMachineVirtualMachineConfigArgs();
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigArgs defaults) {
            $ = new RuntimeVirtualMachineVirtualMachineConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorConfig The Compute Engine accelerator configuration for this runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs> acceleratorConfig) {
            $.acceleratorConfig = acceleratorConfig;
            return this;
        }

        /**
         * @param acceleratorConfig The Compute Engine accelerator configuration for this runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs acceleratorConfig) {
            return acceleratorConfig(Output.of(acceleratorConfig));
        }

        /**
         * @param containerImages Use a list of container images to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(@Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs>> containerImages) {
            $.containerImages = containerImages;
            return this;
        }

        /**
         * @param containerImages Use a list of container images to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(List<RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs> containerImages) {
            return containerImages(Output.of(containerImages));
        }

        /**
         * @param containerImages Use a list of container images to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs... containerImages) {
            return containerImages(List.of(containerImages));
        }

        /**
         * @param dataDisk Data disk option configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataDisk(Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs> dataDisk) {
            $.dataDisk = dataDisk;
            return this;
        }

        /**
         * @param dataDisk Data disk option configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataDisk(RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs dataDisk) {
            return dataDisk(Output.of(dataDisk));
        }

        /**
         * @param encryptionConfig Encryption settings for virtual machine data disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Encryption settings for virtual machine data disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param guestAttributes -
         * The Compute Engine guest attributes. (see [Project and instance
         * guest attributes](https://cloud.google.com/compute/docs/
         * storing-retrieving-metadata#guest_attributes)).
         * 
         * @return builder
         * 
         */
        public Builder guestAttributes(@Nullable Output<Map<String,String>> guestAttributes) {
            $.guestAttributes = guestAttributes;
            return this;
        }

        /**
         * @param guestAttributes -
         * The Compute Engine guest attributes. (see [Project and instance
         * guest attributes](https://cloud.google.com/compute/docs/
         * storing-retrieving-metadata#guest_attributes)).
         * 
         * @return builder
         * 
         */
        public Builder guestAttributes(Map<String,String> guestAttributes) {
            return guestAttributes(Output.of(guestAttributes));
        }

        /**
         * @param internalIpOnly If true, runtime will only have internal IP addresses. By default,
         * runtimes are not restricted to internal IP addresses, and will
         * have ephemeral external IP addresses assigned to each vm. This
         * `internal_ip_only` restriction can only be enabled for subnetwork
         * enabled networks, and all dependencies must be configured to be
         * accessible without external IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder internalIpOnly(@Nullable Output<Boolean> internalIpOnly) {
            $.internalIpOnly = internalIpOnly;
            return this;
        }

        /**
         * @param internalIpOnly If true, runtime will only have internal IP addresses. By default,
         * runtimes are not restricted to internal IP addresses, and will
         * have ephemeral external IP addresses assigned to each vm. This
         * `internal_ip_only` restriction can only be enabled for subnetwork
         * enabled networks, and all dependencies must be configured to be
         * accessible without external IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder internalIpOnly(Boolean internalIpOnly) {
            return internalIpOnly(Output.of(internalIpOnly));
        }

        /**
         * @param labels Labels to apply to this disk. These can be later modified
         * by the disks.setLabels method. This field is only
         * applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this disk. These can be later modified
         * by the disks.setLabels method. This field is only
         * applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param machineType The Compute Engine machine type used for runtimes.
         * 
         * @return builder
         * 
         */
        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The Compute Engine machine type used for runtimes.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param metadata The Compute Engine metadata entries to add to virtual machine.
         * (see [Project and instance metadata](https://cloud.google.com
         * /compute/docs/storing-retrieving-metadata#project_and_instance
         * _metadata)).
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The Compute Engine metadata entries to add to virtual machine.
         * (see [Project and instance metadata](https://cloud.google.com
         * /compute/docs/storing-retrieving-metadata#project_and_instance
         * _metadata)).
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param network The Compute Engine network to be used for machine communications.
         * Cannot be specified with subnetwork. If neither `network` nor
         * `subnet` is specified, the &#34;default&#34; network of the project is
         * used, if it exists. A full URL or partial URI. Examples:
         * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
         *   regions/global/default`
         * * `projects/[project_id]/regions/global/default`
         *   Runtimes are managed resources inside Google Infrastructure.
         *   Runtimes support the following network configurations:
         * * Google Managed Network (Network &amp; subnet are empty)
         * * Consumer Project VPC (network &amp; subnet are required). Requires
         *   configuring Private Service Access.
         * * Shared VPC (network &amp; subnet are required). Requires
         *   configuring Private Service Access.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The Compute Engine network to be used for machine communications.
         * Cannot be specified with subnetwork. If neither `network` nor
         * `subnet` is specified, the &#34;default&#34; network of the project is
         * used, if it exists. A full URL or partial URI. Examples:
         * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
         *   regions/global/default`
         * * `projects/[project_id]/regions/global/default`
         *   Runtimes are managed resources inside Google Infrastructure.
         *   Runtimes support the following network configurations:
         * * Google Managed Network (Network &amp; subnet are empty)
         * * Consumer Project VPC (network &amp; subnet are required). Requires
         *   configuring Private Service Access.
         * * Shared VPC (network &amp; subnet are required). Requires
         *   configuring Private Service Access.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. This may be gVNIC
         * or VirtioNet.
         * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
         * 
         * @return builder
         * 
         */
        public Builder nicType(@Nullable Output<String> nicType) {
            $.nicType = nicType;
            return this;
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. This may be gVNIC
         * or VirtioNet.
         * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
         * 
         * @return builder
         * 
         */
        public Builder nicType(String nicType) {
            return nicType(Output.of(nicType));
        }

        /**
         * @param shieldedInstanceConfig Shielded VM Instance configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        /**
         * @param shieldedInstanceConfig Shielded VM Instance configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        /**
         * @param subnet The Compute Engine subnetwork to be used for machine
         * communications. Cannot be specified with network. A full URL or
         * partial URI are valid. Examples:
         * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
         *   regions/us-east1/subnetworks/sub0`
         * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The Compute Engine subnetwork to be used for machine
         * communications. Cannot be specified with network. A full URL or
         * partial URI are valid. Examples:
         * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
         *   regions/us-east1/subnetworks/sub0`
         * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param tags The Compute Engine tags to add to runtime (see [Tagging instances]
         * (https://cloud.google.com/compute/docs/
         * label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The Compute Engine tags to add to runtime (see [Tagging instances]
         * (https://cloud.google.com/compute/docs/
         * label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The Compute Engine tags to add to runtime (see [Tagging instances]
         * (https://cloud.google.com/compute/docs/
         * label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param zone -
         * The zone where the virtual machine is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone -
         * The zone where the virtual machine is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public RuntimeVirtualMachineVirtualMachineConfigArgs build() {
            $.dataDisk = Objects.requireNonNull($.dataDisk, "expected parameter 'dataDisk' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
