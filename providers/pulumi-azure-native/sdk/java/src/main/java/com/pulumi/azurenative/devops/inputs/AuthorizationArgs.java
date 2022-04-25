// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devops.inputs;

import com.pulumi.azurenative.devops.enums.AuthorizationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authorization info used to access a resource (like code repository).
 * 
 */
public final class AuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationArgs Empty = new AuthorizationArgs();

    /**
     * Type of authorization.
     * 
     */
    @Import(name="authorizationType", required=true)
    private Output<Either<String,AuthorizationType>> authorizationType;

    /**
     * @return Type of authorization.
     * 
     */
    public Output<Either<String,AuthorizationType>> authorizationType() {
        return this.authorizationType;
    }

    /**
     * Authorization parameters corresponding to the authorization type.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Authorization parameters corresponding to the authorization type.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private AuthorizationArgs() {}

    private AuthorizationArgs(AuthorizationArgs $) {
        this.authorizationType = $.authorizationType;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationArgs $;

        public Builder() {
            $ = new AuthorizationArgs();
        }

        public Builder(AuthorizationArgs defaults) {
            $ = new AuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationType Type of authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(Output<Either<String,AuthorizationType>> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        /**
         * @param authorizationType Type of authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(Either<String,AuthorizationType> authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        /**
         * @param authorizationType Type of authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(String authorizationType) {
            return authorizationType(Either.ofLeft(authorizationType));
        }

        /**
         * @param authorizationType Type of authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(AuthorizationType authorizationType) {
            return authorizationType(Either.ofRight(authorizationType));
        }

        /**
         * @param parameters Authorization parameters corresponding to the authorization type.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Authorization parameters corresponding to the authorization type.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public AuthorizationArgs build() {
            $.authorizationType = Objects.requireNonNull($.authorizationType, "expected parameter 'authorizationType' to be non-null");
            return $;
        }
    }

}
