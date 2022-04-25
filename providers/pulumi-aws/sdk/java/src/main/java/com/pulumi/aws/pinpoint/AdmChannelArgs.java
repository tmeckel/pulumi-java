// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdmChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdmChannelArgs Empty = new AdmChannelArgs();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private AdmChannelArgs() {}

    private AdmChannelArgs(AdmChannelArgs $) {
        this.applicationId = $.applicationId;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdmChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdmChannelArgs $;

        public Builder() {
            $ = new AdmChannelArgs();
        }

        public Builder(AdmChannelArgs defaults) {
            $ = new AdmChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The application ID.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param clientId Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param enabled Specifies whether to enable the channel. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether to enable the channel. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public AdmChannelArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
