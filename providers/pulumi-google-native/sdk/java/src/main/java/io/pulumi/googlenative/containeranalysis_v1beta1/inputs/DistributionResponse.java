// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This represents a particular channel of distribution for a given package. E.g., Debian's jessie-backports dpkg mirror.
 * 
 */
public final class DistributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DistributionResponse Empty = new DistributionResponse();

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    @InputImport(name="architecture", required=true)
    private final String architecture;

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @InputImport(name="cpeUri", required=true)
    private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The distribution channel-specific description of this package.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    @InputImport(name="latestVersion", required=true)
    private final VersionResponse latestVersion;

    public VersionResponse getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    @InputImport(name="maintainer", required=true)
    private final String maintainer;

    public String getMaintainer() {
        return this.maintainer;
    }

    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public DistributionResponse(
        String architecture,
        String cpeUri,
        String description,
        VersionResponse latestVersion,
        String maintainer,
        String url) {
        this.architecture = Objects.requireNonNull(architecture, "expected parameter 'architecture' to be non-null");
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.latestVersion = Objects.requireNonNull(latestVersion, "expected parameter 'latestVersion' to be non-null");
        this.maintainer = Objects.requireNonNull(maintainer, "expected parameter 'maintainer' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DistributionResponse() {
        this.architecture = null;
        this.cpeUri = null;
        this.description = null;
        this.latestVersion = null;
        this.maintainer = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String cpeUri;
        private String description;
        private VersionResponse latestVersion;
        private String maintainer;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.latestVersion = defaults.latestVersion;
    	      this.maintainer = defaults.maintainer;
    	      this.url = defaults.url;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLatestVersion(VersionResponse latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }

        public Builder setMaintainer(String maintainer) {
            this.maintainer = Objects.requireNonNull(maintainer);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public DistributionResponse build() {
            return new DistributionResponse(architecture, cpeUri, description, latestVersion, maintainer, url);
        }
    }
}
