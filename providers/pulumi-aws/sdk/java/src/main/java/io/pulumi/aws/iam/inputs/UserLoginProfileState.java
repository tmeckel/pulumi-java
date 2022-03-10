// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserLoginProfileState extends io.pulumi.resources.ResourceArgs {

    public static final UserLoginProfileState Empty = new UserLoginProfileState();

    /**
     * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @InputImport(name="encryptedPassword")
      private final @Nullable Input<String> encryptedPassword;

    public Input<String> getEncryptedPassword() {
        return this.encryptedPassword == null ? Input.empty() : this.encryptedPassword;
    }

    /**
     * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @InputImport(name="keyFingerprint")
      private final @Nullable Input<String> keyFingerprint;

    public Input<String> getKeyFingerprint() {
        return this.keyFingerprint == null ? Input.empty() : this.keyFingerprint;
    }

    /**
     * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="passwordLength")
      private final @Nullable Input<Integer> passwordLength;

    public Input<Integer> getPasswordLength() {
        return this.passwordLength == null ? Input.empty() : this.passwordLength;
    }

    /**
     * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="passwordResetRequired")
      private final @Nullable Input<Boolean> passwordResetRequired;

    public Input<Boolean> getPasswordResetRequired() {
        return this.passwordResetRequired == null ? Input.empty() : this.passwordResetRequired;
    }

    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="pgpKey")
      private final @Nullable Input<String> pgpKey;

    public Input<String> getPgpKey() {
        return this.pgpKey == null ? Input.empty() : this.pgpKey;
    }

    /**
     * The IAM user's name.
     * 
     */
    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public UserLoginProfileState(
        @Nullable Input<String> encryptedPassword,
        @Nullable Input<String> keyFingerprint,
        @Nullable Input<Integer> passwordLength,
        @Nullable Input<Boolean> passwordResetRequired,
        @Nullable Input<String> pgpKey,
        @Nullable Input<String> user) {
        this.encryptedPassword = encryptedPassword;
        this.keyFingerprint = keyFingerprint;
        this.passwordLength = passwordLength;
        this.passwordResetRequired = passwordResetRequired;
        this.pgpKey = pgpKey;
        this.user = user;
    }

    private UserLoginProfileState() {
        this.encryptedPassword = Input.empty();
        this.keyFingerprint = Input.empty();
        this.passwordLength = Input.empty();
        this.passwordResetRequired = Input.empty();
        this.pgpKey = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserLoginProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encryptedPassword;
        private @Nullable Input<String> keyFingerprint;
        private @Nullable Input<Integer> passwordLength;
        private @Nullable Input<Boolean> passwordResetRequired;
        private @Nullable Input<String> pgpKey;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(UserLoginProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedPassword = defaults.encryptedPassword;
    	      this.keyFingerprint = defaults.keyFingerprint;
    	      this.passwordLength = defaults.passwordLength;
    	      this.passwordResetRequired = defaults.passwordResetRequired;
    	      this.pgpKey = defaults.pgpKey;
    	      this.user = defaults.user;
        }

        public Builder encryptedPassword(@Nullable Input<String> encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }

        public Builder encryptedPassword(@Nullable String encryptedPassword) {
            this.encryptedPassword = Input.ofNullable(encryptedPassword);
            return this;
        }

        public Builder keyFingerprint(@Nullable Input<String> keyFingerprint) {
            this.keyFingerprint = keyFingerprint;
            return this;
        }

        public Builder keyFingerprint(@Nullable String keyFingerprint) {
            this.keyFingerprint = Input.ofNullable(keyFingerprint);
            return this;
        }

        public Builder passwordLength(@Nullable Input<Integer> passwordLength) {
            this.passwordLength = passwordLength;
            return this;
        }

        public Builder passwordLength(@Nullable Integer passwordLength) {
            this.passwordLength = Input.ofNullable(passwordLength);
            return this;
        }

        public Builder passwordResetRequired(@Nullable Input<Boolean> passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }

        public Builder passwordResetRequired(@Nullable Boolean passwordResetRequired) {
            this.passwordResetRequired = Input.ofNullable(passwordResetRequired);
            return this;
        }

        public Builder pgpKey(@Nullable Input<String> pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }

        public Builder pgpKey(@Nullable String pgpKey) {
            this.pgpKey = Input.ofNullable(pgpKey);
            return this;
        }

        public Builder user(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder user(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public UserLoginProfileState build() {
            return new UserLoginProfileState(encryptedPassword, keyFingerprint, passwordLength, passwordResetRequired, pgpKey, user);
        }
    }
}
