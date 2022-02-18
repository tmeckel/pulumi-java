// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.AllowedKeyTypeResponse;
import io.pulumi.googlenative.privateca_v1.inputs.CertificateExtensionConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.inputs.CertificateIdentityConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.inputs.IssuanceModesResponse;
import io.pulumi.googlenative.privateca_v1.inputs.X509ParametersResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines controls over all certificate issuance within a CaPool.
 * 
 */
public final class IssuancePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final IssuancePolicyResponse Empty = new IssuancePolicyResponse();

    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    @InputImport(name="allowedIssuanceModes", required=true)
    private final IssuanceModesResponse allowedIssuanceModes;

    public IssuanceModesResponse getAllowedIssuanceModes() {
        return this.allowedIssuanceModes;
    }

    /**
     * Optional. If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here. Otherwise, any key may be used.
     * 
     */
    @InputImport(name="allowedKeyTypes", required=true)
    private final List<AllowedKeyTypeResponse> allowedKeyTypes;

    public List<AllowedKeyTypeResponse> getAllowedKeyTypes() {
        return this.allowedKeyTypes;
    }

    /**
     * Optional. A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate request uses a CertificateTemplate that defines conflicting predefined_values for the same properties, the certificate issuance request will fail.
     * 
     */
    @InputImport(name="baselineValues", required=true)
    private final X509ParametersResponse baselineValues;

    public X509ParametersResponse getBaselineValues() {
        return this.baselineValues;
    }

    /**
     * Optional. Describes constraints on identities that may appear in Certificates issued through this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
     * 
     */
    @InputImport(name="identityConstraints", required=true)
    private final CertificateIdentityConstraintsResponse identityConstraints;

    public CertificateIdentityConstraintsResponse getIdentityConstraints() {
        return this.identityConstraints;
    }

    /**
     * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    @InputImport(name="maximumLifetime", required=true)
    private final String maximumLifetime;

    public String getMaximumLifetime() {
        return this.maximumLifetime;
    }

    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through this CaPool. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If a certificate request uses a CertificateTemplate with predefined_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this CaPool will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CaPool's baseline_values.
     * 
     */
    @InputImport(name="passthroughExtensions", required=true)
    private final CertificateExtensionConstraintsResponse passthroughExtensions;

    public CertificateExtensionConstraintsResponse getPassthroughExtensions() {
        return this.passthroughExtensions;
    }

    public IssuancePolicyResponse(
        IssuanceModesResponse allowedIssuanceModes,
        List<AllowedKeyTypeResponse> allowedKeyTypes,
        X509ParametersResponse baselineValues,
        CertificateIdentityConstraintsResponse identityConstraints,
        String maximumLifetime,
        CertificateExtensionConstraintsResponse passthroughExtensions) {
        this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes, "expected parameter 'allowedIssuanceModes' to be non-null");
        this.allowedKeyTypes = Objects.requireNonNull(allowedKeyTypes, "expected parameter 'allowedKeyTypes' to be non-null");
        this.baselineValues = Objects.requireNonNull(baselineValues, "expected parameter 'baselineValues' to be non-null");
        this.identityConstraints = Objects.requireNonNull(identityConstraints, "expected parameter 'identityConstraints' to be non-null");
        this.maximumLifetime = Objects.requireNonNull(maximumLifetime, "expected parameter 'maximumLifetime' to be non-null");
        this.passthroughExtensions = Objects.requireNonNull(passthroughExtensions, "expected parameter 'passthroughExtensions' to be non-null");
    }

    private IssuancePolicyResponse() {
        this.allowedIssuanceModes = null;
        this.allowedKeyTypes = List.of();
        this.baselineValues = null;
        this.identityConstraints = null;
        this.maximumLifetime = null;
        this.passthroughExtensions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssuanceModesResponse allowedIssuanceModes;
        private List<AllowedKeyTypeResponse> allowedKeyTypes;
        private X509ParametersResponse baselineValues;
        private CertificateIdentityConstraintsResponse identityConstraints;
        private String maximumLifetime;
        private CertificateExtensionConstraintsResponse passthroughExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuancePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedKeyTypes = defaults.allowedKeyTypes;
    	      this.baselineValues = defaults.baselineValues;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.passthroughExtensions = defaults.passthroughExtensions;
        }

        public Builder setAllowedIssuanceModes(IssuanceModesResponse allowedIssuanceModes) {
            this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes);
            return this;
        }

        public Builder setAllowedKeyTypes(List<AllowedKeyTypeResponse> allowedKeyTypes) {
            this.allowedKeyTypes = Objects.requireNonNull(allowedKeyTypes);
            return this;
        }

        public Builder setBaselineValues(X509ParametersResponse baselineValues) {
            this.baselineValues = Objects.requireNonNull(baselineValues);
            return this;
        }

        public Builder setIdentityConstraints(CertificateIdentityConstraintsResponse identityConstraints) {
            this.identityConstraints = Objects.requireNonNull(identityConstraints);
            return this;
        }

        public Builder setMaximumLifetime(String maximumLifetime) {
            this.maximumLifetime = Objects.requireNonNull(maximumLifetime);
            return this;
        }

        public Builder setPassthroughExtensions(CertificateExtensionConstraintsResponse passthroughExtensions) {
            this.passthroughExtensions = Objects.requireNonNull(passthroughExtensions);
            return this;
        }

        public IssuancePolicyResponse build() {
            return new IssuancePolicyResponse(allowedIssuanceModes, allowedKeyTypes, baselineValues, identityConstraints, maximumLifetime, passthroughExtensions);
        }
    }
}
