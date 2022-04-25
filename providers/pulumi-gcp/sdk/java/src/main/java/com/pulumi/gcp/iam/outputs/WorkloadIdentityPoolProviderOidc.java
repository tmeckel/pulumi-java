// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadIdentityPoolProviderOidc {
    /**
     * @return Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange
     * requests are rejected if the token audience does not match one of the configured
     * values. Each audience may be at most 256 characters. A maximum of 10 audiences may
     * be configured.
     * If this list is empty, the OIDC token audience must be equal to the full canonical
     * resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix.
     * For example:
     * 
     */
    private final @Nullable List<String> allowedAudiences;
    /**
     * @return The OIDC issuer URL.
     * 
     */
    private final String issuerUri;

    @CustomType.Constructor
    private WorkloadIdentityPoolProviderOidc(
        @CustomType.Parameter("allowedAudiences") @Nullable List<String> allowedAudiences,
        @CustomType.Parameter("issuerUri") String issuerUri) {
        this.allowedAudiences = allowedAudiences;
        this.issuerUri = issuerUri;
    }

    /**
     * @return Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange
     * requests are rejected if the token audience does not match one of the configured
     * values. Each audience may be at most 256 characters. A maximum of 10 audiences may
     * be configured.
     * If this list is empty, the OIDC token audience must be equal to the full canonical
     * resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix.
     * For example:
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences == null ? List.of() : this.allowedAudiences;
    }
    /**
     * @return The OIDC issuer URL.
     * 
     */
    public String issuerUri() {
        return this.issuerUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityPoolProviderOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAudiences;
        private String issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityPoolProviderOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        public Builder issuerUri(String issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }        public WorkloadIdentityPoolProviderOidc build() {
            return new WorkloadIdentityPoolProviderOidc(allowedAudiences, issuerUri);
        }
    }
}
