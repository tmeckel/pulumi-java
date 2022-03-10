// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPoolClientTokenValidityUnits {
    /**
     * Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    private final @Nullable String idToken;
    /**
     * Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    private final @Nullable String refreshToken;

    @OutputCustomType.Constructor
    private UserPoolClientTokenValidityUnits(
        @OutputCustomType.Parameter("accessToken") @Nullable String accessToken,
        @OutputCustomType.Parameter("idToken") @Nullable String idToken,
        @OutputCustomType.Parameter("refreshToken") @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
    */
    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
    */
    public Optional<String> getIdToken() {
        return Optional.ofNullable(this.idToken);
    }
    /**
     * Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
    */
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientTokenValidityUnits defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String idToken;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolClientTokenValidityUnits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder idToken(@Nullable String idToken) {
            this.idToken = idToken;
            return this;
        }

        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public UserPoolClientTokenValidityUnits build() {
            return new UserPoolClientTokenValidityUnits(accessToken, idToken, refreshToken);
        }
    }
}
