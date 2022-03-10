// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.AuthRequirementArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OAuthRequirementsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication rules for the service. By default, if a method has any authentication requirements, every request must include a valid credential matching one of the requirements. It's an error to include more than one kind of credential in a single request. If a method doesn't have any auth requirements, request credentials will be ignored.
 * 
 */
public final class AuthenticationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticationRuleArgs Empty = new AuthenticationRuleArgs();

    /**
     * If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
     * 
     */
    @InputImport(name="allowWithoutCredential")
      private final @Nullable Input<Boolean> allowWithoutCredential;

    public Input<Boolean> getAllowWithoutCredential() {
        return this.allowWithoutCredential == null ? Input.empty() : this.allowWithoutCredential;
    }

    /**
     * The requirements for OAuth credentials.
     * 
     */
    @InputImport(name="oauth")
      private final @Nullable Input<OAuthRequirementsArgs> oauth;

    public Input<OAuthRequirementsArgs> getOauth() {
        return this.oauth == null ? Input.empty() : this.oauth;
    }

    /**
     * Requirements for additional authentication providers.
     * 
     */
    @InputImport(name="requirements")
      private final @Nullable Input<List<AuthRequirementArgs>> requirements;

    public Input<List<AuthRequirementArgs>> getRequirements() {
        return this.requirements == null ? Input.empty() : this.requirements;
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector")
      private final @Nullable Input<String> selector;

    public Input<String> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public AuthenticationRuleArgs(
        @Nullable Input<Boolean> allowWithoutCredential,
        @Nullable Input<OAuthRequirementsArgs> oauth,
        @Nullable Input<List<AuthRequirementArgs>> requirements,
        @Nullable Input<String> selector) {
        this.allowWithoutCredential = allowWithoutCredential;
        this.oauth = oauth;
        this.requirements = requirements;
        this.selector = selector;
    }

    private AuthenticationRuleArgs() {
        this.allowWithoutCredential = Input.empty();
        this.oauth = Input.empty();
        this.requirements = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowWithoutCredential;
        private @Nullable Input<OAuthRequirementsArgs> oauth;
        private @Nullable Input<List<AuthRequirementArgs>> requirements;
        private @Nullable Input<String> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowWithoutCredential = defaults.allowWithoutCredential;
    	      this.oauth = defaults.oauth;
    	      this.requirements = defaults.requirements;
    	      this.selector = defaults.selector;
        }

        public Builder allowWithoutCredential(@Nullable Input<Boolean> allowWithoutCredential) {
            this.allowWithoutCredential = allowWithoutCredential;
            return this;
        }

        public Builder allowWithoutCredential(@Nullable Boolean allowWithoutCredential) {
            this.allowWithoutCredential = Input.ofNullable(allowWithoutCredential);
            return this;
        }

        public Builder oauth(@Nullable Input<OAuthRequirementsArgs> oauth) {
            this.oauth = oauth;
            return this;
        }

        public Builder oauth(@Nullable OAuthRequirementsArgs oauth) {
            this.oauth = Input.ofNullable(oauth);
            return this;
        }

        public Builder requirements(@Nullable Input<List<AuthRequirementArgs>> requirements) {
            this.requirements = requirements;
            return this;
        }

        public Builder requirements(@Nullable List<AuthRequirementArgs> requirements) {
            this.requirements = Input.ofNullable(requirements);
            return this;
        }

        public Builder selector(@Nullable Input<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder selector(@Nullable String selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }
        public AuthenticationRuleArgs build() {
            return new AuthenticationRuleArgs(allowWithoutCredential, oauth, requirements, selector);
        }
    }
}
