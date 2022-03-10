// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateExtensionConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateIdentityConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.X509ParametersResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetCertificateTemplateResult {
    /**
     * The time at which this CertificateTemplate was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. A human-readable description of scenarios this template is intended for.
     * 
     */
    private final String description;
    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
     */
    private final CertificateIdentityConstraintsResponse identityConstraints;
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    private final String name;
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
     */
    private final CertificateExtensionConstraintsResponse passthroughExtensions;
    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    private final X509ParametersResponse predefinedValues;
    /**
     * The time at which this CertificateTemplate was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetCertificateTemplateResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("identityConstraints") CertificateIdentityConstraintsResponse identityConstraints,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("passthroughExtensions") CertificateExtensionConstraintsResponse passthroughExtensions,
        @OutputCustomType.Parameter("predefinedValues") X509ParametersResponse predefinedValues,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.identityConstraints = identityConstraints;
        this.labels = labels;
        this.name = name;
        this.passthroughExtensions = passthroughExtensions;
        this.predefinedValues = predefinedValues;
        this.updateTime = updateTime;
    }

    /**
     * The time at which this CertificateTemplate was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. A human-readable description of scenarios this template is intended for.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
    */
    public CertificateIdentityConstraintsResponse getIdentityConstraints() {
        return this.identityConstraints;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
    */
    public CertificateExtensionConstraintsResponse getPassthroughExtensions() {
        return this.passthroughExtensions;
    }
    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
    */
    public X509ParametersResponse getPredefinedValues() {
        return this.predefinedValues;
    }
    /**
     * The time at which this CertificateTemplate was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private CertificateIdentityConstraintsResponse identityConstraints;
        private Map<String,String> labels;
        private String name;
        private CertificateExtensionConstraintsResponse passthroughExtensions;
        private X509ParametersResponse predefinedValues;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.passthroughExtensions = defaults.passthroughExtensions;
    	      this.predefinedValues = defaults.predefinedValues;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder identityConstraints(CertificateIdentityConstraintsResponse identityConstraints) {
            this.identityConstraints = Objects.requireNonNull(identityConstraints);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder passthroughExtensions(CertificateExtensionConstraintsResponse passthroughExtensions) {
            this.passthroughExtensions = Objects.requireNonNull(passthroughExtensions);
            return this;
        }

        public Builder predefinedValues(X509ParametersResponse predefinedValues) {
            this.predefinedValues = Objects.requireNonNull(predefinedValues);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetCertificateTemplateResult build() {
            return new GetCertificateTemplateResult(createTime, description, identityConstraints, labels, name, passthroughExtensions, predefinedValues, updateTime);
        }
    }
}
