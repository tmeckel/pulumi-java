// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HcxEnterpriseSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final HcxEnterpriseSiteArgs Empty = new HcxEnterpriseSiteArgs();

    /**
     * Name of the HCX Enterprise Site in the private cloud
     * 
     */
    @Import(name="hcxEnterpriseSiteName")
      private final @Nullable Output<String> hcxEnterpriseSiteName;

    public Output<String> getHcxEnterpriseSiteName() {
        return this.hcxEnterpriseSiteName == null ? Codegen.empty() : this.hcxEnterpriseSiteName;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final Output<String> privateCloudName;

    public Output<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public HcxEnterpriseSiteArgs(
        @Nullable Output<String> hcxEnterpriseSiteName,
        Output<String> privateCloudName,
        Output<String> resourceGroupName) {
        this.hcxEnterpriseSiteName = hcxEnterpriseSiteName;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private HcxEnterpriseSiteArgs() {
        this.hcxEnterpriseSiteName = Codegen.empty();
        this.privateCloudName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HcxEnterpriseSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hcxEnterpriseSiteName;
        private Output<String> privateCloudName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(HcxEnterpriseSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hcxEnterpriseSiteName = defaults.hcxEnterpriseSiteName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder hcxEnterpriseSiteName(@Nullable Output<String> hcxEnterpriseSiteName) {
            this.hcxEnterpriseSiteName = hcxEnterpriseSiteName;
            return this;
        }
        public Builder hcxEnterpriseSiteName(@Nullable String hcxEnterpriseSiteName) {
            this.hcxEnterpriseSiteName = Codegen.ofNullable(hcxEnterpriseSiteName);
            return this;
        }
        public Builder privateCloudName(Output<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Output.of(Objects.requireNonNull(privateCloudName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public HcxEnterpriseSiteArgs build() {
            return new HcxEnterpriseSiteArgs(hcxEnterpriseSiteName, privateCloudName, resourceGroupName);
        }
    }
}
