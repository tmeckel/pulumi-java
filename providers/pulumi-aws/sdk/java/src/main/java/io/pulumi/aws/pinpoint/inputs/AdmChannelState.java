// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdmChannelState extends io.pulumi.resources.ResourceArgs {

    public static final AdmChannelState Empty = new AdmChannelState();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public AdmChannelState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<Boolean> enabled) {
        this.applicationId = applicationId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.enabled = enabled;
    }

    private AdmChannelState() {
        this.applicationId = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdmChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdmChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.enabled = defaults.enabled;
        }

        public Builder applicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder clientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder clientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public AdmChannelState build() {
            return new AdmChannelState(applicationId, clientId, clientSecret, enabled);
        }
    }
}
