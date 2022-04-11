// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TokenReviewSpec is a description of the token authentication request.
 * 
 */
public final class TokenReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenReviewSpecArgs Empty = new TokenReviewSpecArgs();

    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    @Import(name="audiences")
      private final @Nullable Output<List<String>> audiences;

    public Output<List<String>> getAudiences() {
        return this.audiences == null ? Codegen.empty() : this.audiences;
    }

    /**
     * Token is the opaque bearer token.
     * 
     */
    @Import(name="token")
      private final @Nullable Output<String> token;

    public Output<String> getToken() {
        return this.token == null ? Codegen.empty() : this.token;
    }

    public TokenReviewSpecArgs(
        @Nullable Output<List<String>> audiences,
        @Nullable Output<String> token) {
        this.audiences = audiences;
        this.token = token;
    }

    private TokenReviewSpecArgs() {
        this.audiences = Codegen.empty();
        this.token = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> audiences;
        private @Nullable Output<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.token = defaults.token;
        }

        public Builder audiences(@Nullable Output<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = Codegen.ofNullable(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        public Builder token(@Nullable Output<String> token) {
            this.token = token;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = Codegen.ofNullable(token);
            return this;
        }        public TokenReviewSpecArgs build() {
            return new TokenReviewSpecArgs(audiences, token);
        }
    }
}
