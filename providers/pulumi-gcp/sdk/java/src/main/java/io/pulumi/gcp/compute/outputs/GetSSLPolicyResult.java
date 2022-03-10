// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSSLPolicyResult {
    private final String creationTimestamp;
    /**
     * If the `profile` is `CUSTOM`, these are the custom encryption
     * ciphers supported by the profile. If the `profile` is *not* `CUSTOM`, this
     * attribute will be empty.
     * 
     */
    private final List<String> customFeatures;
    /**
     * Description of this SSL Policy.
     * 
     */
    private final String description;
    /**
     * The set of enabled encryption ciphers as a result of the policy config
     * 
     */
    private final List<String> enabledFeatures;
    /**
     * Fingerprint of this resource.
     * 
     */
    private final String fingerprint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The minimum supported TLS version of this policy.
     * 
     */
    private final String minTlsVersion;
    private final String name;
    /**
     * The Google-curated or custom profile used by this policy.
     * 
     */
    private final String profile;
    private final @Nullable String project;
    /**
     * The URI of the created resource.
     * 
     */
    private final String selfLink;

    @OutputCustomType.Constructor
    private GetSSLPolicyResult(
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("customFeatures") List<String> customFeatures,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("enabledFeatures") List<String> enabledFeatures,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("minTlsVersion") String minTlsVersion,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("profile") String profile,
        @OutputCustomType.Parameter("project") @Nullable String project,
        @OutputCustomType.Parameter("selfLink") String selfLink) {
        this.creationTimestamp = creationTimestamp;
        this.customFeatures = customFeatures;
        this.description = description;
        this.enabledFeatures = enabledFeatures;
        this.fingerprint = fingerprint;
        this.id = id;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
        this.selfLink = selfLink;
    }

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * If the `profile` is `CUSTOM`, these are the custom encryption
     * ciphers supported by the profile. If the `profile` is *not* `CUSTOM`, this
     * attribute will be empty.
     * 
    */
    public List<String> getCustomFeatures() {
        return this.customFeatures;
    }
    /**
     * Description of this SSL Policy.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The set of enabled encryption ciphers as a result of the policy config
     * 
    */
    public List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }
    /**
     * Fingerprint of this resource.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The minimum supported TLS version of this policy.
     * 
    */
    public String getMinTlsVersion() {
        return this.minTlsVersion;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The Google-curated or custom profile used by this policy.
     * 
    */
    public String getProfile() {
        return this.profile;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    /**
     * The URI of the created resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSSLPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private List<String> customFeatures;
        private String description;
        private List<String> enabledFeatures;
        private String fingerprint;
        private String id;
        private String minTlsVersion;
        private String name;
        private String profile;
        private @Nullable String project;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSSLPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.enabledFeatures = defaults.enabledFeatures;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder customFeatures(List<String> customFeatures) {
            this.customFeatures = Objects.requireNonNull(customFeatures);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder enabledFeatures(List<String> enabledFeatures) {
            this.enabledFeatures = Objects.requireNonNull(enabledFeatures);
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder minTlsVersion(String minTlsVersion) {
            this.minTlsVersion = Objects.requireNonNull(minTlsVersion);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder profile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetSSLPolicyResult build() {
            return new GetSSLPolicyResult(creationTimestamp, customFeatures, description, enabledFeatures, fingerprint, id, minTlsVersion, name, profile, project, selfLink);
        }
    }
}
