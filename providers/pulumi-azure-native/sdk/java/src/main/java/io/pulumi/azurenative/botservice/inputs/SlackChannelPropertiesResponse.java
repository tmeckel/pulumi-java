// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Slack channel.
 * 
 */
public final class SlackChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SlackChannelPropertiesResponse Empty = new SlackChannelPropertiesResponse();

    /**
     * The Slack client id
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The Slack client secret. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @InputImport(name="isValidated", required=true)
      private final Boolean isValidated;

    public Boolean getIsValidated() {
        return this.isValidated;
    }

    /**
     * The Slack landing page Url
     * 
     */
    @InputImport(name="landingPageUrl")
      private final @Nullable String landingPageUrl;

    public Optional<String> getLandingPageUrl() {
        return this.landingPageUrl == null ? Optional.empty() : Optional.ofNullable(this.landingPageUrl);
    }

    /**
     * The Sms auth token
     * 
     */
    @InputImport(name="lastSubmissionId", required=true)
      private final String lastSubmissionId;

    public String getLastSubmissionId() {
        return this.lastSubmissionId;
    }

    /**
     * The Slack redirect action
     * 
     */
    @InputImport(name="redirectAction", required=true)
      private final String redirectAction;

    public String getRedirectAction() {
        return this.redirectAction;
    }

    /**
     * Whether to register the settings before OAuth validation is performed. Recommended to True.
     * 
     */
    @InputImport(name="registerBeforeOAuthFlow", required=true)
      private final Boolean registerBeforeOAuthFlow;

    public Boolean getRegisterBeforeOAuthFlow() {
        return this.registerBeforeOAuthFlow;
    }

    /**
     * The Slack signing secret.
     * 
     */
    @InputImport(name="signingSecret")
      private final @Nullable String signingSecret;

    public Optional<String> getSigningSecret() {
        return this.signingSecret == null ? Optional.empty() : Optional.ofNullable(this.signingSecret);
    }

    /**
     * The Slack verification token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="verificationToken")
      private final @Nullable String verificationToken;

    public Optional<String> getVerificationToken() {
        return this.verificationToken == null ? Optional.empty() : Optional.ofNullable(this.verificationToken);
    }

    public SlackChannelPropertiesResponse(
        @Nullable String clientId,
        @Nullable String clientSecret,
        Boolean isEnabled,
        Boolean isValidated,
        @Nullable String landingPageUrl,
        String lastSubmissionId,
        String redirectAction,
        Boolean registerBeforeOAuthFlow,
        @Nullable String signingSecret,
        @Nullable String verificationToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = Objects.requireNonNull(isValidated, "expected parameter 'isValidated' to be non-null");
        this.landingPageUrl = landingPageUrl;
        this.lastSubmissionId = Objects.requireNonNull(lastSubmissionId, "expected parameter 'lastSubmissionId' to be non-null");
        this.redirectAction = Objects.requireNonNull(redirectAction, "expected parameter 'redirectAction' to be non-null");
        this.registerBeforeOAuthFlow = Objects.requireNonNull(registerBeforeOAuthFlow, "expected parameter 'registerBeforeOAuthFlow' to be non-null");
        this.signingSecret = signingSecret;
        this.verificationToken = verificationToken;
    }

    private SlackChannelPropertiesResponse() {
        this.clientId = null;
        this.clientSecret = null;
        this.isEnabled = null;
        this.isValidated = null;
        this.landingPageUrl = null;
        this.lastSubmissionId = null;
        this.redirectAction = null;
        this.registerBeforeOAuthFlow = null;
        this.signingSecret = null;
        this.verificationToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlackChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private Boolean isEnabled;
        private Boolean isValidated;
        private @Nullable String landingPageUrl;
        private String lastSubmissionId;
        private String redirectAction;
        private Boolean registerBeforeOAuthFlow;
        private @Nullable String signingSecret;
        private @Nullable String verificationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(SlackChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
    	      this.landingPageUrl = defaults.landingPageUrl;
    	      this.lastSubmissionId = defaults.lastSubmissionId;
    	      this.redirectAction = defaults.redirectAction;
    	      this.registerBeforeOAuthFlow = defaults.registerBeforeOAuthFlow;
    	      this.signingSecret = defaults.signingSecret;
    	      this.verificationToken = defaults.verificationToken;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isValidated(Boolean isValidated) {
            this.isValidated = Objects.requireNonNull(isValidated);
            return this;
        }

        public Builder landingPageUrl(@Nullable String landingPageUrl) {
            this.landingPageUrl = landingPageUrl;
            return this;
        }

        public Builder lastSubmissionId(String lastSubmissionId) {
            this.lastSubmissionId = Objects.requireNonNull(lastSubmissionId);
            return this;
        }

        public Builder redirectAction(String redirectAction) {
            this.redirectAction = Objects.requireNonNull(redirectAction);
            return this;
        }

        public Builder registerBeforeOAuthFlow(Boolean registerBeforeOAuthFlow) {
            this.registerBeforeOAuthFlow = Objects.requireNonNull(registerBeforeOAuthFlow);
            return this;
        }

        public Builder signingSecret(@Nullable String signingSecret) {
            this.signingSecret = signingSecret;
            return this;
        }

        public Builder verificationToken(@Nullable String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public SlackChannelPropertiesResponse build() {
            return new SlackChannelPropertiesResponse(clientId, clientSecret, isEnabled, isValidated, landingPageUrl, lastSubmissionId, redirectAction, registerBeforeOAuthFlow, signingSecret, verificationToken);
        }
    }
}
