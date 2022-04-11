// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis;

import io.pulumi.azurenative.changeanalysis.inputs.ConfigurationProfileResourcePropertiesArgs;
import io.pulumi.azurenative.changeanalysis.inputs.ResourceIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileArgs Empty = new ConfigurationProfileArgs();

    /**
     * The identity block returned by ARM resource that supports managed identity.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The location where the resource is to be deployed.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the configuration profile. The profile name should be set to 'default', all other names will be overwritten.
     * 
     */
    @Import(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName == null ? Codegen.empty() : this.profileName;
    }

    /**
     * The properties of a configuration profile.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ConfigurationProfileResourcePropertiesArgs> properties;

    public Output<ConfigurationProfileResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public ConfigurationProfileArgs(
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> profileName,
        @Nullable Output<ConfigurationProfileResourcePropertiesArgs> properties) {
        this.identity = identity;
        this.location = location;
        this.profileName = profileName;
        this.properties = properties;
    }

    private ConfigurationProfileArgs() {
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.profileName = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> profileName;
        private @Nullable Output<ConfigurationProfileResourcePropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.profileName = defaults.profileName;
    	      this.properties = defaults.properties;
        }

        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = Codegen.ofNullable(profileName);
            return this;
        }
        public Builder properties(@Nullable Output<ConfigurationProfileResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ConfigurationProfileResourcePropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public ConfigurationProfileArgs build() {
            return new ConfigurationProfileArgs(identity, location, profileName, properties);
        }
    }
}
