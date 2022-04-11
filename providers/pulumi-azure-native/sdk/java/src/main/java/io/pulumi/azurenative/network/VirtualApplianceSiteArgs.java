// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.Office365PolicyPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualApplianceSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualApplianceSiteArgs Empty = new VirtualApplianceSiteArgs();

    /**
     * Address Prefix.
     * 
     */
    @Import(name="addressPrefix")
      private final @Nullable Output<String> addressPrefix;

    public Output<String> getAddressPrefix() {
        return this.addressPrefix == null ? Codegen.empty() : this.addressPrefix;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Name of the virtual appliance site.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the Network Virtual Appliance.
     * 
     */
    @Import(name="networkVirtualApplianceName", required=true)
      private final Output<String> networkVirtualApplianceName;

    public Output<String> getNetworkVirtualApplianceName() {
        return this.networkVirtualApplianceName;
    }

    /**
     * Office 365 Policy.
     * 
     */
    @Import(name="o365Policy")
      private final @Nullable Output<Office365PolicyPropertiesArgs> o365Policy;

    public Output<Office365PolicyPropertiesArgs> getO365Policy() {
        return this.o365Policy == null ? Codegen.empty() : this.o365Policy;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the site.
     * 
     */
    @Import(name="siteName")
      private final @Nullable Output<String> siteName;

    public Output<String> getSiteName() {
        return this.siteName == null ? Codegen.empty() : this.siteName;
    }

    public VirtualApplianceSiteArgs(
        @Nullable Output<String> addressPrefix,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        Output<String> networkVirtualApplianceName,
        @Nullable Output<Office365PolicyPropertiesArgs> o365Policy,
        Output<String> resourceGroupName,
        @Nullable Output<String> siteName) {
        this.addressPrefix = addressPrefix;
        this.id = id;
        this.name = name;
        this.networkVirtualApplianceName = Objects.requireNonNull(networkVirtualApplianceName, "expected parameter 'networkVirtualApplianceName' to be non-null");
        this.o365Policy = o365Policy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = siteName;
    }

    private VirtualApplianceSiteArgs() {
        this.addressPrefix = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.networkVirtualApplianceName = Codegen.empty();
        this.o365Policy = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.siteName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplianceSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressPrefix;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private Output<String> networkVirtualApplianceName;
        private @Nullable Output<Office365PolicyPropertiesArgs> o365Policy;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplianceSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkVirtualApplianceName = defaults.networkVirtualApplianceName;
    	      this.o365Policy = defaults.o365Policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
        }

        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Codegen.ofNullable(addressPrefix);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkVirtualApplianceName(Output<String> networkVirtualApplianceName) {
            this.networkVirtualApplianceName = Objects.requireNonNull(networkVirtualApplianceName);
            return this;
        }
        public Builder networkVirtualApplianceName(String networkVirtualApplianceName) {
            this.networkVirtualApplianceName = Output.of(Objects.requireNonNull(networkVirtualApplianceName));
            return this;
        }
        public Builder o365Policy(@Nullable Output<Office365PolicyPropertiesArgs> o365Policy) {
            this.o365Policy = o365Policy;
            return this;
        }
        public Builder o365Policy(@Nullable Office365PolicyPropertiesArgs o365Policy) {
            this.o365Policy = Codegen.ofNullable(o365Policy);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder siteName(@Nullable Output<String> siteName) {
            this.siteName = siteName;
            return this;
        }
        public Builder siteName(@Nullable String siteName) {
            this.siteName = Codegen.ofNullable(siteName);
            return this;
        }        public VirtualApplianceSiteArgs build() {
            return new VirtualApplianceSiteArgs(addressPrefix, id, name, networkVirtualApplianceName, o365Policy, resourceGroupName, siteName);
        }
    }
}
