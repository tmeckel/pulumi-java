// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.authentication.k8s.io_v1.inputs.BoundObjectReferenceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TokenRequestSpec contains client provided parameters of a token request.
 * 
 */
public final class TokenRequestSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenRequestSpecArgs Empty = new TokenRequestSpecArgs();

    /**
     * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
     * 
     */
    @InputImport(name="audiences", required=true)
      private final Input<List<String>> audiences;

    public Input<List<String>> getAudiences() {
        return this.audiences;
    }

    /**
     * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
     * 
     */
    @InputImport(name="boundObjectRef")
      private final @Nullable Input<BoundObjectReferenceArgs> boundObjectRef;

    public Input<BoundObjectReferenceArgs> getBoundObjectRef() {
        return this.boundObjectRef == null ? Input.empty() : this.boundObjectRef;
    }

    /**
     * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
     * 
     */
    @InputImport(name="expirationSeconds")
      private final @Nullable Input<Integer> expirationSeconds;

    public Input<Integer> getExpirationSeconds() {
        return this.expirationSeconds == null ? Input.empty() : this.expirationSeconds;
    }

    public TokenRequestSpecArgs(
        Input<List<String>> audiences,
        @Nullable Input<BoundObjectReferenceArgs> boundObjectRef,
        @Nullable Input<Integer> expirationSeconds) {
        this.audiences = Objects.requireNonNull(audiences, "expected parameter 'audiences' to be non-null");
        this.boundObjectRef = boundObjectRef;
        this.expirationSeconds = expirationSeconds;
    }

    private TokenRequestSpecArgs() {
        this.audiences = Input.empty();
        this.boundObjectRef = Input.empty();
        this.expirationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequestSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> audiences;
        private @Nullable Input<BoundObjectReferenceArgs> boundObjectRef;
        private @Nullable Input<Integer> expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequestSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.boundObjectRef = defaults.boundObjectRef;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder audiences(Input<List<String>> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder audiences(List<String> audiences) {
            this.audiences = Input.of(Objects.requireNonNull(audiences));
            return this;
        }

        public Builder boundObjectRef(@Nullable Input<BoundObjectReferenceArgs> boundObjectRef) {
            this.boundObjectRef = boundObjectRef;
            return this;
        }

        public Builder boundObjectRef(@Nullable BoundObjectReferenceArgs boundObjectRef) {
            this.boundObjectRef = Input.ofNullable(boundObjectRef);
            return this;
        }

        public Builder expirationSeconds(@Nullable Input<Integer> expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder expirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = Input.ofNullable(expirationSeconds);
            return this;
        }
        public TokenRequestSpecArgs build() {
            return new TokenRequestSpecArgs(audiences, boundObjectRef, expirationSeconds);
        }
    }
}
