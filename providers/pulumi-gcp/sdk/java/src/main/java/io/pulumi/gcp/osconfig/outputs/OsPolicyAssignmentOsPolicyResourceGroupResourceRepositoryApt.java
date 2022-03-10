// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt {
    /**
     * Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
     * 
     */
    private final String archiveType;
    /**
     * Required. List of components for this repository. Must contain at least one item.
     * 
     */
    private final List<String> components;
    /**
     * Required. Distribution of this repository.
     * 
     */
    private final String distribution;
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    private final @Nullable String gpgKey;
    /**
     * Required. URI for this repository.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt(
        @OutputCustomType.Parameter("archiveType") String archiveType,
        @OutputCustomType.Parameter("components") List<String> components,
        @OutputCustomType.Parameter("distribution") String distribution,
        @OutputCustomType.Parameter("gpgKey") @Nullable String gpgKey,
        @OutputCustomType.Parameter("uri") String uri) {
        this.archiveType = archiveType;
        this.components = components;
        this.distribution = distribution;
        this.gpgKey = gpgKey;
        this.uri = uri;
    }

    /**
     * Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
     * 
    */
    public String getArchiveType() {
        return this.archiveType;
    }
    /**
     * Required. List of components for this repository. Must contain at least one item.
     * 
    */
    public List<String> getComponents() {
        return this.components;
    }
    /**
     * Required. Distribution of this repository.
     * 
    */
    public String getDistribution() {
        return this.distribution;
    }
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
    */
    public Optional<String> getGpgKey() {
        return Optional.ofNullable(this.gpgKey);
    }
    /**
     * Required. URI for this repository.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private @Nullable String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(String archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }

        public Builder components(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder distribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder gpgKey(@Nullable String gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
