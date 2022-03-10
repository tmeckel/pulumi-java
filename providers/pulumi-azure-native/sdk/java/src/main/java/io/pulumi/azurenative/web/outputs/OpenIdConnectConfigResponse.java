// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenIdConnectConfigResponse {
    /**
     * The endpoint to be used to make an authorization request.
     * 
     */
    private final @Nullable String authorizationEndpoint;
    /**
     * The endpoint that provides the keys necessary to validate the token.
     * 
     */
    private final @Nullable String certificationUri;
    /**
     * The endpoint that issues the token.
     * 
     */
    private final @Nullable String issuer;
    /**
     * The endpoint to be used to request a token.
     * 
     */
    private final @Nullable String tokenEndpoint;
    /**
     * The endpoint that contains all the configuration endpoints for the provider.
     * 
     */
    private final @Nullable String wellKnownOpenIdConfiguration;

    @OutputCustomType.Constructor
    private OpenIdConnectConfigResponse(
        @OutputCustomType.Parameter("authorizationEndpoint") @Nullable String authorizationEndpoint,
        @OutputCustomType.Parameter("certificationUri") @Nullable String certificationUri,
        @OutputCustomType.Parameter("issuer") @Nullable String issuer,
        @OutputCustomType.Parameter("tokenEndpoint") @Nullable String tokenEndpoint,
        @OutputCustomType.Parameter("wellKnownOpenIdConfiguration") @Nullable String wellKnownOpenIdConfiguration) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.certificationUri = certificationUri;
        this.issuer = issuer;
        this.tokenEndpoint = tokenEndpoint;
        this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
    }

    /**
     * The endpoint to be used to make an authorization request.
     * 
    */
    public Optional<String> getAuthorizationEndpoint() {
        return Optional.ofNullable(this.authorizationEndpoint);
    }
    /**
     * The endpoint that provides the keys necessary to validate the token.
     * 
    */
    public Optional<String> getCertificationUri() {
        return Optional.ofNullable(this.certificationUri);
    }
    /**
     * The endpoint that issues the token.
     * 
    */
    public Optional<String> getIssuer() {
        return Optional.ofNullable(this.issuer);
    }
    /**
     * The endpoint to be used to request a token.
     * 
    */
    public Optional<String> getTokenEndpoint() {
        return Optional.ofNullable(this.tokenEndpoint);
    }
    /**
     * The endpoint that contains all the configuration endpoints for the provider.
     * 
    */
    public Optional<String> getWellKnownOpenIdConfiguration() {
        return Optional.ofNullable(this.wellKnownOpenIdConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationEndpoint;
        private @Nullable String certificationUri;
        private @Nullable String issuer;
        private @Nullable String tokenEndpoint;
        private @Nullable String wellKnownOpenIdConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.certificationUri = defaults.certificationUri;
    	      this.issuer = defaults.issuer;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.wellKnownOpenIdConfiguration = defaults.wellKnownOpenIdConfiguration;
        }

        public Builder authorizationEndpoint(@Nullable String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder certificationUri(@Nullable String certificationUri) {
            this.certificationUri = certificationUri;
            return this;
        }

        public Builder issuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder tokenEndpoint(@Nullable String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        public Builder wellKnownOpenIdConfiguration(@Nullable String wellKnownOpenIdConfiguration) {
            this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
            return this;
        }
        public OpenIdConnectConfigResponse build() {
            return new OpenIdConnectConfigResponse(authorizationEndpoint, certificationUri, issuer, tokenEndpoint, wellKnownOpenIdConfiguration);
        }
    }
}
