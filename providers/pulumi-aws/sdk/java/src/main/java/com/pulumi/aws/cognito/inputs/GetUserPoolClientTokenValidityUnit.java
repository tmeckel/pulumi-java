// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolClientTokenValidityUnit extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPoolClientTokenValidityUnit Empty = new GetUserPoolClientTokenValidityUnit();

    /**
     * (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    @Import(name="accessToken", required=true)
    private String accessToken;

    /**
     * @return (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    @Import(name="idToken", required=true)
    private String idToken;

    /**
     * @return (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    public String idToken() {
        return this.idToken;
    }

    /**
     * (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    @Import(name="refreshToken", required=true)
    private String refreshToken;

    /**
     * @return (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    private GetUserPoolClientTokenValidityUnit() {}

    private GetUserPoolClientTokenValidityUnit(GetUserPoolClientTokenValidityUnit $) {
        this.accessToken = $.accessToken;
        this.idToken = $.idToken;
        this.refreshToken = $.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPoolClientTokenValidityUnit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPoolClientTokenValidityUnit $;

        public Builder() {
            $ = new GetUserPoolClientTokenValidityUnit();
        }

        public Builder(GetUserPoolClientTokenValidityUnit defaults) {
            $ = new GetUserPoolClientTokenValidityUnit(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param idToken (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
         * 
         * @return builder
         * 
         */
        public Builder idToken(String idToken) {
            $.idToken = idToken;
            return this;
        }

        /**
         * @param refreshToken (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(String refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public GetUserPoolClientTokenValidityUnit build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            $.idToken = Objects.requireNonNull($.idToken, "expected parameter 'idToken' to be non-null");
            $.refreshToken = Objects.requireNonNull($.refreshToken, "expected parameter 'refreshToken' to be non-null");
            return $;
        }
    }

}
