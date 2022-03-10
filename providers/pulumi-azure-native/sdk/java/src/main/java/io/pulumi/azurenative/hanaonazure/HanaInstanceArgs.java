// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure;

import io.pulumi.azurenative.hanaonazure.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.hanaonazure.inputs.OSProfileArgs;
import io.pulumi.azurenative.hanaonazure.inputs.StorageProfileArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HanaInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HanaInstanceArgs Empty = new HanaInstanceArgs();

    /**
     * Name of the SAP HANA on Azure instance.
     * 
     */
    @InputImport(name="hanaInstanceName")
      private final @Nullable Input<String> hanaInstanceName;

    public Input<String> getHanaInstanceName() {
        return this.hanaInstanceName == null ? Input.empty() : this.hanaInstanceName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies the network settings for the HANA instance.
     * 
     */
    @InputImport(name="networkProfile")
      private final @Nullable Input<NetworkProfileArgs> networkProfile;

    public Input<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * Specifies the operating system settings for the HANA instance.
     * 
     */
    @InputImport(name="osProfile")
      private final @Nullable Input<OSProfileArgs> osProfile;

    public Input<OSProfileArgs> getOsProfile() {
        return this.osProfile == null ? Input.empty() : this.osProfile;
    }

    /**
     * ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
     */
    @InputImport(name="partnerNodeId")
      private final @Nullable Input<String> partnerNodeId;

    public Input<String> getPartnerNodeId() {
        return this.partnerNodeId == null ? Input.empty() : this.partnerNodeId;
    }

    /**
     * Name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the storage settings for the HANA instance disks.
     * 
     */
    @InputImport(name="storageProfile")
      private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public HanaInstanceArgs(
        @Nullable Input<String> hanaInstanceName,
        @Nullable Input<String> location,
        @Nullable Input<NetworkProfileArgs> networkProfile,
        @Nullable Input<OSProfileArgs> osProfile,
        @Nullable Input<String> partnerNodeId,
        Input<String> resourceGroupName,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Map<String,String>> tags) {
        this.hanaInstanceName = hanaInstanceName;
        this.location = location;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.partnerNodeId = partnerNodeId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageProfile = storageProfile;
        this.tags = tags;
    }

    private HanaInstanceArgs() {
        this.hanaInstanceName = Input.empty();
        this.location = Input.empty();
        this.networkProfile = Input.empty();
        this.osProfile = Input.empty();
        this.partnerNodeId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageProfile = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HanaInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hanaInstanceName;
        private @Nullable Input<String> location;
        private @Nullable Input<NetworkProfileArgs> networkProfile;
        private @Nullable Input<OSProfileArgs> osProfile;
        private @Nullable Input<String> partnerNodeId;
        private Input<String> resourceGroupName;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(HanaInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hanaInstanceName = defaults.hanaInstanceName;
    	      this.location = defaults.location;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.partnerNodeId = defaults.partnerNodeId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
        }

        public Builder hanaInstanceName(@Nullable Input<String> hanaInstanceName) {
            this.hanaInstanceName = hanaInstanceName;
            return this;
        }

        public Builder hanaInstanceName(@Nullable String hanaInstanceName) {
            this.hanaInstanceName = Input.ofNullable(hanaInstanceName);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder networkProfile(@Nullable Input<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder osProfile(@Nullable Input<OSProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(@Nullable OSProfileArgs osProfile) {
            this.osProfile = Input.ofNullable(osProfile);
            return this;
        }

        public Builder partnerNodeId(@Nullable Input<String> partnerNodeId) {
            this.partnerNodeId = partnerNodeId;
            return this;
        }

        public Builder partnerNodeId(@Nullable String partnerNodeId) {
            this.partnerNodeId = Input.ofNullable(partnerNodeId);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder storageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public HanaInstanceArgs build() {
            return new HanaInstanceArgs(hanaInstanceName, location, networkProfile, osProfile, partnerNodeId, resourceGroupName, storageProfile, tags);
        }
    }
}
