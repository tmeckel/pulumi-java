// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageRepositoryAptGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryAptGetArgs Empty = new GuestPoliciesPackageRepositoryAptGetArgs();

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * Default value is `DEB`.
     * Possible values are `DEB` and `DEB_SRC`.
     * 
     */
    @InputImport(name="archiveType")
      private final @Nullable Input<String> archiveType;

    public Input<String> getArchiveType() {
        return this.archiveType == null ? Input.empty() : this.archiveType;
    }

    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    @InputImport(name="components", required=true)
      private final Input<List<String>> components;

    public Input<List<String>> getComponents() {
        return this.components;
    }

    /**
     * Distribution of this repository.
     * 
     */
    @InputImport(name="distribution", required=true)
      private final Input<String> distribution;

    public Input<String> getDistribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at
     * /etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg containing all the keys in any applied guest policy.
     * 
     */
    @InputImport(name="gpgKey")
      private final @Nullable Input<String> gpgKey;

    public Input<String> getGpgKey() {
        return this.gpgKey == null ? Input.empty() : this.gpgKey;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    @InputImport(name="uri", required=true)
      private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public GuestPoliciesPackageRepositoryAptGetArgs(
        @Nullable Input<String> archiveType,
        Input<List<String>> components,
        Input<String> distribution,
        @Nullable Input<String> gpgKey,
        Input<String> uri) {
        this.archiveType = archiveType;
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = gpgKey;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GuestPoliciesPackageRepositoryAptGetArgs() {
        this.archiveType = Input.empty();
        this.components = Input.empty();
        this.distribution = Input.empty();
        this.gpgKey = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryAptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> archiveType;
        private Input<List<String>> components;
        private Input<String> distribution;
        private @Nullable Input<String> gpgKey;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryAptGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(@Nullable Input<String> archiveType) {
            this.archiveType = archiveType;
            return this;
        }

        public Builder archiveType(@Nullable String archiveType) {
            this.archiveType = Input.ofNullable(archiveType);
            return this;
        }

        public Builder components(Input<List<String>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder components(List<String> components) {
            this.components = Input.of(Objects.requireNonNull(components));
            return this;
        }

        public Builder distribution(Input<String> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder distribution(String distribution) {
            this.distribution = Input.of(Objects.requireNonNull(distribution));
            return this;
        }

        public Builder gpgKey(@Nullable Input<String> gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }

        public Builder gpgKey(@Nullable String gpgKey) {
            this.gpgKey = Input.ofNullable(gpgKey);
            return this;
        }

        public Builder uri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }
        public GuestPoliciesPackageRepositoryAptGetArgs build() {
            return new GuestPoliciesPackageRepositoryAptGetArgs(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
