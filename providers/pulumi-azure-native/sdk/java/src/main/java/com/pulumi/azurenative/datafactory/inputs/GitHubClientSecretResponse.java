// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Client secret information for factory&#39;s bring your own app repository configuration.
 * 
 */
public final class GitHubClientSecretResponse extends com.pulumi.resources.InvokeArgs {

    public static final GitHubClientSecretResponse Empty = new GitHubClientSecretResponse();

    /**
     * Bring your own app client secret AKV URL.
     * 
     */
    @Import(name="byoaSecretAkvUrl")
    private @Nullable String byoaSecretAkvUrl;

    /**
     * @return Bring your own app client secret AKV URL.
     * 
     */
    public Optional<String> byoaSecretAkvUrl() {
        return Optional.ofNullable(this.byoaSecretAkvUrl);
    }

    /**
     * Bring your own app client secret name in AKV.
     * 
     */
    @Import(name="byoaSecretName")
    private @Nullable String byoaSecretName;

    /**
     * @return Bring your own app client secret name in AKV.
     * 
     */
    public Optional<String> byoaSecretName() {
        return Optional.ofNullable(this.byoaSecretName);
    }

    private GitHubClientSecretResponse() {}

    private GitHubClientSecretResponse(GitHubClientSecretResponse $) {
        this.byoaSecretAkvUrl = $.byoaSecretAkvUrl;
        this.byoaSecretName = $.byoaSecretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitHubClientSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitHubClientSecretResponse $;

        public Builder() {
            $ = new GitHubClientSecretResponse();
        }

        public Builder(GitHubClientSecretResponse defaults) {
            $ = new GitHubClientSecretResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param byoaSecretAkvUrl Bring your own app client secret AKV URL.
         * 
         * @return builder
         * 
         */
        public Builder byoaSecretAkvUrl(@Nullable String byoaSecretAkvUrl) {
            $.byoaSecretAkvUrl = byoaSecretAkvUrl;
            return this;
        }

        /**
         * @param byoaSecretName Bring your own app client secret name in AKV.
         * 
         * @return builder
         * 
         */
        public Builder byoaSecretName(@Nullable String byoaSecretName) {
            $.byoaSecretName = byoaSecretName;
            return this;
        }

        public GitHubClientSecretResponse build() {
            return $;
        }
    }

}
