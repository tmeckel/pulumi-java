// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsoPropertiesResponse {
    /**
     * @return The public identifier for the application
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The secret known only to the application and the authorization server
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The URI of Issuer Identifier
     * 
     */
    private final @Nullable String issuerUri;
    /**
     * @return It defines the specific actions applications can be allowed to do on a user&#39;s behalf
     * 
     */
    private final @Nullable List<String> scope;

    @CustomType.Constructor
    private SsoPropertiesResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("issuerUri") @Nullable String issuerUri,
        @CustomType.Parameter("scope") @Nullable List<String> scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuerUri = issuerUri;
        this.scope = scope;
    }

    /**
     * @return The public identifier for the application
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The secret known only to the application and the authorization server
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The URI of Issuer Identifier
     * 
     */
    public Optional<String> issuerUri() {
        return Optional.ofNullable(this.issuerUri);
    }
    /**
     * @return It defines the specific actions applications can be allowed to do on a user&#39;s behalf
     * 
     */
    public List<String> scope() {
        return this.scope == null ? List.of() : this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsoPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String issuerUri;
        private @Nullable List<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(SsoPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuerUri = defaults.issuerUri;
    	      this.scope = defaults.scope;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder issuerUri(@Nullable String issuerUri) {
            this.issuerUri = issuerUri;
            return this;
        }
        public Builder scope(@Nullable List<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(String... scope) {
            return scope(List.of(scope));
        }        public SsoPropertiesResponse build() {
            return new SsoPropertiesResponse(clientId, clientSecret, issuerUri, scope);
        }
    }
}
