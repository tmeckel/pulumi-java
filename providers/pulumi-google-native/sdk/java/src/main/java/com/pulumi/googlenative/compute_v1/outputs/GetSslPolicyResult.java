// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.SslPolicyWarningsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSslPolicyResult {
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    private final List<String> customFeatures;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return The list of features enabled in the SSL policy.
     * 
     */
    private final List<String> enabledFeatures;
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
     * 
     */
    private final String fingerprint;
    /**
     * @return [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
     * 
     */
    private final String kind;
    /**
     * @return The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    private final String minTlsVersion;
    /**
     * @return Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    private final String profile;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
     * 
     */
    private final List<SslPolicyWarningsItemResponse> warnings;

    @CustomType.Constructor
    private GetSslPolicyResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("customFeatures") List<String> customFeatures,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enabledFeatures") List<String> enabledFeatures,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("minTlsVersion") String minTlsVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("profile") String profile,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("warnings") List<SslPolicyWarningsItemResponse> warnings) {
        this.creationTimestamp = creationTimestamp;
        this.customFeatures = customFeatures;
        this.description = description;
        this.enabledFeatures = enabledFeatures;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.selfLink = selfLink;
        this.warnings = warnings;
    }

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    public List<String> customFeatures() {
        return this.customFeatures;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The list of features enabled in the SSL policy.
     * 
     */
    public List<String> enabledFeatures() {
        return this.enabledFeatures;
    }
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    public String minTlsVersion() {
        return this.minTlsVersion;
    }
    /**
     * @return Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    public String profile() {
        return this.profile;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
     * 
     */
    public List<SslPolicyWarningsItemResponse> warnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private List<String> customFeatures;
        private String description;
        private List<String> enabledFeatures;
        private String fingerprint;
        private String kind;
        private String minTlsVersion;
        private String name;
        private String profile;
        private String selfLink;
        private List<SslPolicyWarningsItemResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.enabledFeatures = defaults.enabledFeatures;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.selfLink = defaults.selfLink;
    	      this.warnings = defaults.warnings;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder customFeatures(List<String> customFeatures) {
            this.customFeatures = Objects.requireNonNull(customFeatures);
            return this;
        }
        public Builder customFeatures(String... customFeatures) {
            return customFeatures(List.of(customFeatures));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enabledFeatures(List<String> enabledFeatures) {
            this.enabledFeatures = Objects.requireNonNull(enabledFeatures);
            return this;
        }
        public Builder enabledFeatures(String... enabledFeatures) {
            return enabledFeatures(List.of(enabledFeatures));
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder warnings(List<SslPolicyWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(SslPolicyWarningsItemResponse... warnings) {
            return warnings(List.of(warnings));
        }        public GetSslPolicyResult build() {
            return new GetSslPolicyResult(creationTimestamp, customFeatures, description, enabledFeatures, fingerprint, kind, minTlsVersion, name, profile, selfLink, warnings);
        }
    }
}
