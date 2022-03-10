// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 agreement security settings.
 * 
 */
public final class X12SecuritySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12SecuritySettingsArgs Empty = new X12SecuritySettingsArgs();

    /**
     * The authorization qualifier.
     * 
     */
    @InputImport(name="authorizationQualifier", required=true)
      private final Input<String> authorizationQualifier;

    public Input<String> getAuthorizationQualifier() {
        return this.authorizationQualifier;
    }

    /**
     * The authorization value.
     * 
     */
    @InputImport(name="authorizationValue")
      private final @Nullable Input<String> authorizationValue;

    public Input<String> getAuthorizationValue() {
        return this.authorizationValue == null ? Input.empty() : this.authorizationValue;
    }

    /**
     * The password value.
     * 
     */
    @InputImport(name="passwordValue")
      private final @Nullable Input<String> passwordValue;

    public Input<String> getPasswordValue() {
        return this.passwordValue == null ? Input.empty() : this.passwordValue;
    }

    /**
     * The security qualifier.
     * 
     */
    @InputImport(name="securityQualifier", required=true)
      private final Input<String> securityQualifier;

    public Input<String> getSecurityQualifier() {
        return this.securityQualifier;
    }

    public X12SecuritySettingsArgs(
        Input<String> authorizationQualifier,
        @Nullable Input<String> authorizationValue,
        @Nullable Input<String> passwordValue,
        Input<String> securityQualifier) {
        this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier, "expected parameter 'authorizationQualifier' to be non-null");
        this.authorizationValue = authorizationValue;
        this.passwordValue = passwordValue;
        this.securityQualifier = Objects.requireNonNull(securityQualifier, "expected parameter 'securityQualifier' to be non-null");
    }

    private X12SecuritySettingsArgs() {
        this.authorizationQualifier = Input.empty();
        this.authorizationValue = Input.empty();
        this.passwordValue = Input.empty();
        this.securityQualifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizationQualifier;
        private @Nullable Input<String> authorizationValue;
        private @Nullable Input<String> passwordValue;
        private Input<String> securityQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SecuritySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationQualifier = defaults.authorizationQualifier;
    	      this.authorizationValue = defaults.authorizationValue;
    	      this.passwordValue = defaults.passwordValue;
    	      this.securityQualifier = defaults.securityQualifier;
        }

        public Builder authorizationQualifier(Input<String> authorizationQualifier) {
            this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier);
            return this;
        }

        public Builder authorizationQualifier(String authorizationQualifier) {
            this.authorizationQualifier = Input.of(Objects.requireNonNull(authorizationQualifier));
            return this;
        }

        public Builder authorizationValue(@Nullable Input<String> authorizationValue) {
            this.authorizationValue = authorizationValue;
            return this;
        }

        public Builder authorizationValue(@Nullable String authorizationValue) {
            this.authorizationValue = Input.ofNullable(authorizationValue);
            return this;
        }

        public Builder passwordValue(@Nullable Input<String> passwordValue) {
            this.passwordValue = passwordValue;
            return this;
        }

        public Builder passwordValue(@Nullable String passwordValue) {
            this.passwordValue = Input.ofNullable(passwordValue);
            return this;
        }

        public Builder securityQualifier(Input<String> securityQualifier) {
            this.securityQualifier = Objects.requireNonNull(securityQualifier);
            return this;
        }

        public Builder securityQualifier(String securityQualifier) {
            this.securityQualifier = Input.of(Objects.requireNonNull(securityQualifier));
            return this;
        }
        public X12SecuritySettingsArgs build() {
            return new X12SecuritySettingsArgs(authorizationQualifier, authorizationValue, passwordValue, securityQualifier);
        }
    }
}
