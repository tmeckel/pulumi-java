// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.DedicatedHostLicenseTypes;
import io.pulumi.azurenative.compute.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided.
     * 
     */
    @InputImport(name="autoReplaceOnFailure")
      private final @Nullable Input<Boolean> autoReplaceOnFailure;

    public Input<Boolean> getAutoReplaceOnFailure() {
        return this.autoReplaceOnFailure == null ? Input.empty() : this.autoReplaceOnFailure;
    }

    /**
     * The name of the dedicated host group.
     * 
     */
    @InputImport(name="hostGroupName", required=true)
      private final Input<String> hostGroupName;

    public Input<String> getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * The name of the dedicated host .
     * 
     */
    @InputImport(name="hostName")
      private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    /**
     * Specifies the software license type that will be applied to the VMs deployed on the dedicated host. <br><br> Possible values are: <br><br> **None** <br><br> **Windows_Server_Hybrid** <br><br> **Windows_Server_Perpetual** <br><br> Default: **None**
     * 
     */
    @InputImport(name="licenseType")
      private final @Nullable Input<DedicatedHostLicenseTypes> licenseType;

    public Input<DedicatedHostLicenseTypes> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
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
     * Fault domain of the dedicated host within a dedicated host group.
     * 
     */
    @InputImport(name="platformFaultDomain")
      private final @Nullable Input<Integer> platformFaultDomain;

    public Input<Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain == null ? Input.empty() : this.platformFaultDomain;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
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

    public DedicatedHostArgs(
        @Nullable Input<Boolean> autoReplaceOnFailure,
        Input<String> hostGroupName,
        @Nullable Input<String> hostName,
        @Nullable Input<DedicatedHostLicenseTypes> licenseType,
        @Nullable Input<String> location,
        @Nullable Input<Integer> platformFaultDomain,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.autoReplaceOnFailure = autoReplaceOnFailure;
        this.hostGroupName = Objects.requireNonNull(hostGroupName, "expected parameter 'hostGroupName' to be non-null");
        this.hostName = hostName;
        this.licenseType = licenseType;
        this.location = location;
        this.platformFaultDomain = platformFaultDomain;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private DedicatedHostArgs() {
        this.autoReplaceOnFailure = Input.empty();
        this.hostGroupName = Input.empty();
        this.hostName = Input.empty();
        this.licenseType = Input.empty();
        this.location = Input.empty();
        this.platformFaultDomain = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoReplaceOnFailure;
        private Input<String> hostGroupName;
        private @Nullable Input<String> hostName;
        private @Nullable Input<DedicatedHostLicenseTypes> licenseType;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> platformFaultDomain;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoReplaceOnFailure = defaults.autoReplaceOnFailure;
    	      this.hostGroupName = defaults.hostGroupName;
    	      this.hostName = defaults.hostName;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.platformFaultDomain = defaults.platformFaultDomain;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder autoReplaceOnFailure(@Nullable Input<Boolean> autoReplaceOnFailure) {
            this.autoReplaceOnFailure = autoReplaceOnFailure;
            return this;
        }

        public Builder autoReplaceOnFailure(@Nullable Boolean autoReplaceOnFailure) {
            this.autoReplaceOnFailure = Input.ofNullable(autoReplaceOnFailure);
            return this;
        }

        public Builder hostGroupName(Input<String> hostGroupName) {
            this.hostGroupName = Objects.requireNonNull(hostGroupName);
            return this;
        }

        public Builder hostGroupName(String hostGroupName) {
            this.hostGroupName = Input.of(Objects.requireNonNull(hostGroupName));
            return this;
        }

        public Builder hostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder licenseType(@Nullable Input<DedicatedHostLicenseTypes> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(@Nullable DedicatedHostLicenseTypes licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
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

        public Builder platformFaultDomain(@Nullable Input<Integer> platformFaultDomain) {
            this.platformFaultDomain = platformFaultDomain;
            return this;
        }

        public Builder platformFaultDomain(@Nullable Integer platformFaultDomain) {
            this.platformFaultDomain = Input.ofNullable(platformFaultDomain);
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

        public Builder sku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
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
        public DedicatedHostArgs build() {
            return new DedicatedHostArgs(autoReplaceOnFailure, hostGroupName, hostName, licenseType, location, platformFaultDomain, resourceGroupName, sku, tags);
        }
    }
}
