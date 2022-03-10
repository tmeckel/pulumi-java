// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAFDOriginGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAFDOriginGroupArgs Empty = new GetAFDOriginGroupArgs();

    /**
     * Name of the origin group which is unique within the endpoint.
     * 
     */
    @InputImport(name="originGroupName", required=true)
      private final String originGroupName;

    public String getOriginGroupName() {
        return this.originGroupName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAFDOriginGroupArgs(
        String originGroupName,
        String profileName,
        String resourceGroupName) {
        this.originGroupName = Objects.requireNonNull(originGroupName, "expected parameter 'originGroupName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAFDOriginGroupArgs() {
        this.originGroupName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String originGroupName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDOriginGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originGroupName = defaults.originGroupName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder originGroupName(String originGroupName) {
            this.originGroupName = Objects.requireNonNull(originGroupName);
            return this;
        }

        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAFDOriginGroupArgs build() {
            return new GetAFDOriginGroupArgs(originGroupName, profileName, resourceGroupName);
        }
    }
}
