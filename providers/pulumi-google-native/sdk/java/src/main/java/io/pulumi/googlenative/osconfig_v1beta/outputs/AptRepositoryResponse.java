// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AptRepositoryResponse {
    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * 
     */
    private final String archiveType;
    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    private final List<String> components;
    /**
     * Distribution of this repository.
     * 
     */
    private final String distribution;
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg` containing all the keys in any applied guest policy.
     * 
     */
    private final String gpgKey;
    /**
     * URI for this repository.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"archiveType","components","distribution","gpgKey","uri"})
    private AptRepositoryResponse(
        String archiveType,
        List<String> components,
        String distribution,
        String gpgKey,
        String uri) {
        this.archiveType = Objects.requireNonNull(archiveType);
        this.components = Objects.requireNonNull(components);
        this.distribution = Objects.requireNonNull(distribution);
        this.gpgKey = Objects.requireNonNull(gpgKey);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * 
     */
    public String getArchiveType() {
        return this.archiveType;
    }
    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    public List<String> getComponents() {
        return this.components;
    }
    /**
     * Distribution of this repository.
     * 
     */
    public String getDistribution() {
        return this.distribution;
    }
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg` containing all the keys in any applied guest policy.
     * 
     */
    public String getGpgKey() {
        return this.gpgKey;
    }
    /**
     * URI for this repository.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(AptRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder setArchiveType(String archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }

        public Builder setComponents(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder setDistribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setGpgKey(String gpgKey) {
            this.gpgKey = Objects.requireNonNull(gpgKey);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public AptRepositoryResponse build() {
            return new AptRepositoryResponse(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
