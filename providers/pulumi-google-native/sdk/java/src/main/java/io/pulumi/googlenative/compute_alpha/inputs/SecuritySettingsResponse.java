// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The authentication and authorization settings for a BackendService.
 * 
 */
public final class SecuritySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecuritySettingsResponse Empty = new SecuritySettingsResponse();

    /**
     * Optional. A URL referring to a networksecurity.ClientTlsPolicy resource that describes how clients should authenticate with this service's backends. clientTlsPolicy only applies to a global BackendService with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @InputImport(name="clientTlsPolicy", required=true)
    private final String clientTlsPolicy;

    public String getClientTlsPolicy() {
        return this.clientTlsPolicy;
    }

    /**
     * Optional. A list of Subject Alternative Names (SANs) that the client verifies during a mutual TLS handshake with an server/endpoint for this BackendService. When the server presents its X.509 certificate to the client, the client inspects the certificate's subjectAltName field. If the field contains one of the specified values, the communication continues. Otherwise, it fails. This additional check enables the client to verify that the server is authorized to run the requested service. Note that the contents of the server certificate's subjectAltName field are configured by the Public Key Infrastructure which provisions server identities. Only applies to a global BackendService with loadBalancingScheme set to INTERNAL_SELF_MANAGED. Only applies when BackendService has an attached clientTlsPolicy with clientCertificate (mTLS mode). Note: This field currently has no impact.
     * 
     */
    @InputImport(name="subjectAltNames", required=true)
    private final List<String> subjectAltNames;

    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    public SecuritySettingsResponse(
        String clientTlsPolicy,
        List<String> subjectAltNames) {
        this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy, "expected parameter 'clientTlsPolicy' to be non-null");
        this.subjectAltNames = Objects.requireNonNull(subjectAltNames, "expected parameter 'subjectAltNames' to be non-null");
    }

    private SecuritySettingsResponse() {
        this.clientTlsPolicy = null;
        this.subjectAltNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientTlsPolicy;
        private List<String> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(SecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder setClientTlsPolicy(String clientTlsPolicy) {
            this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
            return this;
        }

        public Builder setSubjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }

        public SecuritySettingsResponse build() {
            return new SecuritySettingsResponse(clientTlsPolicy, subjectAltNames);
        }
    }
}
