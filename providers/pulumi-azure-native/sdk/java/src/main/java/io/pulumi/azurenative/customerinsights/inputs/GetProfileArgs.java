// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
      private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * Locale of profile to retrieve, default is en-us.
     * 
     */
    @InputImport(name="localeCode")
      private final @Nullable String localeCode;

    public Optional<String> getLocaleCode() {
        return this.localeCode == null ? Optional.empty() : Optional.ofNullable(this.localeCode);
    }

    /**
     * The name of the profile.
     * 
     */
    @InputImport(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetProfileArgs(
        String hubName,
        @Nullable String localeCode,
        String profileName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.localeCode = localeCode;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetProfileArgs() {
        this.hubName = null;
        this.localeCode = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private @Nullable String localeCode;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.localeCode = defaults.localeCode;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder hubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder localeCode(@Nullable String localeCode) {
            this.localeCode = localeCode;
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
        public GetProfileArgs build() {
            return new GetProfileArgs(hubName, localeCode, profileName, resourceGroupName);
        }
    }
}
