// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The period during which some deployable was active in a runtime.
 * 
 */
public final class DeploymentOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentOccurrenceResponse Empty = new DeploymentOccurrenceResponse();

    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    @InputImport(name="address", required=true)
    private final String address;

    public String getAddress() {
        return this.address;
    }

    /**
     * Configuration used to create this deployment.
     * 
     */
    @InputImport(name="config", required=true)
    private final String config;

    public String getConfig() {
        return this.config;
    }

    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    @InputImport(name="deployTime", required=true)
    private final String deployTime;

    public String getDeployTime() {
        return this.deployTime;
    }

    /**
     * Platform hosting this deployment.
     * 
     */
    @InputImport(name="platform", required=true)
    private final String platform;

    public String getPlatform() {
        return this.platform;
    }

    /**
     * Resource URI for the artifact being deployed taken from the deployable field with the same name.
     * 
     */
    @InputImport(name="resourceUri", required=true)
    private final List<String> resourceUri;

    public List<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * End of the lifetime of this deployment.
     * 
     */
    @InputImport(name="undeployTime", required=true)
    private final String undeployTime;

    public String getUndeployTime() {
        return this.undeployTime;
    }

    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    @InputImport(name="userEmail", required=true)
    private final String userEmail;

    public String getUserEmail() {
        return this.userEmail;
    }

    public DeploymentOccurrenceResponse(
        String address,
        String config,
        String deployTime,
        String platform,
        List<String> resourceUri,
        String undeployTime,
        String userEmail) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.deployTime = Objects.requireNonNull(deployTime, "expected parameter 'deployTime' to be non-null");
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.undeployTime = Objects.requireNonNull(undeployTime, "expected parameter 'undeployTime' to be non-null");
        this.userEmail = Objects.requireNonNull(userEmail, "expected parameter 'userEmail' to be non-null");
    }

    private DeploymentOccurrenceResponse() {
        this.address = null;
        this.config = null;
        this.deployTime = null;
        this.platform = null;
        this.resourceUri = List.of();
        this.undeployTime = null;
        this.userEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String config;
        private String deployTime;
        private String platform;
        private List<String> resourceUri;
        private String undeployTime;
        private String userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.config = defaults.config;
    	      this.deployTime = defaults.deployTime;
    	      this.platform = defaults.platform;
    	      this.resourceUri = defaults.resourceUri;
    	      this.undeployTime = defaults.undeployTime;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setConfig(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setDeployTime(String deployTime) {
            this.deployTime = Objects.requireNonNull(deployTime);
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setResourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setUndeployTime(String undeployTime) {
            this.undeployTime = Objects.requireNonNull(undeployTime);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public DeploymentOccurrenceResponse build() {
            return new DeploymentOccurrenceResponse(address, config, deployTime, platform, resourceUri, undeployTime, userEmail);
        }
    }
}
